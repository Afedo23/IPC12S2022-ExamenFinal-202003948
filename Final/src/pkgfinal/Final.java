/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgfinal;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author BARRIENTOS LOPEZ
 */
public class Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("--------------------");
            System.out.println("1. Problema No.1");
            System.out.println("2. Problema No.2");
            System.out.println("3. Problema No.3");
            System.out.println("4. Salir");
            System.out.println("--------------------");

            try {

                System.out.println("--------------------");
                System.out.println("Escribe una de las opciones");
                System.out.println("--------------------");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1 -> {
                        System.out.println("--------------------");
                        System.out.println("Has seleccionado la opcion 1");
                        System.out.println("--------------------");
                        System.out.println("ingrese el primer numero: ");
                        int primero, segundo;
                        primero = sn.nextInt();
                        System.out.println("ingrese el segundo numero: ");
                        segundo = sn.nextInt();

                        if (primero == segundo) {
                            System.out.println("son iguales");
                        } else if (primero > segundo) {
                            System.out.println("el numero mayor es: " + primero);
                        } else {
                            System.out.println("el numero mayor es: " + segundo);
                        }

                    }

                    case 2 -> {
                        System.out.println("--------------------");
                        System.out.println("Has seleccionado la opcion 2");
                        System.out.println("el numero de filas");
                        System.out.println("--------------------");
                        int filas, a, e, j;
                        filas = sn.nextInt();

                        if (filas % 2 == 0) {
                            System.out.println("--------------------");
                            System.out.println("el numero ingresado es par");
                            System.out.println("--------------------");
                        } else {
                            for (a = 1; a <= filas; a++) {
                                for (e = a; e <= filas; e++) {
                                    System.out.print(" ");
                                }
                                for (j = 1; j <= (a * 2) - 1; j++) {
                                    System.out.print("*");
                                }
                                System.out.print("\n");
                            }
                        }

                    }

                    case 3 -> {
                        System.out.println("--------------------");
                        System.out.println("Has seleccionado la opcion 3");
                        System.out.println("--------------------");

                        int vacas = 8;
                        int pesoLimite = 100;
                        int[] pesoVacas = {223, 243, 100, 200, 200, 155, 300, 150};
                        int[] lecheVacas = {30, 34, 28, 45, 31, 50, 29, 1};
                        for (int i = 0; i < lecheVacas.length; i++) {
                            for (int j = 0; j < lecheVacas.length-1; j++) {
                                if (lecheVacas[j] > j + 1) {
                                    int temp = lecheVacas[j];
                                    lecheVacas[j] = lecheVacas[j+1];
                                    lecheVacas[j + 1] = temp;
                                    int tempo = pesoVacas[j];
                                    pesoVacas[j] = pesoVacas[j+1];
                                    pesoVacas[j+1] = tempo;

                                }

                            }

                        }
                        int sumaPeso = 0;
                        int sumaLeche = 0;
                        for (int j = lecheVacas.length-1; j >=0; j--) {
                            sumaPeso = sumaPeso + pesoVacas[j];
                            sumaLeche = sumaLeche + lecheVacas[j];
                            if (sumaPeso > pesoLimite) {
                                sumaPeso = sumaPeso - pesoVacas[j];
                                sumaLeche = sumaLeche - lecheVacas[j];
                                break;

                            }

                        }
                        System.out.println("litros "+sumaLeche);

                    }

                    case 4 ->
                        salir = true;
                    default ->
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }

    }
}
