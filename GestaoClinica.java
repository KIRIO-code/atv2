import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class GestaoClinica {

    private static List<Medico> medicos = new ArrayList<>();
    private static List<Paciente> pacientes = new ArrayList<>();
    private static List<Consulta> consultas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    public static void main(String[] args) {
        int opcao;

        // Dados de exemplo para teste (Médicos)
        medicos.add(new Medico("Anna Souza", 7777, "Dermatologia", 7000.00));
        medicos.add(new Medico("Arthur Barbosa", 2222, "Cardiologia", 8000.00));
        medicos.add(new Medico("Davi Leite", 3333, "Cardiologia", 4000.00));
        medicos.add(new Medico("Eduardo Henrique", 8888, "Neurologia", 3000.00));
        medicos.add(new Medico("Gabriela Souza", 4444, "Anestesiologia", 3000.00));
        medicos.add(new Medico("Maria Eduarda", 5555, "Neurologia", 3000.00));
        medicos.add(new Medico("Maria Paula", 9999, "Oftalmologia", 2000.00));
        medicos.add(new Medico("Miguel Leite", 1111, "Infectologia", 2000.00));
        medicos.add(new Medico("Nicolas Alves", 6666, "Mastologia", 5000.00));

        // Dados de exemplo para teste (Pacientes)
        pacientes.add(new Paciente("Anna Gabriela", "555.555.555-55", "Catarata"));
        pacientes.add(new Paciente("Davi Leite", "333.333.333-33", "Arritmia"));
        pacientes.add(new Paciente("Eduardo Luiz", "777.777.777-77", "Conjuntivite"));
        pacientes.add(new Paciente("João Paulo", "444.444.444-44", "Doença de Chagas"));
        pacientes.add(new Paciente("Leonardo Alves", "111.111.111-11", "Epilepsia"));
        pacientes.add(new Paciente("Nicolas Alves", "666.666.666-66", "Glaucoma"));
        pacientes.add(new Paciente("Otávio Breno", "888.888.888-88", "Espasmo das Pálpebras"));
        pacientes.add(new Paciente("Sara Souza", "999.999.999-9", "Pericardite"));
        pacientes.add(new Paciente("Thiago Lucas", "222.222.222-22", "Doença de Huntington"));

        // Dados de exemplo para teste (Consultas)
        Medico medico1 = buscarMedicoPorMatricula(2222);
        Paciente paciente1 = buscarPacientePorCPF("222.222.222-22");
        Medico medico2 = buscarMedicoPorMatricula(2222);
        Paciente paciente2 = buscarPacientePorCPF("444.444.444-44");
        Medico medico3 = buscarMedicoPorMatricula(5555);
        Paciente paciente3 = buscarPacientePorCPF("111.111.111-11");
        Medico medico4 = buscarMedicoPorMatricula(9999);
        Paciente paciente4 = buscarPacientePorCPF("333.333.333-33");
        Medico medico5 = buscarMedicoPorMatricula(1111);
        Paciente paciente5 = buscarPacientePorCPF("888.888.888-88");
        Medico medico6 = buscarMedicoPorMatricula(4444);
        Paciente paciente6 = buscarPacientePorCPF("444.444.444-44");
        Medico medico7 = buscarMedicoPorMatricula(6666);
        Paciente paciente7 = buscarPacientePorCPF("777.777.777-77");
        Medico medico8 = buscarMedicoPorMatricula(6666);
        Paciente paciente8 = buscarPacientePorCPF("111.111.111-11");
        Medico medico9 = buscarMedicoPorMatricula(1111);
        Paciente paciente9 = buscarPacientePorCPF("777.777.777-77");
        Medico medico10 = buscarMedicoPorMatricula(3333);
        Paciente paciente10 = buscarPacientePorCPF("999.999.999-9");
        Medico medico11 = buscarMedicoPorMatricula(9999);
        Paciente paciente11 = buscarPacientePorCPF("666.666.666-66");
        Medico medico12 = buscarMedicoPorMatricula(4444);
        Paciente paciente12 = buscarPacientePorCPF("555.555.555-55");

        if (medico1 != null && paciente1 != null) {
            LocalDateTime horario1 = LocalDateTime.parse("25/10/2021 20:00", formatter);
            consultas.add(new Consulta(medico1.getId(), paciente1.getId(), horario1, 200.00));
        }
        if (medico2 != null && paciente2 != null) {
            LocalDateTime horario2 = LocalDateTime.parse("24/10/2021 20:00", formatter);
            consultas.add(new Consulta(medico2.getId(), paciente2.getId(), horario2, 200.00));
        }
        if (medico3 != null && paciente3 != null) {
            LocalDateTime horario3 = LocalDateTime.parse("22/10/2021 09:00", formatter);
            consultas.add(new Consulta(medico3.getId(), paciente3.getId(), horario3, 300.00));
        }
        if (medico4 != null && paciente4 != null) {
            LocalDateTime horario4 = LocalDateTime.parse("21/10/2021 08:00", formatter);
            consultas.add(new Consulta(medico4.getId(), paciente4.getId(), horario4, 150.00));
        }
        if (medico5 != null && paciente5 != null) {
            LocalDateTime horario5 = LocalDateTime.parse("20/10/2021 16:30", formatter);
            consultas.add(new Consulta(medico5.getId(), paciente5.getId(), horario5, 200.00));
        }
        if (medico6 != null && paciente6 != null) {
            LocalDateTime horario6 = LocalDateTime.parse("16/10/2021 20:00", formatter);
            consultas.add(new Consulta(medico6.getId(), paciente6.getId(), horario6, 300.00));
        }
        if (medico7 != null && paciente7 != null) {
            LocalDateTime horario7 = LocalDateTime.parse("16/10/2021 20:00", formatter);
            consultas.add(new Consulta(medico7.getId(), paciente7.getId(), horario7, 250.00));
        }
        if (medico8 != null && paciente8 != null) {
            LocalDateTime horario8 = LocalDateTime.parse("16/10/2021 19:00", formatter);
            consultas.add(new Consulta(medico8.getId(), paciente8.getId(), horario8, 150.00));
        }
        if (medico9 != null && paciente9 != null) {
            LocalDateTime horario9 = LocalDateTime.parse("16/10/2021 17:00", formatter);
            consultas.add(new Consulta(medico9.getId(), paciente9.getId(), horario9, 300.00));
        }
        if (medico10 != null && paciente10 != null) {
            LocalDateTime horario10 = LocalDateTime.parse("13/10/2021 13:00", formatter);
            consultas.add(new Consulta(medico10.getId(), paciente10.getId(), horario10, 300.00));
        }
        if (medico11 != null && paciente11 != null) {
            LocalDateTime horario11 = LocalDateTime.parse("12/10/2021 14:30", formatter);
            consultas.add(new Consulta(medico11.getId(), paciente11.getId(), horario11, 200.00));
        }
        if (medico12 != null && paciente12 != null) {
            LocalDateTime horario12 = LocalDateTime.parse("12/10/2021 14:00", formatter);
            consultas.add(new Consulta(medico12.getId(), paciente12.getId(), horario12, 200.00));
        }

        do {
            exibirMenu();
            opcao = lerOpcao();

            switch (opcao) {
                case 1:
                    System.out.println("Encerrando o programa...");
                    break;
                case 2:
                    cadastrarNovoMedico();
                    break;
                case 3:
                    cadastrarNovoPaciente();
                    break;
                case 4:
                    buscarMedicoPorMatricula();
                    break;
                case 5:
                    buscarPacientePorCPF();
                    break;
                case 6:
                    cadastrarNovaConsulta();
                    break;
                case 7:
                    removerConsulta();
                    break;
                case 8:
                    atualizarHorarioConsulta();
                    break;
                case 9:
                    gerarRelatorioConsultas();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 1);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Sair do programa");
        System.out.println("2. Cadastrar novo médico");
        System.out.println("3. Cadastrar novo paciente");
        System.out.println("4. Buscar médico por matrícula");
        System.out.println("5. Buscar paciente por CPF");
        System.out.println("6. Cadastrar uma nova consulta");
        System.out.println("7. Remover uma consulta cadastrada");
        System.out.println("8. Atualizar o horário de uma consulta cadastrada");
        System.out.println("9. Gerar relatório de consultas");
        System.out.println("Escolha uma opção:");
    }

    private static int lerOpcao() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1; // Opção inválida
        }
    }

    private static void cadastrarNovoMedico() {
        System.out.println("Digite o nome do médico:");
        String nome = scanner.nextLine();

        System.out.println("Digite a matrícula do médico:");
        int matricula = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite a especialidade do médico:");
        String especialidade = scanner.nextLine();

        System.out.println("Digite o salário do médico:");
        double salario = Double.parseDouble(scanner.nextLine());

        Medico novoMedico = new Medico(nome, matricula, especialidade, salario);
        medicos.add(novoMedico);

        System.out.println("Médico cadastrado com sucesso!");
    }

    private static void cadastrarNovoPaciente() {
        System.out.println("Digite o nome do paciente:");
        String nome = scanner.nextLine();

        System.out.println("Digite o CPF do paciente:");
        String cpf = scanner.nextLine();

        System.out.println("Digite a doença do paciente:");
        String doenca = scanner.nextLine();

        Paciente novoPaciente = new Paciente(nome, cpf, doenca);
        pacientes.add(novoPaciente);

        System.out.println("Paciente cadastrado com sucesso!");
    }

    private static void buscarMedicoPorMatricula() {
        System.out.println("Digite a matrícula do médico que deseja buscar:");
        int matricula = Integer.parseInt(scanner.nextLine());

        Medico medico = buscarMedicoPorMatricula(matricula);

        if (medico != null) {
            System.out.println("Dados do médico:");
            System.out.println(medico);
        } else {
            System.out.println("Médico com matrícula " + matricula + " não encontrado.");
        }
    }

    private static Medico buscarMedicoPorMatricula(int matricula) {
        for (Medico medico : medicos) {
            if (medico.getMatricula() == matricula) {
                return medico;
            }
        }
        return null;
    }

    private static void buscarPacientePorCPF() {
        System.out.println("Digite o CPF do paciente que deseja buscar:");
        String cpf = scanner.nextLine();

        Paciente paciente = buscarPacientePorCPF(cpf);

        if (paciente != null) {
            System.out.println("Dados do paciente:");
            System.out.println(paciente);
        } else {
            System.out.println("Paciente com CPF " + cpf + " não encontrado.");
        }
    }

    private static Paciente buscarPacientePorCPF(String cpf) {
        for (Paciente paciente : pacientes) {
            if (paciente.getCpf().equals(cpf)) {
                return paciente;
            }
        }
        return null;
    }

    private static void cadastrarNovaConsulta() {
        System.out.println("Digite a matrícula do médico:");
        int matricula = Integer.parseInt(scanner.nextLine());
   
        System.out.println("Digite o CPF do paciente:");
        String cpf = scanner.nextLine();
   
        System.out.println("Digite o horário da consulta (dd/MM/yyyy HH:mm):");
        String horarioStr = scanner.nextLine();
        LocalDateTime horario = null;
        try {
            horario = LocalDateTime.parse(horarioStr, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Formato de data/hora inválido. Use dd/MM/yyyy HH:mm.");
            return;
        }
   
        System.out.println("Digite o valor da consulta:");
        double valor = Double.parseDouble(scanner.nextLine());
   
        Medico medico = buscarMedicoPorMatricula(matricula);
        Paciente paciente = buscarPacientePorCPF(cpf);
   
        if (medico != null && paciente != null) {
            Consulta novaConsulta = new Consulta(medico.getId(), paciente.getId(), horario, valor);
            consultas.add(novaConsulta);
            System.out.println("Consulta cadastrada com sucesso!");
        } else {
            System.out.println("Médico ou paciente não encontrado. Verifique a matrícula e o CPF.");
        }
    }

    private static void removerConsulta() {
        System.out.println("Digite a matrícula do médico:");
        int matricula = Integer.parseInt(scanner.nextLine());
   
        System.out.println("Digite o CPF do paciente:");
        String cpf = scanner.nextLine();
   
        System.out.println("Digite o horário da consulta a ser removida (dd/MM/yyyy HH:mm):");
        String horarioStr = scanner.nextLine();
        LocalDateTime horario = null;
        try {
            horario = LocalDateTime.parse(horarioStr, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Formato de data/hora inválido. Use dd/MM/yyyy HH:mm.");
            return;
        }
   
        Medico medico = buscarMedicoPorMatricula(matricula);
        Paciente paciente = buscarPacientePorCPF(cpf);
   
        if (medico != null && paciente != null) {
            boolean removido = consultas.removeIf(consulta ->
                consulta.getIdMedico() == medico.getId() &&
                consulta.getIdPaciente() == paciente.getId() &&
                consulta.getHorario().equals(horario)
            );
   
            if (removido) {
                System.out.println("Consulta removida com sucesso!");
            } else {
                System.out.println("Consulta não encontrada.");
            }
        } else {
            System.out.println("Médico ou paciente não encontrado. Verifique a matrícula e o CPF.");
        }
    }

    private static void atualizarHorarioConsulta() {
        System.out.println("Digite a matrícula do médico:");
        int matricula = Integer.parseInt(scanner.nextLine());
   
        System.out.println("Digite o CPF do paciente:");
        String cpf = scanner.nextLine();
   
        System.out.println("Digite o horário original da consulta (dd/MM/yyyy HH:mm):");
        String horarioOriginalStr = scanner.nextLine();
        LocalDateTime horarioOriginal = null;
        try {
            horarioOriginal = LocalDateTime.parse(horarioOriginalStr, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Formato de data/hora inválido. Use dd/MM/yyyy HH:mm.");
            return;
        }
   
        System.out.println("Digite o novo horário da consulta (dd/MM/yyyy HH:mm):");
        String novoHorarioStr = scanner.nextLine();
        LocalDateTime novoHorario = null;
        try {
            novoHorario = LocalDateTime.parse(novoHorarioStr, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Formato de data/hora inválido. Use dd/MM/yyyy HH:mm.");
            return;
        }
   
        Medico medico = buscarMedicoPorMatricula(matricula);
        Paciente paciente = buscarPacientePorCPF(cpf);
   
        if (medico != null && paciente != null) {
            for (Consulta consulta : consultas) {
                if (consulta.getIdMedico() == medico.getId() &&
                    consulta.getIdPaciente() == paciente.getId() &&
                    consulta.getHorario().equals(horarioOriginal)) {
   
                    consulta.setHorario(novoHorario);
                    System.out.println("Horário da consulta atualizado com sucesso!");
                    return;
                }
            }
            System.out.println("Consulta não encontrada.");
        } else {
            System.out.println("Médico ou paciente não encontrado. Verifique a matrícula e o CPF.");
        }
    }

    private static void gerarRelatorioConsultas() {
        System.out.println("\nRelatório de Consultas:");
        for (int i = 0; i < consultas.size(); i++) {
            Consulta consulta = consultas.get(i);
            Medico medico = medicos.stream().filter(m -> m.getId() == consulta.getIdMedico()).findFirst().orElse(null);
            Paciente paciente = pacientes.stream().filter(p -> p.getId() == consulta.getIdPaciente()).findFirst().orElse(null);
   
            if (medico != null && paciente != null) {
                System.out.println("Consulta " + (i + 1) + ":");
                System.out.println("  Nome do médico: " + medico.getNome() + " (" + medico.getMatricula() + ")");
                System.out.println("  Nome do paciente: " + paciente.getNome() + " (" + paciente.getCpf() + ")");
                System.out.println("  Horário: " + consulta.getHorario().format(formatter));
                System.out.println("  Valor: R$ " + String.format("%.2f", consulta.getValor()));
            } else {
                System.out.println("Erro: Médico ou paciente não encontrado para a consulta.");
            }
            System.out.println();
        }
    }

}

class Medico {
    private static int proximoId = 1;
    private int id;
    private String nome;
    private int matricula;
    private String especialidade;
    private double salario;

    public Medico(String nome, int matricula, String especialidade, double salario) {
        this.id = proximoId++;
        this.nome = nome;
        this.matricula = matricula;
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nNome: " + nome + "\nMatrícula: " + matricula +
               "\nEspecialidade: " + especialidade + "\nSalário: R$ " + String.format("%.2f", salario);
    }
}

class Paciente {
    private static int proximoId = 1;
    private int id;
    private String nome;
    private String cpf;
    private String doenca;

    public Paciente(String nome, String cpf, String doenca) {
        this.id = proximoId++;
        this.nome = nome;
        this.cpf = cpf;
        this.doenca = doenca;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDoenca() {
        return doenca;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nNome: " + nome + "\nCPF: " + cpf + "\nDoença: " + doenca;
    }
}

class Consulta {
    private int idMedico;
    private int idPaciente;
    private LocalDateTime horario;
    private double valor;

    public Consulta(int idMedico, int idPaciente, LocalDateTime horario, double valor) {
        this.idMedico = idMedico;
        this.idPaciente = idPaciente;
        this.horario = horario;
        this.valor = valor;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public double getValor() {
        return valor;
    }
}

