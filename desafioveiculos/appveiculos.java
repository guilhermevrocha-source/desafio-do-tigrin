package desafioveiculos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class appveiculos {

    public static Scanner teclado = new Scanner(System.in);
    public static List<veiculos> listaVeiculos = new ArrayList<>();

    public static void main(String[] args) {

        int opcao = 0;

        while (opcao != 99) {

            System.out.println("\n------------------------------------------");
            System.out.println("Controle de Veículos");
            System.out.println("------------------------------------------");
            System.out.println("10-Incluir veículo");
            System.out.println("11-Listar veículos");
            System.out.println("20-Saída de veículo");
            System.out.println("21-Relatório de veículos em Linha.");
            System.out.println("30-Entrada de veículo");
            System.out.println("31-Relatório de veículos no pátio.");
            System.out.println("99-Sair");
            System.out.println("");
            System.out.print("Digite uma opção: ");

            opcao = teclado.nextInt();

            switch (opcao) {
                case 10 -> incluirVeiculo();
                case 11 -> {
                    System.out.println("Você escolheu Listar Veículos");
                    listarVeiculos();
                }
                case 20 -> {
                    System.out.println("\nSaída de Veículos\n");
                    saidaVeiculo();
                }
                case 21 -> relatorioVeiculoLinha();
                case 30 -> {
                    System.out.println("\nEntrada de Veículos\n");
                    entrarVeiculo();
                }
                case 31 -> relatorioPatio();
                case 99 -> System.out.println("Saindo do sistema...");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    // 10 - Incluir veículo
    public static void incluirVeiculo() {
        System.out.println("\n--- Cadastro de Veículos ---");

        System.out.print("Placa: ");
        String placa = teclado.next();

        System.out.print("Marca: ");
        String marca = teclado.next();

        System.out.print("Modelo: ");
        String modelo = teclado.next();

        veiculos veic = new veiculos(placa, marca, modelo);
        listaVeiculos.add(veic);
        System.out.println("Veículo cadastrado com sucesso!");
    }

    // 11 - Listar veículos
    public static void listarVeiculos() {
        System.out.println("-".repeat(50));
        System.out.println("Relatório de Veículos");
        System.out.println("-".repeat(50));
        System.out.println("Placa\tModelo\tMarca");
        System.out.println("-".repeat(50));

        if (listaVeiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
        } else {
            for (veiculos v : listaVeiculos) {
                // Certifique-se de que sua classe 'veiculos' possui os métodos get
                System.out.println(v.getPlaca() + "\t" + v.getModelo() + "\t" + v.getMarca());
            }
        }
    }

    // 20 - Saída de veículo
    public static void saidaVeiculo() {
        System.out.print("Digite a placa do veículo para dar saída: ");
        String placa = teclado.next();
        
        boolean encontrado = false;
        for (veiculos v : listaVeiculos) {
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                // Exemplo: remover da lista ou alterar status
                listaVeiculos.remove(v);
                System.out.println("Saída registrada/Veículo removido com sucesso!");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Veículo não encontrado com essa placa.");
        }
    }

    // 21 - Relatório em Linha
    public static void relatorioVeiculoLinha() {
        System.out.println("\n--- Relatório em Linha ---");
        for (veiculos v : listaVeiculos) {
            System.out.println("Placa: " + v.getPlaca() + " | Marca: " + v.getMarca() + " | Modelo: " + v.getModelo());
        }
    }

    // 30 - Entrada de veículo
    public static void entrarVeiculo() {
        System.out.println("Registrar entrada de veículo existente...");
        // Adicione aqui a regra de negócio específica do seu exercício para 'Entrada'
    }

    // 31 - Relatório de veículos no pátio
    public static void relatorioPatio() {
        System.out.println("\n--- Veículos no Pátio ---");
        listarVeiculos();
    }
}