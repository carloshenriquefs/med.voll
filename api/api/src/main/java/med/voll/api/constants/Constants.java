package med.voll.api.constants;

public class Constants {

    public static final String CREDENCIAIS_INVALIDAS = "Credenciais inválidas";
    public static final String FALHA_AUTENTICACAO = "Falha na Autenticação";
    public static final String ACESSO_NEGADO = "Acesso Negado";

    public static final String ID_DO_PACIENTE_NAO_EXISTE = "[ID] do paciente informado não existe.";
    public static final String ID_DO_MEDICO_NAO_EXISTE = "[ID] do médico informado não existe.";
    public static final String MEDICO_INEXISTENTE_NESSA_DATA = "Não existe médico disponível nessa data!";
    public static final String ID_DA_CONSULTA_NAO_EXISTE = "[ID] da consulta informado não existe.";
    public static final String ESPECIALIDADE_OBRIGATORIA = "Especialidade é obrigatória quando médico não for escolhido.";

    public static final String MEDICO_JA_POSSUI_CONSULTA = "Médico já possui outra consulta agendada nesse mesmo horário.";
    public static final String CONSULTA_AGENDADA_COM_ANTECEDENCIA = "Consulta deve ser agendada com antecedência minima de 30 minutos.";
    public static final String CONSULTA_FORA_HORARIO = "Consulta fora do horário de funcionamento da clínica.";
    public static final String CONSULTA_NAO_AGENDADA_COM_MEDICO_INEXISTENTE = "Consulta não pode ser agendada com médico excluído.";
    public static final String CONSULTA_NAO_AGENDADA_PACIENTE_INEXISTENTE = "Consulta não pode ser agendada com paciente excluído.";
    public static final String PACIENTE_COM_CONSULTA_AGENDADA = "Paciente já possui uma consulta agendada nesse dia.";
    public static final String CONSULTA_COM_ANTECEDENCIA_MINIMA = "Consulta somente pode ser cancelada com antecedência mínima de 24h!";
}
