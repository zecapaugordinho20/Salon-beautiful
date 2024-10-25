import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteSalãoDeBeleza {
    @Test
    public void testAgendamento() {
        List<Cliente> clientes = new ArrayList<>();
        List<Servico> servicos = new ArrayList<>();
        List<Atendimento> atendimentos = new ArrayList<>();

        Cliente cliente = new Cliente("Maria Silva", "maria@gmail.com", "123456789", "Rua das Flores, 123");
        clientes.add(cliente);
        assertEquals(1, clientes.size());

        Servico servico = new Servico("Corte de Cabelo", "Corte moderno com estilista.", 50.0);
        servicos.add(servico);
        assertEquals(1, servicos.size());

        Atendimento atendimento = new Atendimento(cliente, servico);
        atendimentos.add(atendimento);
        assertEquals(1, atendimentos.size());

        System.out.println("Teste finalizado com sucesso.");
    }
}
