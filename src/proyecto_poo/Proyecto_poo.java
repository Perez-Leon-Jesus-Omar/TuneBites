/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_poo;

import java.io.*;
import Personal.*;
import Inventario.*;
import Caja.*;
import Ambientadores.*;

class KeyboardInput {

    private final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    // Lectura de un valor int del teclado. El valor por omision es 0
    public final synchronized int readInteger() {
        String input = "";
        int value = 0;

        try {
            input = in.readLine();
        } catch (IOException e) {
        }
        if (input != null) {
            try {
                value = Integer.parseInt(input);
            } catch (NumberFormatException e) {
            }
        }
        return value;
    }
}

public class Proyecto_poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("*************BIENVENIDO TIENDA MUSICA**************");
        System.out.println("¿Que usuario desea utilizar?");
        System.out.println("1 Gerente");
        System.out.println("2 Vendedor");
        System.out.println("3 Acomododador");
        
        int contra1, contra2;
        contra1 = 1234;
        contra2 = 4321;
        
        KeyboardInput input = new KeyboardInput(); 
        System.out.println("SELECIONE UNA OPCION ENTRE 1 Y 3: ");
        int usuario = input.readInteger();
        switch (usuario){
            case 1:
                System.out.println("Eligió Gerente, introduzaca la contraseña:");
                int contraseña = input.readInteger();
                if(contraseña == contra1){
                    System.out.println("Contraseña correcta, bienvenido!");
                    System.out.println("¿Que desea realizar?");
                }else{
                    System.out.println("Contraseña incorrecta");
                }
                break;
            case 2:
                System.out.println("Eligió Vendedor, introduzca la contraseña:");
                int contraseña2 = input.readInteger();
                if(contraseña2 == contra2){
                    System.out.println("Contraseña correcta, bienvenido!");
                    System.out.println("¿Que desea realizar?");
                }else{
                    System.out.println("Contraseña incorrecta ");
                }
                
                break;
            case 3:
                System.out.println("Eligió Acomodador");
                System.out.println("¿Que desea realizar?");
                break;
            default:
                System.out.println(usuario + " ERROR, usuario no elegido");
                break;
            
        }
        
    }
        
        
    }
    

