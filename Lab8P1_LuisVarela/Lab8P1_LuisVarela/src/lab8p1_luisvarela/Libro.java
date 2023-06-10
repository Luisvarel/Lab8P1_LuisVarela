/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p1_luisvarela;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Luis Andres Varela
 */
public class Libro {

    static Random ran = new Random();
    static Scanner lea = new Scanner(System.in);
    private String libro;
    private String escritor;
    private int año;

    public Libro(int año, String escritor, String libro) {
        this.libro = libro;
        this.año = año;
        this.escritor = escritor;
    }

    public Libro() {

    }

    public String getLibro() {
        return libro;
    }

    public String getEscritor() {
        return escritor;
    }

    public int getAño() {
        return año;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public void setAño(int año) {
        this.año = año;
    }

}
