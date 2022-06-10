public class Funcionario extends Pessoa {
    protected int id;
    protected float salario;

    // Método construtor
    public Funcionario(String nome, int idade, int id, float salario) {
        super(nome, idade);
        this.id = id;
        this.salario = salario;
    }

    // Pagamento de salário
    public void receber() {
        System.out.println("Funcionário(a) " + this.nome + " recebeu " + this.salario + " pelo mês corrente.");
    }

    // Métodos Getters e Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "---------------------------" + "\n" +
               "Funcionário(a): " + this.nome + ", Id: " + this.id + "\n" +
               "---------------------------";
    }
}
