public class Medico extends Funcionario {
    private String especialidade;
    private boolean plantao;

    // Método construtor
    public Medico(String nome, int idade, int id, float salario, String especialidade) {
        super(nome, idade, id, salario);
        this.especialidade = especialidade;
        this.plantao = false;
    }

    // Pagamento de salário
    @Override
    public void receber() {
        System.out.println("Doutor(a) " + this.nome + " recebeu " + this.salario + " pelo plantão realizado.");
    }

    // Métodos Getters e Setters
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public boolean isPlantao() {
        return plantao;
    }
    public void setPlantao(boolean plantao) {
        this.plantao = plantao;
    }

    @Override
    public String toString() {
        return "---------------------------" + "\n" +
               "Doutor(a): " + this.nome + ", Id: " + this.id + "\n" +
               "Especialidade: " + this.especialidade + "\n" +
               "Plantão: " + this.plantao + "\n" +
               "---------------------------";
    }
}
