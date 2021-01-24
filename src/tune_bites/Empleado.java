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
public class Empleado {
    private String Login;
    private Date Fecha;

    public Empleado() {
    }

    public Empleado(String Login, Date Fecha) {
        this.Login = Login;
        this.Fecha = Fecha;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public Date getFecha() {
        return Fecha = new Date();
    }

    @Override
    public String toString() {
        return "Login: " + Login + "\nDate: " +Fecha;
    }
    

    
}
