/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desempeno1;

/**
 *
 * @author ciro-
 */
public class Examen {
    private Alumno[] alumnos;
    private int notaAprobacion;

    public Examen(int cantidadAlumnos, int notaAprobacion) {
        this.alumnos = new Alumno[cantidadAlumnos];
        this.notaAprobacion = notaAprobacion;
    }

    public void agregarAlumno(int index, Alumno alumno) {
        alumnos[index] = alumno;
    }

    public void mostrarAlumnos() {
        for (Alumno alumno : alumnos) {
            System.out.println("Alumno: " + alumno.getNombre() + " (Legajo: " + alumno.getLegajo() + ")");
            String[] materias = alumno.getMaterias();
            int[] notas = alumno.getNotas();
            for (int i = 0; i < materias.length; i++) {
                String estado = notas[i] >= notaAprobacion ? "APROBADA" : "REPROBADA";
                System.out.println("Materia: " + materias[i] + " - Nota: " + notas[i] + " (" + estado + ")");
            }
            System.out.println();
        }
    }

    public void mostrarPromedios() {
        for (Alumno alumno : alumnos) {
            System.out.println("Alumno: " + alumno.getNombre() + " - Promedio: " + alumno.calcularPromedio());
        }
    }

    public void mostrarNotasSuperioresAlPromedio() {
        for (Alumno alumno : alumnos) {
            double promedio = alumno.calcularPromedio();
            System.out.println("Alumno: " + alumno.getNombre() + " - Promedio: " + promedio);
            String[] materias = alumno.getMaterias();
            int[] notas = alumno.getNotas();
            for (int i = 0; i < materias.length; i++) {
                if (notas[i] > promedio) {
                    System.out.println("Materia: " + materias[i] + " - Nota: " + notas[i] + " (Superior al promedio)");
                }
            }
            System.out.println();
        }
    }
}
