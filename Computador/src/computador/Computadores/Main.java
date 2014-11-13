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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.midi.SysexMessage;

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
        int opcaoInterna = 0;
        int pcUsar;
        int iter = 0;
        ArrayList<Computador> computadores = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        computadores.add(new PC());
        computadores.add(new PC(PC.SO.WINDOWS_7, new Monitor(), new Teclado(), 1024, 2048, 1024, 1.2f, "gtx650", "Intel Core i5"));
        computadores.add(new Mac());
        computadores.add(new Mac(Mac.MacOsX.MOUNTAIN_LION, new Monitor(), new Teclado()));
        do {
            try {
                Thread.sleep(2500);
            } catch (InterruptedException ex) {
                System.out.println("Problema no Sleep.");
            }
            //O comando abaixo limpa a tela no java...
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("\nVocê tem estes computadores na sua rede:");
            Computador.mostrarComputadores(computadores);
            System.out.println("\n\n\n1 - Ligar/Desligar Computador");
            System.out.println("2 - Executar Programa em Computador");
            System.out.println("3 - Sair");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Qual Computador você deseja ligar/desligar?");
                    pcUsar = input.nextInt();
                    while (pcUsar >= computadores.size() && pcUsar < 0) {
                        System.out.println("entrada Inválida, tente novamente.");
                        pcUsar = input.nextInt();
                    }
                    pcUsar--;
                    System.out.println("Você deseja ligar ou desligar o " + computadores.get(pcUsar) + "? <l/d>");
                    String ld = input.next();
                    System.out.println();
                    if (ld.equalsIgnoreCase("l")) {
                        computadores.get(pcUsar).ligar();
                    } else if (ld.equalsIgnoreCase("d")) {
                        computadores.get(pcUsar).desligar();
                    } else {
                        System.out.println("Entrada inválida.");
                    }
                    break;
                case 2:
                    System.out.println("Qual Computador você deseja usar?");
                    pcUsar = input.nextInt();
                    while (pcUsar >= computadores.size() && pcUsar < 0) {
                        System.out.println("entrada Inválida, tente novamente.");
                        pcUsar = input.nextInt();
                    }
                    pcUsar--;
                    iter = 0;
                    for (String programa : computadores.get(pcUsar).getProgramasPadroesInstalados()) {
                        iter++;
                        System.out.println(iter + " - " + programa);
                    }
                    System.out.println("Qual dos programas você deseja que seja executado?");
                    opcaoInterna = input.nextInt() - 1;
                    
                    System.out.println("Executando: " + computadores.get(pcUsar).getProgramasPadroesInstalados()[opcaoInterna]);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 3);
        System.out.println("Desligando todos os Computadores...");
        for (Computador computador : computadores) {
            if (computador.isOn()) {
                computador.desligar();
            }
        }
    }

}
