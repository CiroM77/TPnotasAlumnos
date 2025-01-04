/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desempeno1;

import java.util.Scanner;

/**
 *
 * @author ciro-
 */
public class Desempeno1 {

    public static void main(String[] args) {
       
        Alumno alumno1 = new Alumno(1, "Ciro Martin", 3);
        alumno1.setMateriaNota(0, "Matemática", 4);
        alumno1.setMateriaNota(1, "Tecnología", 9);
        alumno1.setMateriaNota(2, "Biología", 6);

        Alumno alumno2 = new Alumno(2, "Gabriel Arriola", 3);
        alumno2.setMateriaNota(0, "Matemáticas", 6);
        alumno2.setMateriaNota(1, "Tecnología", 7);
        alumno2.setMateriaNota(2, "Biología", 4);

        Examen examen = new Examen(2, 6);
        examen.agregarAlumno(0, alumno1);
        examen.agregarAlumno(1, alumno2);

        // Menú 
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Mostrar alumnos y notas");
            System.out.println("2. Mostrar promedios de los alumnos");
            System.out.println("3. Mostrar materias con nota superior al promedio");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    examen.mostrarAlumnos();
                    break;
                case 2:
                    examen.mostrarPromedios();
                    break;
                case 3:
                    examen.mostrarNotasSuperioresAlPromedio();
                    break;
                case 0:
                    System.out.println("Muchas gracias por participar");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }
    
}
