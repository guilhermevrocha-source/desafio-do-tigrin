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
    public int calculaidade() {
        int idade = 2026 - this.ano;

        return idade;

    }

}
