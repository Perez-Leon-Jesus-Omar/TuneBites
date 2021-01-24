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
class DiscoM {
    private String NomD;
    private float Precio;
    private String codigo;
    private float duracion;

    public DiscoM() {
    }

    public DiscoM(String NomD, float Precio, String codigo, float duracion) {
        this.NomD = NomD;
        this.Precio = Precio;
        this.codigo = codigo;
        this.duracion = duracion;
    }

    public String getNomD() {
        return NomD;
    }

    public void setNomD(String NomD) {
        this.NomD = NomD;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "\nDisco Musica" + "\nNombre Disco: " + NomD + "\nPrecio=" + Precio + "\nCodigo=" + codigo + "\nDuracion total:" + duracion;
    }
}
