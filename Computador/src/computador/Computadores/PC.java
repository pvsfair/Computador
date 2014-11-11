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
public class PC extends Computador {

    private final int sistemaOperacional;
    private Monitor monitor;
    private Teclado teclado;

    public PC() {
        this.sistemaOperacional = 0;
        this.monitor = new Monitor();
        this.teclado = new Teclado();
    }

    public PC(int sistemaOperacional, Monitor monitor, Teclado teclado) {
        this.sistemaOperacional = sistemaOperacional;
        this.monitor = monitor;
        this.teclado = teclado;
    }

    public PC(int sistemaOperacional, Monitor monitor, Teclado teclado, int HD, int RAM, int VRAM, float processadorGHz, String placaDeVideoModelo, String processadorModelo) {
        super(HD, RAM, VRAM, processadorGHz, placaDeVideoModelo, processadorModelo);
        this.sistemaOperacional = sistemaOperacional;
        this.monitor = monitor;
        this.teclado = teclado;
    }

    @Override
    protected void iniciaSO() {
        System.out.println("Iniciando o " + this);
        System.out.println("Aguarde enquanto o SO e inicializado.");
    }

    @Override
    public boolean executaPrograma() {
        return true;
    }

    @Override
    public String toString() {
        //quando adicionar enum, corrigir os toString;
        return "sistema Padrao";
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
