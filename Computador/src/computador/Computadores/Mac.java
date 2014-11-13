/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador.Computadores;

import computador.Perifericos.*;

/**
 *
 * @author Paulo
 */
public class Mac extends Computador {

    private static final String SISTEMA_OPERACIONAL = "MacOsX";
    private MacOsX versaoSO;

    public enum MacOsX {

        CHEETAH, PUMA, JAGUAR, PANTHER, TIGER, LEOPARD, SNOW_LEOPARD, LION, MOUNTAIN_LION, MAVERICKS, YOSEMITE
    }
    private Monitor monitor;
    private Teclado teclado;

    public Mac() {
        this.versaoSO = MacOsX.SNOW_LEOPARD;
        this.monitor = new Monitor();
        this.teclado = new Teclado();
    }

    public Mac(MacOsX versaoSO, Monitor monitor, Teclado teclado) {
        this.versaoSO = versaoSO;
        this.monitor = monitor;
        this.teclado = teclado;
    }

    public Mac(MacOsX versaoSO, Monitor monitor, Teclado teclado, int HD, int RAM, int VRAM, float processadorGHz, String placaDeVideoModelo, String processadorModelo) {
        super(HD, RAM, VRAM, processadorGHz, placaDeVideoModelo, processadorModelo);
        this.versaoSO = versaoSO;
        this.monitor = monitor;
        this.teclado = teclado;
    }

    @Override
    public boolean ligar() {
        boolean ligou = super.ligar();
        if (ligou) {
            System.out.println("Sistema " + this + " carregado com sucesso.");
        } else {
            System.out.println("Houve um problema na inicialização do seu Mac.");
        }
        return ligou;
    }

    @Override
    public boolean desligar() {
        boolean desligou = super.desligar();
        if (desligou) {
            System.out.println("Seu Sistema Operacional " + this + " foi finalizado com maestria.");
            System.out.println("Seu Mac foi desligado com sucesso.");
        } else {
            System.out.println("Ocorreu algum erro durante o desligamento de seu Mac.");
        }
        return desligou;
    }

    @Override
    protected void iniciaSO() {
        System.out.println("Iniciando o " + this);
        System.out.println("Aguarde enquanto o SO e inicializado.");
    }

    @Override
    public boolean executaPrograma(int i) {
        if (i < 0 || i >= programasPadroesInstalados.length) {
            System.out.println("Index out of range.");
            return false;
        } else {
            System.out.println("Executando " + programasPadroesInstalados[i]);
        }
        return true;
    }

    @Override
    protected void instalarProgramasPadroes() {
        this.programasPadroesInstalados[0] = "Editor de Texto";
        this.programasPadroesInstalados[1] = "Opera";
        this.programasPadroesInstalados[2] = "Media player";
    }

    @Override
    public String toString() {
        return Mac.SISTEMA_OPERACIONAL + " " + this.versaoSO;
    }

    public MacOsX getVersaoSO() {
        return versaoSO;
    }

    public void setVersaoSO(MacOsX versaoSO) {
        this.versaoSO = versaoSO;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }
}
