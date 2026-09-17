
package desafio;

import static java.time.Instant.MAX;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atvidadedelogin {

    
    
    
    public static void main2(String[] args) {
        
        Aluno a1= new Aluno();
        a1.id = 100;
        a1.nome = "vargas";
        a1.telefone = 67676767;
        a1.dia = 18;
        a1.mes = 01;
        a1.ano= 2010;
                
        System.out.printf(a1.toString());
   
        Aluno a2 = new Aluno (110 ,"tung tung",999,10, 11,2000 );
        System.out.println(a2.toString);
    }
    
    
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

       //Aluno[] ListaAluno = new Aluno[MAX];
        List<Aluno> ListaAluno = new ArrayList <>();
                Scanner tecladoTexto = new Scanner(System.in);
                Scanner tecladoNumero= new Scanner(System.in);

        do {
            
            Aluno nvovoAluno =new Aluno();
            System.out.println("\n--- cadastro aluno " + (i + 1) + " ---");

            System.out.println("id:");
            novoAluno.id =tecladoTexto.nextInt();
            

            System.out.println("nome:");
               novoAluno.nome= tecladoTexto.nextLine();

            System.out.println("telefone:");
               novoAluno.telefone= tecladoNumero.nextLong();

            System.out.println("dia:");
                novoAluno.dia = tecladoNumero.nextInt();

            System.out.println("mes:");
               novoAluno.mes = tecladoNumero.nextInt();

            System.out.println("ano:");
              novoAluno.ano = tecladoNumero.nextInt();
              
              ListaAluno.add(novoAluno);

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
