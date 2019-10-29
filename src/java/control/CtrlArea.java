/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.application.FacesMessage;

/**
 *
 * @author Adrian
 */
@Named(value = "referencia")
@RequestScoped
public class CtrlArea {

    private int lado;

    /**
     * Asignamos valor a lado
     *
     * @return el valor del lado.
     */
    public int getLado() {
        return lado;
    }

    /**
     * Asignamos el valor a lado.
     *
     * @param lado el valor de nombre
     */
    public void setLado(int lado) {
        this.lado = lado;
    }

    /**
     * Genera un saludo usando del valor de lado. Antes de Invocar hay que
     * asignarle valor a las propiedades.
     */
    public void calcula(){
        final String area = "El area es: " + (getLado()*getLado()) + ".";
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(area));
    }

}
