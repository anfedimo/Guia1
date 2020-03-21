package Restaurante;

import java.util.Arrays;
import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) {
        int tipo_de_comida = 0;
        int plato = 0;
        int total = 0;
        int cantidad = 0;

        int[][] vegetariana = {{1,2,3},{10000,25000,5000}};
        String[] vegetariana_platos = {"Sopa", "Ensalada", "Jugo"};
        int[][] no_vegetariana = {{1,2},{30000,28000}};
        String[] no_vegetariana_platos = {"Carne", "Pollo"};
        int[][] rapidas = {{1,2},{5000,7000}};
        String[] rapidas_platos = {"Perros", "Hamburguesas"};

        System.out.println("Software de Restaurante");
        System.out.println("-------------------------------------------------------");

        Scanner entrada = new Scanner (System.in);

        do{
            System.out.println("Digita el 'número' del tipo de Comida: Vegetarianas (1), No Vegetarianas (2) 0 Comidas Rápidas (3)");
            tipo_de_comida = entrada.nextInt (); //Invocamos un método sobre un objeto Scanner
        }while(tipo_de_comida <= 0 || tipo_de_comida > 3);

        switch (tipo_de_comida){
            case 1:
                System.out.println("Comidas Vegetarianas:");
                System.out.println("1 - Sopa");
                System.out.println("2 - Ensalada");
                System.out.println("3 - Jugo");
                break;
            case 2:
                System.out.println("No Vegetarianas:");
                System.out.println("1 - Carne");
                System.out.println("2 - Pollo");
                break;
            case 3:
                System.out.println("Comidas Rápidas:");
                System.out.println("1 - Perro");
                System.out.println("2 - Hamburguesa");
                break;
            default:
                System.out.println("Digite un tipo de comida correcto");
        }

        System.out.println("Elija el plato que desea:");

        do{
            System.out.println("Dijite: ");
            plato = entrada.nextInt (); //Invocamos un método sobre un objeto Scanner

            System.out.println("Dijite cantidad: ");
            cantidad = entrada.nextInt ();

        }while(plato <= 0 || plato > 3);

        if (tipo_de_comida == 1){
            System.out.println("su plato de comida fue: " + vegetariana_platos[plato]);

            total = vegetariana[plato][plato] * cantidad;
            System.out.println("Total de la cuenta: " + total);
        }else if (tipo_de_comida == 2){
            System.out.println("su plato de comida fue: " + no_vegetariana_platos[plato]);

            total = no_vegetariana[plato][plato] * cantidad;
            System.out.println("Total de la cuenta: " + total);
        }else{
            System.out.println("su plato de comida fue: " + rapidas_platos[plato]);

            total = rapidas[plato][plato] * cantidad;
            System.out.println("Total de la cuenta: " + total);
        }

    }
}
