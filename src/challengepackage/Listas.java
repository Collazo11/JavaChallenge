package challengepackage;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String args[]) {
        List<Integer> listaNumEnteros = new ArrayList<Integer>();

        listaNumEnteros.add(2333);
        listaNumEnteros.add(4211);
        listaNumEnteros.add(4211);
        listaNumEnteros.add(2333);

        int suma = 0;

//funcion de suma

        for (int i = 0; i < listaNumEnteros.size(); i++) {
            suma += listaNumEnteros.get(i);
        }

        System.out.println("la suma es: " + suma);

//funcion de eliminar un valor de la lista //en esta parte se rompe en Intelli, si lo pruebas en vscode funciona

        System.out.println("Introduzca el valor a eliminar: ");
        int valorAEliminar = Integer.parseInt(System.console().readLine());

        for (int i = 0; i < listaNumEnteros.size(); i++) {
            if (listaNumEnteros.get(i) == valorAEliminar) {
                listaNumEnteros.remove(i);
            }
        }
        System.out.println("La lista sin los valores a eliminar es: " + listaNumEnteros);

        //Determinar si el contenido de la lista es capicúa.
        boolean capicua = true;
        for (int i = 0; i < listaNumEnteros.size() / 2; i++) {
            if (listaNumEnteros.get(i) != listaNumEnteros.get(listaNumEnteros.size() - 1 - i)) {
                capicua = false;
            }
        }
        System.out.println("La lista es capicua: " + capicua);

    }
}