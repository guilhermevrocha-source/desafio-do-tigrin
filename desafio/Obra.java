/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KGe
 */
public class Obra {
    
    public static void main(String[] args) {
        
    }
    
    String proprietario;
    String local;
    String cidade;
    String uf;
    
    List<Comodo> listaComodos = new ArrayList<>();

    public Obra() {
    }

    public Obra(String proprietario, String local, String cidade, String uf) {
        this.proprietario = proprietario;
        this.local = local;
        this.cidade = cidade;
        this.uf = uf;
    }
    
    public double calcularAreaTotal() {
        double areaTotal = 0;
        
        for (Comodo c : this.listaComodos) {
            areaTotal += c.calcularArea();
        }
        
        return areaTotal;
    }

    @Override
    public String toString() {
        return "Obra{" + "proprietario=" + proprietario + ", local=" + local + ", cidade=" + cidade + ", uf=" + uf + ", listaComodos=" + listaComodos + '}';
    }
}