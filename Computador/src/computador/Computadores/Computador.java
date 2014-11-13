/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador.Computadores;

import computador.Generalizacoes.Device;
import java.util.ArrayList;

/**
 *
 * @author Paulo
 */
public abstract class Computador implements Device {

    protected static int numComputadoresLigados = 0;
    protected int HD;
    protected int RAM;
    protected int VRAM;
    protected float processadorGHz;
    protected String placaDeVideoModelo;
    protected String processadorModelo;
    protected boolean OnOff;//true para On e false para Off
    protected String []programasPadroesInstalados = new String[3];

    public Computador() {
        this.HD = 500;
        this.RAM = 4;
        this.VRAM = 1;
        this.processadorGHz = 1.9f;
        this.placaDeVideoModelo = "NVidia gtx650";
        this.processadorModelo = "Intel core I5-4460T";
        this.instalarProgramasPadroes();
    }

    public Computador(int HD, int RAM, int VRAM, float processadorGHz, String placaDeVideoModelo, String processadorModelo) {
        this.setHD(HD);
        this.setRAM(RAM);
        this.setVRAM(VRAM);
        this.setProcessadorGHz(processadorGHz);
        this.setPlacaDeVideoModelo(placaDeVideoModelo);
        this.setProcessadorModelo(processadorModelo);
        this.instalarProgramasPadroes();
    }

    @Override
    public boolean ligar() {
        if (!isOn()) {
            System.out.println("Ligando o computador.");
            this.OnOff = true;
            Computador.numComputadoresLigados++;
            System.out.println("Iniciando SO.");
            this.iniciaSO();
            return true;
        } else {
            System.out.println("O seu computador ja esta ligado.");
            return false;
        }
    }

    @Override
    public boolean desligar() {
        if (isOn()) {
            System.out.println("Finalizando SO.");
            System.out.println("Desligando o computador.");
            this.OnOff = false;
            Computador.numComputadoresLigados--;
            return true;
        } else {
            System.out.println("Voce nao precisa desligar um computador que ja esta desligado.");
            return false;
        }
    }

    @Override
    public boolean isOn() {
        return OnOff;
    }

    public void reiniciar() {
        if (isOn()) {
            this.desligar();
            this.ligar();
        } else {
            System.out.println("Nao faz sentido reiniciar um computador que esta desligado.");
        }
    }
    
    public static void mostrarComputadores(ArrayList<Computador> computadores){
        int i = 1;
        for (Computador computador : computadores) {
            System.out.println(i + " - " + computador + ((computador.isOn()) ? " Ligado" : " Desligado"));
            i++;
        }
    }

    protected abstract void iniciaSO();

    public abstract boolean executaPrograma(int i);
    
    protected abstract void instalarProgramasPadroes();

    public static int getNumComputadoresLigador() {
        return numComputadoresLigados;
    }

    public int getHD() {
        return HD;
    }

    public void setHD(int HD) {
        if (HD < 1) {
            System.out.println("Seu computador nao pode ter menos de 1GB de espaço de armazenamento no HD");
            System.out.println("Seu HD tem agora 10GB de armazenamento.");
            this.HD = 10;
        } else {
            this.HD = HD;
        }
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        if (RAM < 1) {
            System.out.println("Seu computador nao pode ter menos de 1GB de memória RAM");
            System.out.println("Sua RAM tem agora 1GB.");
            this.RAM = 1;
        } else {
            this.RAM = RAM;
        }
    }

    public int getVRAM() {
        return VRAM;
    }

    public void setVRAM(int VRAM) {
        if (VRAM < 0) {
            System.out.println("Seu computador nao pode ter memória VRAM negativa");
            System.out.println("Sua VRAM é agoraigual a 0.");
            this.VRAM = 0;
        } else {
            this.VRAM = VRAM;
        }
    }

    public float getProcessadorGHz() {
        return processadorGHz;
    }

    public void setProcessadorGHz(float processadorGHz) {
        if (processadorGHz < 0.5f) {
            System.out.println("Seu computador nao pode ter um processador com clock menor que 0.5 GHz, até meu celular tem mais poder de processamento...");
            System.out.println("O clock do processamento do seu processador agora é 0.5 GHz.");
            this.processadorGHz = 0.5f;
        } else {
            this.processadorGHz = processadorGHz;
        }
    }

    public String getPlacaDeVideoModelo() {
        return placaDeVideoModelo;
    }

    public void setPlacaDeVideoModelo(String placaDeVideoModelo) {
        if (placaDeVideoModelo.equals("")) {
            System.out.println("Você nao instalou nenhuma placa de video.");
            this.placaDeVideoModelo = "Nenhum";
        } else {
            this.placaDeVideoModelo = placaDeVideoModelo;
        }
    }

    public String getProcessadorModelo() {
        return processadorModelo;
    }

    public void setProcessadorModelo(String processadorModelo) {
        if (placaDeVideoModelo.equals("")) {
            System.out.println("Você nao instalou nenhum processador.");
            System.out.println("Você agora tem um Intel Core i3");
            this.processadorModelo = "Intel Core i3";
        } else {
            this.processadorModelo = processadorModelo;
        }
    }

}
