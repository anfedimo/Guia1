/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guia2.ejercicios_basicos_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author adiaz
 */
public class Ejercicio_3 {
    
    List<Integer> listaA = Arrays.asList(1, 4, 5, 8, 9);
        List<Integer> listaB = Arrays.asList(1, 5, 6, 7, 8, 11, 20);
        List<Integer> listC = new ArrayList<>();
        for (Integer integer : listaA) {
            if (!listaB.contains(integer)) {
               listC.add(integer);
            }
        }
        for (Integer integer : listaB) {
            if (!listaA.contains(integer)) {
               listC.add(integer);
            }
        }
        for (Integer integer : listC) {
            System.out.println(integer);
        }

  
    
}
