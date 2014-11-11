/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador.Computadores;

import java.io.IOException;

/**
 *
 * @author Paulo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ola Mundo");
        try {
            System.in.read();
        } catch (IOException ex) {
            System.out.println("Erro");
        }
    }
    
}
