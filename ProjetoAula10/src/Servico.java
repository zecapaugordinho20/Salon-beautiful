
public class Servico {
    private String nome;
    private String descricao;
    private double valor;

    public Servico(String nome, String descricao, double valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                '}';
    }
}
