/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desempeno1;

/**
 *
 * @author ciro-
 */
public class Alumno {
    private int legajo;
    private String nombre;
    private String[] materias;
    private int[] notas;

    public Alumno(int legajo, String nombre, int cantidadMaterias) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.materias = new String[cantidadMaterias];
        this.notas = new int[cantidadMaterias];
    }

    public void setMateriaNota(int index, String materia, int nota) {
        this.materias[index] = materia;
        this.notas[index] = nota;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String[] getMaterias() {
        return materias;
    }

    public int[] getNotas() {
        return notas;
    }

    public double calcularPromedio() {
        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        return (double) suma / notas.length;
    }
    
    
}
