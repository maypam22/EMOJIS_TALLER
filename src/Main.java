import javax.swing.*;

import static java.lang.Boolean.TRUE;

public class Main {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog(
                "Escriba 1 para dibujar emoji enojado \n" +
                "Escriba 2 para dibujar emoji robot\n" +
                "Escriba 3 para dibujar emoji carita tierna\n" +
                "Escriba 4 para dibujar emoji con lengua afuera\n"





        );
        int opcion = Integer.parseInt(entrada);

        figuras panel = new figuras(opcion);
        JFrame aplicacion = new JFrame();

        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);
        aplicacion.setSize(1200, 500);
        aplicacion.setVisible(TRUE);

    }
}