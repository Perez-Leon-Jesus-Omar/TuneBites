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
public class Tune_Bites {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vendedor emple = new Vendedor();
        emple.setLogin("Lola Beltran");
        emple.getFecha();
        emple.setVender(3);
        emple.setComprar(2);
        emple.setDisco(new DiscoM("Pollito pio",154.92f,"AGDS4532",21.67f));
        emple.setPoner(new Escuchar("Musas","Son Amores",3.46f));
        System.out.println(emple);
    }   
}
