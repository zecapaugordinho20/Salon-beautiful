
public class Atendimento {
    private Cliente cliente;
    private Servico servico;

    public Atendimento(Cliente cliente, Servico servico) {
        this.cliente = cliente;
        this.servico = servico;
    }

    @Override
    public String toString() {
        return "Atendimento{" +
                "cliente=" + cliente +
                ", servico=" + servico +
                '}';
    }
}
