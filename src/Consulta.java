public interface Consulta {
    public abstract void examinar();
    public abstract void diagnosticar(String diagnostico);
    public abstract void receitar();
    public abstract void receitar(String comprimido, int quantidade, int horario);
    public abstract void receitar(String injecao, int quantidade);
    public abstract void liberar();
    public abstract void internar();
}
