public class Paciente extends Pessoa {
    private String gravidade;
    private float peso, altura;
    private boolean alta;

    // Método Construtor
    public Paciente(String nome, int idade, String gravidade, float peso, float altura) {
        super(nome, idade);
        this.gravidade = gravidade;
        this.peso = peso;
        this.altura = altura;
        this.alta = false;
    }

    // Métodos Getters e Setters
    public String getGravidade() {
        return gravidade;
    }
    public void setGravidade(String gravidade) {
        this.gravidade = gravidade;
    }

    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public boolean isAlta() {
        return alta;
    }
    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    @Override
    public String toString() {
        return "---------------------------" + "\n" +
               "Paciente: " + this.nome + ", Idade: " + this.idade + "\n" +
               "Gravidade: " + this.gravidade + "\n" +
               "Peso: " + this.peso + " kg, Altura: " + this.altura + " m" + "\n" +
               "---------------------------";
    }
}
