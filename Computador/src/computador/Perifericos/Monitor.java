/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador.Perifericos;

import computador.Generalizacoes.Device;

/**
 *
 * @author Paulo
 */
public class Monitor implements Device {

    private String marca;
    private String modelo;
    private int altura;
    private int largura;
    private boolean OnOff;

    public Monitor() {
        this.marca = "AOC";
        this.modelo = "716Sw";
        this.altura = 720;
        this.largura = 1280;
        this.OnOff = false;
    }

    public Monitor(String marca, String modelo, int altura, int largura, boolean OnOff) {
        this.marca = marca;
        this.modelo = modelo;
        this.altura = altura;
        this.largura = largura;
        this.OnOff = OnOff;
    }

    @Override
    public boolean ligar() {
        if (!isOn()) {
            System.out.println("Ligando o monitor.");
            this.OnOff = true;
            return true;
        } else {
            System.out.println("O seu monitor ja esta ligado.");
            return false;
        }
    }

    @Override
    public boolean desligar() {
        if (isOn()) {
            System.out.println("Desligando o monitor.");
            this.OnOff = false;
            return true;
        } else {
            System.out.println("Voce nao precisa desligar um monitor que ja esta desligado.");
            return false;
        }
    }

    @Override
    public boolean isOn() {
        return OnOff;
    }
    
    public void atualizaTela(){
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

}
