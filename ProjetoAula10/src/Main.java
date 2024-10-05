
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Cliente> clientes = new ArrayList<>();
    private static List<Servico> servicos = new ArrayList<>();
    private static List<Atendimento> atendimentos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Cadastrar Serviço");
            System.out.println("3. Agendar Atendimento");
            System.out.println("4. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (escolha) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    cadastrarServico();
                    break;
                case 3:
                    agendarAtendimento();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private static void cadastrarCliente() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        Cliente cliente = new Cliente(nome, email, telefone, endereco);
        clientes.add(cliente);
        System.out.println("Cliente cadastrado: " + cliente);
    }

    private static void cadastrarServico() {
        System.out.print("Nome do Serviço: ");
        String nome = scanner.nextLine();
        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();
        System.out.print("Valor: ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer

        Servico servico = new Servico(nome, descricao, valor);
        servicos.add(servico);
        System.out.println("Serviço cadastrado: " + servico);
    }

    private static void agendarAtendimento() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }

        if (servicos.isEmpty()) {
            System.out.println("Nenhum serviço cadastrado.");
            return;
        }

        System.out.println("Selecione um cliente:");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println((i + 1) + ". " + clientes.get(i));
        }
        int clienteIndex = scanner.nextInt() - 1;

        System.out.println("Selecione um serviço:");
        for (int i = 0; i < servicos.size(); i++) {
            System.out.println((i + 1) + ". " + servicos.get(i));
        }
        int servicoIndex = scanner.nextInt() - 1;

        if (clienteIndex < 0 || clienteIndex >= clientes.size()) {
            System.out.println("Cliente inválido.");
            return;
        }

        if (servicoIndex < 0 || servicoIndex >= servicos.size()) {
            System.out.println("Serviço inválido.");
            return;
        }

        Atendimento atendimento = new Atendimento(clientes.get(clienteIndex), servicos.get(servicoIndex));
        atendimentos.add(atendimento);
        System.out.println("Atendimento agendado: " + atendimento);
    }
}
