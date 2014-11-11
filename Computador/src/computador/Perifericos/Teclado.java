/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador.Perifericos;

/**
 *
 * @author Paulo
 */
public class Teclado {

    private String marca;
    private String modelo;
    private String tipoTeclado;

    public Teclado() {
    }

    public Teclado(String marca, String modelo, String tipoTeclado) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoTeclado = tipoTeclado;
    }

    public String digitar() {
        return "";
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

    public String getTipoTeclado() {
        return tipoTeclado;
    }

    public void setTipoTeclado(String tipoTeclado) {
        this.tipoTeclado = tipoTeclado;
    }
}
