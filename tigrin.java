
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sesi2dia
 */
import java.util.Scanner;

public class tigrin {

    public static Random random = new Random();
    
    
    public static void main(String[] args) {
        System.out.println("Tigrim!");
        
        Scanner teclado = new Scanner(System.in);
        
        int[] mSorteio = new int[10];
        int[] mUsuario = new int[4];
        
        int pontos = 0;
        
        
        // Carga com numeros aleatÃ³rios
        for (int iSorteio = 0; iSorteio < mSorteio.length; iSorteio++) {
            
            mSorteio[iSorteio] = sorteiaNumero(mSorteio, iSorteio);
            
            System.out.printf("%2d - ", mSorteio[iSorteio]);
            
        }
        System.out.println("");
        
        // Conversar com usuÃ¡rio
        for (int iUsuario = 0; iUsuario < 4; iUsuario++) {
            
            System.out.printf("Seu numero: ");
            mUsuario[iUsuario] = teclado.nextInt();
        }
        
        // Verificar se existe
        for (int iUsuario = 0; iUsuario < mUsuario.length; iUsuario++) {
            
            for (int iSorteio = 0; iSorteio < mSorteio.length; iSorteio++) {
                
                if (mUsuario[iUsuario] == mSorteio[iSorteio]) {
                    // Opa! Acertou miseravii
                    pontos++;
                    break;
                }
                
            }
            
        }
        
        // Mostra pontuaÃ§Ã£o
        double pAcerto = pontos * 100.00 / mUsuario.length;
        
        System.out.printf("Acertos: %3.0f%%\n", pAcerto);
        
    }
    
    /**
     * Sorteia um numero unico com base nos numeros fornecidos pela mSorteados
     * 
     * @param mSorteados - matriz de numeros jÃ¡ sorteados
     * @param max - posicao do sorteio atual para economizar processamento
     * @return numero Ãºnico nÃ£o repetido.
     */
    public static int sorteiaNumero(int[] mSorteados, int max) {
        
        // inicia em True sÃ³ pra entrar no While
        boolean flagRepetido = true;
        int temp = 0;
        
        while (flagRepetido) {    
            flagRepetido = false;    // Todo mundo Ã© novidade atÃ© que se prove ao contrÃ¡rio!
            
            temp = random.nextInt(12);
            // Verifica se existe na matriz mSorteados
            for (int iSorteados = 0; 
                    iSorteados < mSorteados.length && iSorteados < max; 
                    iSorteados++) {
        
                if (mSorteados[iSorteados] == temp) {
                    // Ops! numero repetido.
                    // Sorteia de novo.
                    flagRepetido = true;
                    break;  // Esse break quebra o FOR
                }
            }   // Fim do FOR
            
        }   // Fim do While
        
        return temp;
        
    }
    
}
  