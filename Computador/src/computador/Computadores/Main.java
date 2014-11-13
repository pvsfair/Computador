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
import java.util.Scanner;

/**
 *
 * @author Paulo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcao = 0;
        ArrayList<Computador> computadores = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        computadores.add(new PC());
        computadores.add(new PC(PC.SO.WINDOWS_7, new Monitor(), new Teclado(), 1024, 2048, 1024, 1.2f, "gtx650", "Intel Core i5"));
        computadores.add(new Mac());
        computadores.add(new Mac(Mac.MacOsX.MOUNTAIN_LION, new Monitor(), new Teclado()));
        do {
            System.out.println("Você tem estes computadores na sua rede:");
            Computador.mostrarComputadores(computadores);
            System.out.println("1 - Ligar/Desligar Computador");
            System.out.println("2 - Executar Programa em Computador");
            System.out.println("3 - Sair");
            switch (opcao) {
                case 1:
                    System.out.println("Qual Computador você deseja ligar/desligar?");
                    int pcUsar = input.nextInt();
                    System.out.println("Você deseja ligar ou desligar o " + computadores.get(pcUsar) + "? <l/d>");
                    String ld = input.nextLine();
                    if (ld.equalsIgnoreCase("l")) {
                        computadores.get(pcUsar).ligar();
                    } else if (ld.equalsIgnoreCase("d")) {
                        computadores.get(pcUsar).desligar();
                    } else {
                        System.out.println("Entrada inválida.");
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
            }
        } while (opcao != 3);
        System.out.println("Desligando todos os Computadores...");
        for (Computador computador : computadores) {
            if (computador.isOn()) {
                computador.desligar();
            }
        }
        System.out.println("\nVocê deseja ligar algum computador?");
        String sn = input.nextLine();
        if (sn.equalsIgnoreCase("s")) {
            System.out.println("Qual computador você deseja ligar?");
            int pcLigar = input.nextInt();
            computadores.get(pcLigar - 1).ligar();
        }
        System.out.println("Você deseja usar algum computador?");
        computadores.get(1).executaPrograma(1);

    }

}
