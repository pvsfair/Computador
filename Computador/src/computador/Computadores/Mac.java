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

    private static final String SISTEMA_OPERACIONAL = "MacOs";
    private int versaoSO;
    private Monitor monitor;
    private Teclado teclado;

    public Mac() {
        this.versaoSO = 0;
        this.monitor = new Monitor();
        this.teclado = new Teclado();
    }

    public Mac(int versaoSO, Monitor monitor, Teclado teclado) {
        this.versaoSO = versaoSO;
        this.monitor = monitor;
        this.teclado = teclado;
    }

    public Mac(int versaoSO, Monitor monitor, Teclado teclado, int HD, int RAM, int VRAM, float processadorGHz, String placaDeVideoModelo, String processadorModelo) {
        super(HD, RAM, VRAM, processadorGHz, placaDeVideoModelo, processadorModelo);
        this.versaoSO = versaoSO;
        this.monitor = monitor;
        this.teclado = teclado;
    }

    @Override
    protected void iniciaSO() {

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

    public int getVersaoSO() {
        return versaoSO;
    }

    public void setVersaoSO(int versaoSO) {
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
