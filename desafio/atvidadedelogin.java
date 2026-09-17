
package desafio;

import java.util.Scanner;

public class atvidadedelogin {

    
    
    
    public static void main(String[] args) {
        
        Aluno a1= new Aluno();
        a1.id = 100;
        a1.nome = "vargas";
        a1.telefone = 67676767;
        a1.dia = 18;
        a1.mes = 01;
        a1.ano= 2010;
                
        //                            id      nome tel d  m  a       idade
        System.out.printf("%d - %s %d - %d%d%d - %d\n",
         a1.id = 100,
        a1.nome = "vargas",
        a1.telefone = 8067,
        a1.dia = 18,
        a1.mes = 0,
        a1.ano= 2010,
        a1.calculaidade () );
    }
    
    
    public static void main2(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] id = new int[3];
        String[] nome = new String[3];
        long[] telefone = new long[3];
        int[] dia = new int[3];
        int[] mes = new int[3];
        int[] ano = new int[3]; //
        int total = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("\n--- cadastro aluno " + (i + 1) + " ---");

            System.out.println("id:");
            id[i] = entrada.nextInt();
            entrada.nextLine();

            System.out.println("nome:");
            nome[i] = entrada.nextLine();

            System.out.println("telefone:");
            telefone[i] = entrada.nextLong();

            System.out.println("dia:");
            dia[i] = entrada.nextInt();

            System.out.println("mes:");
            mes[i] = entrada.nextInt();

            System.out.println("ano:");
            ano[i] = entrada.nextInt();

            total++;

            System.out.println("deseja cadastrar outro aluno? (1 - sim / 2 - nao)");
            int continuar = entrada.nextInt();

            if (continuar == 2) {
                break;
            }
        }

        System.out.println("\n------------------------------------------------------------");
        System.out.println("id | nome | telefone | data nasc");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < total; i++) {
            String textoDia = (dia[i] < 10) ? "0" + dia[i] : "" + dia[i];
            String textoMes = (mes[i] < 10) ? "0" + mes[i] : "" + mes[i];

            String datadeNascimento = textoDia + "/" + textoMes + "/" + ano[i];
            System.out.println(id[i] + " | " + nome[i] + " | " + telefone[i] + " | " + datadeNascimento);
        }

        System.out.println("------------------------------------------------------------");
        entrada.close();
    }
}
