/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio;

import java.util.Scanner;

public class AppObra {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Entrada de Dados - Dados da Obra
        Obra minhaObra = new Obra();

        System.out.println("-".repeat(20));
        System.out.printf("AppObra\n");
        System.out.println("-".repeat(20));

        System.out.printf("\nInforme Dados da Obra\n\n");
        System.out.printf("Proprietário: ");
        minhaObra.proprietario = teclado.nextLine();

        System.out.printf("Local: ");
        minhaObra.local = teclado.nextLine();

        System.out.printf("Cidade: ");
        minhaObra.cidade = teclado.nextLine();

        System.out.printf("UF: ");
        minhaObra.uf = teclado.nextLine();

        // Dados dos Comôdos
        System.out.println("-".repeat(20));
        System.out.printf("Dados dos Cômôdos\n");
        System.out.println("-".repeat(20));

        Comodo comodoAuxiliar;

        do {
            comodoAuxiliar = new Comodo();
            System.out.printf("Nome Cômôdo: ");
            comodoAuxiliar.nome = teclado.nextLine();

            // Encerra o laço se o nome for vazio/em branco
            if (comodoAuxiliar.nome.isBlank()) {
                break;
            }

            System.out.printf("Largura: ");
            comodoAuxiliar.largura = Double.parseDouble(teclado.nextLine());

            System.out.printf("Comprimento: ");
            comodoAuxiliar.comprimento = Double.parseDouble(teclado.nextLine());

            // Adicionar na lista de comôdos da Obra
            minhaObra.listaComodos.add(comodoAuxiliar);

            System.out.println();

        } while (true);

        // Saída de Dados
        System.out.println("\n" + "=".repeat(30));
        System.out.println("RESUMO DA OBRA");
        System.out.println("=".repeat(30));
        System.out.println("Proprietário: " + minhaObra.proprietario);
        System.out.println("Endereço: " + minhaObra.local + " - " + minhaObra.cidade + "/" + minhaObra.uf);
        System.out.println("-".repeat(30));
        
        System.out.println("Cômôdos cadastrados:");
        for (Comodo c : minhaObra.listaComodos) {
            System.out.println(" - " + c);
        }

        System.out.printf("\nÁrea Total da Obra: %.2f m²\n", minhaObra.calcularAreaTotal());
        
        teclado.close();
    }
}