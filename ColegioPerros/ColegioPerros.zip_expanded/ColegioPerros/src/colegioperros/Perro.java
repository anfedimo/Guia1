/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegioperros;

/**
 *
 * @author ViguerPC
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Perro {

    String localidad;
    String nombre;
    String raza;
    String cedulaDueño;
    String nombreDueño;
    int numContacto;
    int diaAsis;


    public Perro() {
        super();
    }

    public Perro(String localidad, String nombre, String raza, String cedulaDueño, String nombreDueño, int numContacto,
                 int diaAsis) {
        super();
        this.localidad = localidad;
        this.nombre = nombre;
        this.raza = raza;
        this.cedulaDueño = cedulaDueño;
        this.nombreDueño = nombreDueño;
        this.numContacto = numContacto;
        this.diaAsis = diaAsis;
    }


    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setCedulaDueño(String cedulaDueño) {
        this.cedulaDueño = cedulaDueño;
    }

    public String getCedulaDueño() {
        return cedulaDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNumContacto(int numContacto) {
        this.numContacto = numContacto;
    }

    public int getNumContacto() {
        return numContacto;
    }

    public void setDiaAsis(int diaAsis) {
        this.diaAsis = diaAsis;
    }

    public int getDiaAsis() {
        return diaAsis;
    }


    public Perro getPerro(String nombre, List<Perro> perros) {
        for (Perro perro : perros) {
            if (perro.getNombre().equals(nombre))
                return perro;
        }
        return null;
    }

    public int numRaza(String raza, List<Perro> perros) {

        int cantPerr = 0;

        for (Perro perro : perros) {
            if (perro.getRaza().equals(raza))
                cantPerr++;
        }
        return cantPerr;
    }

    public List<String> nomPerros(String localidad, List<Perro> perros) {

        List<String> perroLoc = new ArrayList<String>();

        for (Perro perro : perros) {
            if (perro.getLocalidad().equals(localidad))
                perroLoc.add(perro.getNombre());
        }


        return perroLoc;
    }

    public static void main(String[] args) {
        Perro perro = new Perro();

        List<Perro> perros = new ArrayList<Perro>();
        pantalla newPantalla = new pantalla();
        newPantalla.setVisible(true);
        

    }

}
