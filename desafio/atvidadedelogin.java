
package desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atvidadedelogin {

    public static void main2(String[] args) {
        Aluno a1 = new Aluno();
        a1.id = 100;
        a1.nome = "vargas";
        a1.telefone = 67676767;
        a1.dia = 18;
        a1.mes = 1;
        a1.ano = 2010;
                
        System.out.println(a1.toString());
   
        Aluno a2 = new Aluno(110, "tung tung", 999, 10, 11, 2000);
        System.out.println(a2.toString()); // Adicionado () em toString()
    }

    public static void main(String[] args) {
        List<Aluno> listaAluno = new ArrayList<>();
        Scanner tecladoTexto = new Scanner(System.in);
        Scanner tecladoNumero = new Scanner(System.in);

        int contador = 1;

        while (true) {
            Aluno novoAluno = new Aluno();

            System.out.println("\n--- Cadastro do aluno " + contador + " ---");
            System.out.print("ID (ou 0 para encerrar): ");
            novoAluno.id = tecladoNumero.nextInt();

            // Condição para encerrar a leitura
            if (novoAluno.id == 0) {
                break;
            }

            System.out.print("Nome: ");
            novoAluno.nome = tecladoTexto.nextLine();

            System.out.print("Telefone: ");
            novoAluno.telefone = tecladoNumero.nextLong();

            System.out.print("Dia: ");
            novoAluno.dia = tecladoNumero.nextInt();

            System.out.print("Mês: ");
            novoAluno.mes = tecladoNumero.nextInt();

            System.out.print("Ano: ");
            novoAluno.ano = tecladoNumero.nextInt();

            listaAluno.add(novoAluno);
            contador++;
        }

        System.out.println("\n------------------------------------------------------------");
        System.out.println("ID | Nome | Telefone | Data Nasc");
        System.out.println("------------------------------------------------------------");

        // Iterando sobre a Lista de Objetos Aluno
        for (Aluno aluno : listaAluno) {
            String textoDia = (aluno.dia < 10) ? "0" + aluno.dia : "" + aluno.dia;
            String textoMes = (aluno.mes < 10) ? "0" + aluno.mes : "" + aluno.mes;

            String datadeNascimento = textoDia + "/" + textoMes + "/" + aluno.ano;
            System.out.println(aluno.id + " | " + aluno.nome + " | " + aluno.telefone + " | " + datadeNascimento);
        }
    }
}