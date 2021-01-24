/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tune_bites;

import java.util.Date;

/**
 *
 * @author Sarahi
 */
public class Vendedor extends Empleado {
    private int Vender;
    private int Comprar;
    private Escuchar Poner;
    private DiscoM Disco;

    public Vendedor() {
    }

    public Vendedor(int Vender, int Comprar, Escuchar Poner, DiscoM Disco) {
        this.Vender = Vender;
        this.Comprar = Comprar;
        this.Poner = Poner;
        this.Disco = Disco;
    }

    public Vendedor(int Vender, int Comprar, Escuchar Poner, DiscoM Disco, String Login, Date Fecha) {
        super(Login, Fecha);
        this.Vender = Vender;
        this.Comprar = Comprar;
        this.Poner = Poner;
        this.Disco = Disco;
    }

    public int getVender() {
        return Vender;
    }

    public void setVender(int Vender) {
        this.Vender = Vender;
    }

    public int getComprar() {
        return Comprar;
    }

    public void setComprar(int Comprar) {
        this.Comprar = Comprar;
    }

    public Escuchar getPoner() {
        return Poner;
    }

    public void setPoner(Escuchar Poner) {
        this.Poner = Poner;
    }

    public DiscoM getDisco() {
        return Disco;
    }

    public void setDisco(DiscoM Disco) {
        this.Disco = Disco;
    }

    @Override
    public String toString() {
        return super.toString()+"\nVendidos: " + Vender + "\nComprados: " + Comprar + "\n" + Poner + Disco;
    }
    
}
