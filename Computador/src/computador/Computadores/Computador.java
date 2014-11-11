/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador.Computadores;

import computador.Generalizacoes.Device;

/**
 *
 * @author Paulo
 */
public abstract class Computador implements Device {

    protected static int numComputadoresLigador = 0;
    protected int HD;
    protected int RAM;
    protected int placaDeVideoRAM;
    protected float processadorGHz;
    protected String placaDeVideoModelo;
    protected String processadorModelo;
    protected boolean OnOff;//true para On e false para Off

    public Computador() {
        this.HD = 500;
        this.RAM = 4;
        this.placaDeVideoRAM = 1;
        this.processadorGHz = 1.9f;
        this.placaDeVideoModelo = "NVidia gtx650";
        this.processadorModelo = "Intel core I5-4460T";
    }
    
    public Computador(int HD, int RAM, int VRAM, float processadorGHz, String placaDeVideoModelo, String processadorModelo) {
        this.HD = HD;
        this.RAM = RAM;
        this.placaDeVideoRAM = VRAM;
        this.processadorGHz = processadorGHz;
        this.placaDeVideoModelo = placaDeVideoModelo;
        this.processadorModelo = processadorModelo;
    }

    public static int getNumComputadoresLigador() {
        return numComputadoresLigador;
    }

    @Override
    public void ligar() {
        if(!isOn()) {
            System.out.println("Ligando o computador.");
            this.OnOff = true;
            Computador.numComputadoresLigador++;
            System.out.println("Iniciando SO.");
            this.iniciaSO();
        } else {
            System.out.println("O seu computador ja esta ligado.");
        }
    }

    @Override
    public void desligar() {
        if(isOn()){
            System.out.println("Finalizando SO.");
            System.out.println("Desligando o computador.");
            this.OnOff = false;
            Computador.numComputadoresLigador--;
        }
        else{
            System.out.println("Voce nao precisa desligar um computador que ja esta desligado.");
        }
    }

    @Override
    public boolean isOn() {
        return OnOff;
    }

    public void reiniciar() {
        if(isOn()){
            this.desligar();
            this.ligar();
        }
        else{
            System.out.println("Nao faz sentido reiniciar um computador que esta desligado.");
        }
    }

    protected abstract void iniciaSO();

    public abstract boolean executaPrograma();

    /**
     * @return O espaço de armazenamento do seu HD
     */
    public int getHD() {
        return HD;
    }

    /**
     * @param HD O tamanho do armazenamento do novo HD
     */
    public void setHD(int HD) {
        this.HD = HD;
    }

    /**
     * @return A quantidade de memória RAM
     */
    public int getRAM() {
        return RAM;
    }

    /**
     * @param RAM A quantidade de memória da nova memória RAM
     */
    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    /**
     * @return A quantidade de memória VRAM
     */
    public int getPlacaDeVideoRAM() {
        return placaDeVideoRAM;
    }

    /**
     * @param placaDeVideoRAM A nova quantidade de merória VRAM da nova placa de
     * video
     */
    public void setPlacaDeVideoRAM(int placaDeVideoRAM) {
        this.placaDeVideoRAM = placaDeVideoRAM;
    }

    /**
     * @return A frequencia do processador
     */
    public float getProcessadorGHz() {
        return processadorGHz;
    }

    /**
     * @param processadorGHz A quantidade de GHZ do novo processador
     */
    public void setProcessadorGHz(int processadorGHz) {
        this.processadorGHz = processadorGHz;
    }

    /**
     * @return O nome do modelo da placa de vídeo
     */
    public String getPlacaDeVideoModelo() {
        return placaDeVideoModelo;
    }

    /**
     * @param placaDeVideoModelo O nome da sua nova placa e video
     */
    public void setPlacaDeVideoModelo(String placaDeVideoModelo) {
        this.placaDeVideoModelo = placaDeVideoModelo;
    }

    /**
     * @return O nome do modelo processador
     */
    public String getProcessadorModelo() {
        return processadorModelo;
    }

    /**
     * @param processadorModelo O nome do modelo do seu novo processador
     */
    public void setProcessadorModelo(String processadorModelo) {
        this.processadorModelo = processadorModelo;
    }

}
