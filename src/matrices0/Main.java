/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices0;

/**
 *
 * @author oquintansocampo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String ciudades[] = {"Vigo", "Ponte", "Santiago", "Ourense"};
        String dias[] = {"LUNES", "MIERC", "VIERN"};
        float[][] temp = {{15f, 12f, 16f}, {10f, 11f, 11f}, {7f, 8f, 9f}, {6f, 5f, 7f}};

        Matriz obj = new Matriz();
        obj.tabla(ciudades, dias, temp);
        System.out.println("\n");
        obj.mediaD(ciudades, dias, temp);
    }

}
