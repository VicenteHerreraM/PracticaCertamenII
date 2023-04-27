/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicacertamenii;
import java.util.ArrayList;

/**
 *
 * @author vice1
 */
public class Universidad {
    private ArrayList<Carrera> carreras = new ArrayList<>();

    public Universidad(){

    }

    public Universidad(ArrayList<Carrera>carreras) {
        this.carreras = carreras;
    }

    public ArrayList<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(ArrayList<Carrera> carreras) {
        this.carreras = carreras;
    }

    void mostrarCarreras(){

        for(Carrera carrera : carreras){
            System.out.println("Nombre de carrera:"+ carrera.getNombre());
            System.out.println("ID de carrera:"+ carrera.getIdentificador());
            System.out.println("Area de saber de carrera:"+ carrera.getAreaSaber());
            System.out.println("\n");
        }
    }

    boolean agregarCarrera(Carrera carrera){
        carreras.add(carrera);
        return true;
    }
}
