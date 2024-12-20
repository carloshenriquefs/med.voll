package med.voll.api.domain.consulta;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.validacoes.agendamento.ValidadorAgendamentoDeConsulta;
import med.voll.api.domain.consulta.validacoes.cancelamento.ValidadorCancelamentoDeConsulta;
import med.voll.api.domain.medico.Medico;
import med.voll.api.repository.ConsultaRepository;
import med.voll.api.repository.MedicoRepository;
import med.voll.api.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static med.voll.api.constants.Constants.*;

@Service
public class AgendaDeConsultas {

    @Autowired
    private ConsultaRepository consultaRepository;

    @Autowired
    private MedicoRepository medicoRepository;

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private List<ValidadorAgendamentoDeConsulta> validadores;

    @Autowired
    private List<ValidadorCancelamentoDeConsulta> validadoresCancelamento;

    public DadosDetalhamentoConsulta agendar(DadosAgendamentoConsulta dadosAgendamentoConsulta) {

        if (!pacienteRepository.existsById(dadosAgendamentoConsulta.idPaciente())) {
            throw new ValidacaoException(ID_DO_PACIENTE_NAO_EXISTE);
        }

        if (dadosAgendamentoConsulta.idMedico() != null && !medicoRepository.existsById(dadosAgendamentoConsulta.idMedico())) {
            throw new ValidacaoException(ID_DO_MEDICO_NAO_EXISTE);
        }

        validadores.forEach(v -> v.validar(dadosAgendamentoConsulta));

        var paciente = pacienteRepository.getReferenceById(dadosAgendamentoConsulta.idPaciente());
        var medico = escolherMedico(dadosAgendamentoConsulta);

        if (medico == null) {
            throw new ValidacaoException(MEDICO_INEXISTENTE_NESSA_DATA);
        }

        var consulta = new Consulta(null, medico, paciente, dadosAgendamentoConsulta.data(), null);

        consultaRepository.save(consulta);

        return new DadosDetalhamentoConsulta(consulta);
    }

    public void cancelar(DadosCancelamentoConsulta dados) {
        if (!consultaRepository.existsById(dados.idConsulta())) {
            throw new ValidacaoException(ID_DA_CONSULTA_NAO_EXISTE);
        }

        validadoresCancelamento.forEach(v -> v.validar(dados));

        var consulta = consultaRepository.getReferenceById(dados.idConsulta());
        consulta.cancelar(dados.motivo());
    }

    private Medico escolherMedico(DadosAgendamentoConsulta dadosAgendamentoConsulta) {
        if (dadosAgendamentoConsulta.idMedico() != null) {
            return medicoRepository.getReferenceById(dadosAgendamentoConsulta.idMedico());
        }

        if (dadosAgendamentoConsulta.especialidade() == null) {
            throw new ValidacaoException(ESPECIALIDADE_OBRIGATORIA);
        }

        return medicoRepository.escolherMedicoAleatorioLivreNaData(dadosAgendamentoConsulta.especialidade(), dadosAgendamentoConsulta.data());
    }
}
