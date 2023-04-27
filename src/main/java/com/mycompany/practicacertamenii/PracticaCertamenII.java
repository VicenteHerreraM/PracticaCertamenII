/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicacertamenii;
import java.util.Scanner;

/**
 *
 * @author vice1
 */
public class PracticaCertamenII {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombre, areaSaber;
        int opcion1, id;

        Universidad u = new Universidad();
        Carrera carrera;

        System.out.println("Bienvenido al programa, porfavor seleccione una de las siguientes opciones");
        
        do{
            System.out.println("1 Agregar Carrera");
            System.out.println("2 Mostrar carreras");
            System.out.println("3 Agregar alumno");
            System.out.println("4 Obtener alumno");
            System.out.println("5 Buscar estudiante");
            opcion1 = entrada.nextInt();


            switch (opcion1) {
                case 1 -> {
                    System.out.println("Ingrese los datos de la carrera");
                    System.out.print("Nombre ");
                    nombre = entrada.next();
                    System.out.print("\nID ");
                    id = entrada.nextInt();
                    System.out.print("\nArea de saber ");
                    areaSaber = entrada.next();
                    carrera = new Carrera(id, nombre, areaSaber);
                    if(u.agregarCarrera(carrera)){
                        System.out.println("\n se ha agregado\n");
                    }
                }
                case 2 -> {
                    u.mostrarCarreras();
                }
                default -> {
                }
            }
        }while(opcion1 != 0);
    }
}
