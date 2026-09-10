

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author sesi2dia
 */
import java.util.Random;
import java.util.Scanner;

public class desafio_tigim {

    public static final int MAX = 4;

    public static void main(String[] args) {
        Random random = new Random();
        Scanner teclado = new Scanner(System.in);
        int[] numeroSorteado = new int[MAX];
        int[] mEscolha = new int[4];
        int acerto = 1;

        // for de carga do mSorteio //0-9
        for (int i = 0; i < numeroSorteado.length; i++) {
            int randomBoundedInt = random.nextInt(101);
            System.out.println("random integer  (0-101 : " + randomBoundedInt);
        }
        for (int i = 0; i < mEscolha.length; i++) {
            System.out.println("ola,escolha seus numeros da sorte :[" + (i + 1) + "]");
            mEscolha[i] = teclado.nextInt(101 );
            double pontuação = acerto * 100;
        }
        //total de acertos 
  System.out.println("\nTotal de acertos: " + acerto);
    System.out.println("Porcentagem de ganho: " + (acerto * 25) + "%");
    }

}
