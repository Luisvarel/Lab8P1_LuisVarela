/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8p1_luisvarela;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Luis Andres Varela
 */
public class Lab8P1_LuisVarela {

    static Random ran = new Random();
    static Scanner lea = new Scanner(System.in);
    static Libro m = new Libro();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean seguir = true;
        boolean case_2 = false;
        Libro[][] libreria_0 = {};
        while (seguir) {
            System.out.println("1.Crear biblioteca");
            System.out.println("2.Modificar librero ");
            System.out.println("3.Salir");
            int opcion = lea.nextInt();
            switch (opcion) {
                case 1: {
                    libreria_0 = llenarLibrero();
                    case_2 = true;
                }
                break;
                case 2: {
                    if (case_2) {
                        System.out.println("Ingrese el título del libro:");
                        String libro1 = lea.next();
                        System.out.println("Ingrese el escritor:");
                        String escritor1 = lea.next();
                        System.out.println("Ingrese el año de publicación:");
                        int año1 = lea.nextInt();
                        Modificar_librero(libreria_0, libro1, escritor1, año1);
                    } else {
                        System.out.println("Primero se necesita crear una biblioteca para modificaciones");
                    }
                }
                break;
                case 3: {
                    seguir = false;
                }
                break;
                default: {
                    System.out.println("Error");
                }
            }
        }
        // TODO code application logic here
    }

    public static Libro[][] Modificar_librero(Libro[][] libreria_0, String libro1, String escritor1, int año1) {
        int contador0 = 0;
        int contador1 = 0;
        boolean correcto = false;
        for (int i = 0; i < libreria_0.length; i++) {
            for (int j = 0; j < libreria_0[i].length; j++) {
                Libro m = libreria_0[i][j];
                if (libro1.equalsIgnoreCase(m.getLibro())) {
                    if (escritor1.equalsIgnoreCase(m.getEscritor())) {
                        if (año1 == m.getAño()) {
                            contador0 = i;
                            contador1 = j;
                            correcto = true;
                        }
                    }
                }
            }
        }
        if (correcto) {
            System.out.println("El libro fue encontrado en la fila " + contador0 + " columna " + contador1);
            System.out.println("\nIngrese el título del libro:");
            String libro = lea.next();
            m.setLibro(libro);
            System.out.println("Ingrese el escritor:");
            String escritor = lea.next();
            m.setEscritor(escritor);
            System.out.println("Ingrese el año de publicación:");
            int año = lea.nextInt();
            m.setAño(año);
            libreria_0[contador0][contador1] = m;
            for (int i = 0; i < libreria_0.length; i++) {
                for (int j = 0; j < libreria_0[i].length; j++) {
                    Libro m = libreria_0[i][j];
                    System.out.print("[ " + m.getLibro() + " ]");
                }
                System.out.println("");
            }

        } else {
            System.out.println("El libro no fue encontrado");

        }
        return libreria_0;
    }

    public static Libro[][] llenarLibrero() {
        int filas = 0;
        do {
            System.out.println("Ingrese la cantidad de filas para el librero:");
            filas = lea.nextInt();
        } while (filas <= 0);
        int columnas = 0;
        do {
            System.out.println("Ingrese la cantidad de columnas para el librero:");
            columnas = lea.nextInt();
        } while (columnas <= 0);

        Libro[][] librero = new Libro[filas][columnas];
        String libro = "";
        String escritor = "";
        int año = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Ingrese el título del libro:");
                libro = lea.next();
                System.out.println("Ingrese el escritor:");
                escritor = lea.next();
                System.out.println("Ingrese el año de publicación: ");
                año = lea.nextInt();
                Libro m = new Libro(año, escritor, libro);
                librero[i][j] = m;
                System.out.println("El libro fue agregado exitosamente\n");
                
            }
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                Libro m = librero[i][j];
                System.out.print("[ " + m.getLibro() + " ]");
            }
            System.out.println("");
        }
        return librero;
    }
}
