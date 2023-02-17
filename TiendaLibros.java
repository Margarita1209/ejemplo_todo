/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tiendalibros;

import java.util.Scanner;

/**
 *
 * @author Maigo
 */
public class TiendaLibros {

    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("Proporciona tu nombre:");
        var nombre= consola.nextLine();
        System.out.println("Proporciona el Id:");
        var id= Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el precio:");
        var precio= Double.parseDouble(consola.nextLine());
        System.out.println("Proporciona el envio gratuito:");
        boolean envioGratuito= Boolean.parseBoolean(consola.nextLine());
        
        System.out.println(nombre+ " #"+ id);
        System.out.println(" precio: $ "+ precio);
        System.out.println("Envio Gratuito "+ envioGratuito);
    }
}
