/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class_1.java to edit this template
 */
package Futbolista.pruebas;

/**
 *
 * @author maniana
 */
import Futbolista.Futbolista;
import java.time.LocalDate;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Constantes
        // Variables de entrada
        Futbolista f1 = new Futbolista("Cristiano", "El bicho",
                9, LocalDate.of(2001, 1, 1));
        Futbolista f2 = new Futbolista("Cristiano", "El bicho",
                9, LocalDate.of(2001, 1, 1));
//        String f2 = null;
//        Futbolista f2 = f1;
        // Variables de salida

        // Variables auxiliares
        //para calculos intermedios
        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("TEST FUTBOLISTAS");
        System.out.println("----------------------");
        System.out.println(" ");

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.println(f1.equals(f2));
        System.out.println("Fin del programa.");
    }
}
