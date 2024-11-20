package com.campusdual.classroom;


import java.util.ArrayList;
import java.util.List;

public class Exercise07 {

    public static void main(String[] args) {

    }

    //TODO ↓
    // ESTE MÉTODO NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {
        List<Integer> numeros = new ArrayList<>();
        for(int i = 0; i <= 10; i++){
            numeros.add(i);
        }

        if (numeros.contains(num)) {
            System.out.println("El elemento " + num + " se encuentra en la posición: " + numeros.indexOf(num));
        } else {
            System.out.println("El elemento " + num + " no se encuentra en la lista.");
        }
    }

    //TODO ↓
    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {
        int resultado = 0;
        for(int i = 0; i <= num; i++){
            resultado += i;
        }
        System.out.println(resultado);
    }

    //TODO ↓
    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {
        for(int i = 0; i <= num; i++){
            System.out.println(i);
        }
    }

}
