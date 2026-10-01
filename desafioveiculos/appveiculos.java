package desafioveiculos;
import java.util.ArrayList;
import java.util.Scanner;

public class appveiculos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<veiculos> listaVeiculos = new ArrayList<>();
        int opcao = 0;

        do {
            System.out.println("----------------------------------------");
            System.out.println("Controle de Veículos");
            System.out.println("----------------------------------------");
            System.out.println("10-Incluir veículo");
            System.out.println("11-Listar veículos");
            System.out.println("20-Saída de veículo");
            System.out.println("21-Relatório de veículos em Linha.");
            System.out.println("30-Entrada de veículo");
            System.out.println("31-Relatório de veículos no pátio.");
            System.out.println("99-Sair");
            System.out.print("Digite a opção: ");

            opcao = Integer.parseInt(teclado.nextLine());

            // 10 - INCLUIR VEÍCULO
            if (opcao == 10) {
                System.out.println("\n--- Cadastrar Veículos ---");
                do {
                    veiculos v = new veiculos();

                    System.out.print("Placa (ENTER para voltar): ");
                    v.placa = teclado.nextLine();

                    if (v.placa.isBlank()) {
                        break;
                    }

                    System.out.print("Marca: ");
                    v.marca = teclado.nextLine();

                    System.out.print("Modelo: ");
                    v.modelo = teclado.nextLine();

                    v.status = 0; // 0 = Pátio
                    v.motorista = "";

                    listaVeiculos.add(v);
                    System.out.println("Veículo cadastrado!\n");
                } while (true);
            }

            // 11 - LISTAR TODOS
            else if (opcao == 11) {
                System.out.println("\n--- LISTA DE TODOS OS VEÍCULOS ---");
                System.out.println("Placa    | Modelo       | Marca        | Motorista       | Status  ");
                System.out.println("-------------------------------------------------------------------");
                for (veiculos v : listaVeiculos) {
                    System.out.println(v);
                }
                System.out.println();
            }

            // 20 - SAÍDA DE VEÍCULO
            else if (opcao == 20) {
                System.out.print("\nPlaca para saída: ");
                String placaSaida = teclado.nextLine();

                veiculos vSaida = null;
                for (veiculos v : listaVeiculos) {
                    if (v.placa.equalsIgnoreCase(placaSaida)) {
                        vSaida = v;
                        break;
                    }
                }

                if (vSaida == null) {
                    System.out.println("Erro: Veículo não encontrado!\n");
                } else if (vSaida.status == 1) {
                    System.out.println("Atenção: O veículo já está na rua!\n");
                } else {
                    System.out.println("Veículo: " + vSaida.modelo + " / " + vSaida.marca);
                    System.out.print("Nome do motorista: ");
                    vSaida.motorista = teclado.nextLine();
                    vSaida.status = 1; // 1 = Linha (rua)
                    System.out.println("Saída registrada!\n");
                }
            }

            // 21 - RELATÓRIO EM LINHA
            else if (opcao == 21) {
                System.out.println("\n--- VEÍCULOS EM LINHA (RUA) ---");
                System.out.println("Placa    | Modelo       | Marca        | Motorista       | Status  ");
                System.out.println("-------------------------------------------------------------------");
                for (veiculos v : listaVeiculos) {
                    if (v.status == 1) {
                        System.out.println(v);
                    }
                }
                System.out.println();
            }

            // 30 - ENTRADA DE VEÍCULO
            else if (opcao == 30) {
                System.out.print("\nPlaca para entrada: ");
                String placaEntrada = teclado.nextLine();

                veiculos vEntrada = null;
                for (veiculos v : listaVeiculos) {
                    if (v.placa.equalsIgnoreCase(placaEntrada)) {
                        vEntrada = v;
                        break;
                    }
                }

                if (vEntrada == null) {
                    System.out.println("Erro: Veículo não encontrado!\n");
                } else if (vEntrada.status == 0) {
                    System.out.println("Atenção: Este veículo já está no pátio!\n");
                } else {
                    System.out.println("Veículo: " + vEntrada.modelo + " / " + vEntrada.marca);
                    System.out.print("Confirma a entrada no pátio? (S/N): ");
                    String confirmacao = teclado.nextLine();

                    if (confirmacao.equalsIgnoreCase("S")) {
                        vEntrada.status = 0;   // 0 = Pátio
                        vEntrada.motorista = ""; // Limpa o motorista
                        System.out.println("Entrada registrada!\n");
                    } else {
                        System.out.println("Operação cancelada.\n");
                    }
                }
            }

            // 31 - RELATÓRIO NO PÁTIO
            else if (opcao == 31) {
                System.out.println("\n--- VEÍCULOS NO PÁTIO ---");
                System.out.println("Placa    | Modelo       | Marca        | Motorista       | Status  ");
                System.out.println("-------------------------------------------------------------------");
                for (veiculos v : listaVeiculos) {
                    if (v.status == 0) {
                        System.out.println(v);
                    }
                }
                System.out.println();
            }

            // 99 - SAIR
            else if (opcao == 99) {
                System.out.println("Encerrando o programa...");
            } else {
                System.out.println("Opção inválida!\n");
            }

        } while (opcao != 99);

        teclado.close();
    }
}