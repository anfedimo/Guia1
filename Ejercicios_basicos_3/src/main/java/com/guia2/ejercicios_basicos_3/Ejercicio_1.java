/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guia2.ejercicios_basicos_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Adiaz
 */
public class Ejercicio_1 {
    
    public static void main(String[] args) {

        int numero1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de Numeros N que desea ingresar");
        numero1 = Integer.valueOf(sc.nextLine());
        String b[] = new String[numero1];
        List<Double> t = new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
            System.out.println("Ingrese el valor de la posicion " + i);
            t.add(Double.valueOf(sc.nextLine()));
        }

        System.out.println("Máximo: " + t.stream().mapToDouble(i -> i).max().getAsDouble());
        System.out.println("Minimo: " + t.stream().mapToDouble(i -> i).min().getAsDouble());
        System.out.println("Promedio: " + t.stream().mapToDouble(i -> i).average());

    }
    
}
