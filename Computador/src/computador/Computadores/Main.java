/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador.Computadores;

import computador.Perifericos.Monitor;
import computador.Perifericos.Teclado;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Paulo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Computador> computadores = new ArrayList<>();
        computadores.add(new PC());
        computadores.add(new PC(PC.SO.UBUNTU, new Monitor(), new Teclado(), 1024, 2048, 1024, 1.2f, "gtx650", "Intel Core i5"));
        computadores.add(new Mac());
        computadores.add(new Mac(Mac.MacOsX.MOUNTAIN_LION, new Monitor(), new Teclado()));
        
        computadores.get(1).executaPrograma(1);
        
    }
    
}
