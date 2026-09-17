package desafio;

/**
 * define os dados para o objeto Aluno
 *
 * @author sesi2dia
 */
public class Aluno {

    int id;
    String nome;
    int dia;
    int mes;
    int ano;
long telefone;
    boolean toString;

    public Aluno() {
        System.out.println("Passei pelo construtor!");
    }

    public Aluno(int id, String nome, int dia, int mes, int ano, long telefone) {
        this.id = id;
        this.nome = nome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.telefone = telefone;
    }

   



    public int calculaidade() {
        int idade = 2026 - this.ano;

        return idade;

    }
    @Override 
    public String toString() {
            //                            id      nome tel d  m  a       idade
    return String.format ("%d - %s - %d - %d%d%d -  %d\n",
         this.id  ,
        this.nome  ,
        this.telefone ,
       this.dia ,
       this.mes ,
       this.ano ,
       this.calculaidade ()  );
    }
}

