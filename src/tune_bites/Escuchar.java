/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tune_bites;

/**
 *
 * @author Sarahi
 */
class Escuchar {
    private String NomD;
    private String NomB;
    private float duracion;

    public Escuchar() {
    }

    public Escuchar(String NomD, String NomB, float duracion) {
        this.NomD = NomD;
        this.NomB = NomB;
        this.duracion = duracion;
    }

    public String getNomD() {
        return NomD;
    }

    public void setNomD(String NomD) {
        this.NomD = NomD;
    }

    public String getNomB() {
        return NomB;
    }

    public void setNomB(String NomB) {
        this.NomB = NomB;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Disco Reproduciendo" + "\nNombre: " + NomD + "\nNombre de pista: " + NomB +  "\nDuracion: " + duracion;
    }
}
