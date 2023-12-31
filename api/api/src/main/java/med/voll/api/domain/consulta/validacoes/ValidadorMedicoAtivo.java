package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import med.voll.api.repository.MedicoRepository;

import static med.voll.api.constants.Constants.CONSULTA_NAO_AGENDADA_COM_MEDICO_INEXISTENTE;

public class ValidadorMedicoAtivo {

    private MedicoRepository medicoRepository;

    public void validar(DadosAgendamentoConsulta dados) {
        if(dados.idMedico() == null) {
            return;
        }

        var medicoEstaAtivo = medicoRepository.findAtivoById(dados.idMedico());
        if(!medicoEstaAtivo) {
            throw new ValidacaoException(CONSULTA_NAO_AGENDADA_COM_MEDICO_INEXISTENTE);
        }
    }
}
