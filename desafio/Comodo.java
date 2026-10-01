/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio;

/**
 *
 * @author sesi2dia
 */
public class Comodo {
   
    String nome;
    double largura;
    double comprimento;

    public Comodo() {
    }

    public Comodo(String nome, double largura, double comprimento) {
        this.nome = nome;
        this.largura = largura;
        this.comprimento = comprimento;
    }
    
        
    public double calcularArea() {
        
        return this.largura * this.comprimento;
        
    }

    @Override
    public String toString() {
        return "Comodo{" + "nome=" + nome + ", largura=" + largura + ", comprimento=" + comprimento + '}';
    }

    
    
    
    
    
}