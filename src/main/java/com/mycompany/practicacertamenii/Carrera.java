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
public class Carrera {
    private int identificador;
    private String nombre;
    private String areaSaber;
    private ArrayList<Alumno> alumnos = new ArrayList<>();

    public Carrera(int identificador, String nombre, String areaSaber) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.areaSaber = areaSaber;
    }

    public Carrera(){
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAreaSaber() {
        return areaSaber;
    }

    public void setAreaSaber(String areaSaber) {
        this.areaSaber = areaSaber;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    
    boolean agregarAlumno(Alumno alumno){
        int i = 0;
        
        for (i = 0 ; i < alumnos.size() ; i++){
            if(alumnos.get(i).getRut() == alumno.getRut()){
                return false;
            }
        }
        alumnos.add(alumno);
        return true;
    }
    
    Alumno obtenerAlumno(int rut){
        int i;
        
        for (i = 0 ; i < alumnos.size() ; i++){
            if (alumnos.get(i).getRut() == rut){
                return alumnos.get(i);
            }
        }
    return null;
    }
    
}
