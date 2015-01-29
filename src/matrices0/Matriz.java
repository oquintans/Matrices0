package matrices0;

import javax.swing.JOptionPane;

/**
 *
 * @author oquintansocampo
 */
public class Matriz {

    public void tabla(String[] ciudades, String[] dias, float[][] temp) {

        for (int j = 0; j < dias.length; j++) {
            System.out.print("\t" + dias[j]);
        }
        for (int f = 0; f < ciudades.length; f++) {
            System.out.print("\n" + ciudades[f] + "\n");
            for (int i = 0; i < dias.length; i++) {
                System.out.print("\t" + temp[f][i]);
            }
        }

    }

    public void mediaC(String[] ciudades, String[] dias, float[][] temp) {

        float[] ac = new float[ciudades.length];
        for (int f = 0; f < ciudades.length; f++) {

            for (int i = 0; i < dias.length; i++) {
                ac[f] += temp[f][i];

            }
        }
        for (int j = 0; j < ac.length; j++) {

            System.out.println(ciudades[j] + " Media Tº: " + (ac[j] / dias.length) + "ºC");
        }
    }

    public void mediaD(String[] ciudades, String[] dias, float[][] temp) {

        float[] ac = new float[dias.length]; //array de acumuladores
        for (int f = 0; f < dias.length; f++) {

            for (int i = 0; i < ciudades.length; i++) {
                ac[f] += temp[i][f];
            }
        }
        for (int y = 0; y < ac.length; y++) {
            ac[y] = ac[y] / ciudades.length;
        }
        String preg = JOptionPane.showInputDialog("Dia?");
        preg = preg.toUpperCase();
        preg = preg.substring(0, 5);
        for (int h = 0; h < dias.length; h++) {
            if (preg.equals(dias[h])) {
                System.out.println(dias[h] + ": " + ac[h] + "Cº");

            }
        }
    }
}
