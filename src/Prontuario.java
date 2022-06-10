public class Prontuario implements Consulta {
    private Paciente paciente;
    private Medico medico;
    private String diagnostico;
    private String receita;

    // Método construtor
    public Prontuario(Paciente paciente, Medico medico) {
        this.paciente = paciente;
        this.medico = medico;
        this.diagnostico = null;
        this.receita = null;
    }

    // Inicia a consulta do paciente
    @Override
    public void examinar() {
        System.out.println("Doutor(a) " + this.medico.nome + ", está examinando o paciente " + this.paciente.nome);
    }

    // Define o diagnóstico do paciente
    @Override
    public void diagnosticar(String diagnostico) {
        this.setDiagnostico(diagnostico);
    }

    // Paciente precisa de cirurgia
    @Override
    public void receitar() {
        this.receita = "Paciente " + this.paciente.nome + " necessita de operação.";
    }
    // Paciente precisa de comprimidos
    @Override
    public void receitar(String comprimido, int quantidade, int horario) {
        this.receita = "Paciente " + this.paciente.nome + " deve tomar " + quantidade + " comprimido(s) de " +
                       comprimido + " a cada " + horario + " hora(s)";
    }
    // Paciente precisa de injeção
    @Override
    public void receitar(String injecao, int quantidade) {
        this.receita = "Paciente " + this.paciente.nome + " deve tomar " + quantidade + " ml de " +
                       injecao;
    }

    // Libera o paciente
    @Override
    public void liberar() {
        this.paciente.setAlta(true);
    }
    // Interna o paciente
    @Override
    public void internar() {
        this.paciente.setAlta(false);
    }

    // Métodos Getters e Setters
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getReceita() {
        return receita;
    }
    public void setReceita(String receita) {
        this.receita = receita;
    }

    @Override
    public String toString() {
        return "---------------------------" + "\n" +
               "Paciente: " + this.paciente.nome + "\n" +
               "Doutor(a): " + this.medico.nome + "\n" +
               "Especialidade: " + this.medico.getEspecialidade() + "\n" +
               "Diagnóstico: " + this.diagnostico + "\n" +
               "Receita: " + this.receita + "\n" +
               "Alta: " + this.paciente.isAlta() + "\n" +
               "---------------------------";
    }
}
