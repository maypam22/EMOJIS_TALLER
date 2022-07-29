import javax.swing.*;

import static java.lang.Boolean.TRUE;

public class Main {
    public static void main(String[] args) {
        int opcion = 1;
        while (opcion != 0) {
        String entrada = JOptionPane.showInputDialog(
                "Escriba 1 para dibujar emoji enojado \n" +
                "Escriba 2 para dibujar emoji robot\n" +
                "Escriba 3 para dibujar emoji carita tierna\n" +
                "Escriba 4 para dibujar emoji con lengua afuera\n"





        );
        opcion = Integer.parseInt(entrada);
        if(opcion>0 && opcion <=4) {
            figuras panel = new figuras(opcion);
            JFrame aplicacion = new JFrame();

            aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            aplicacion.add(panel);
            aplicacion.setSize(1200, 500);
            aplicacion.setVisible(TRUE);
        } else if (opcion >=5){
            JOptionPane.showMessageDialog(null, "Intenta ingresando otro numero: ");
        }
        }
        JOptionPane.showMessageDialog(null, "Muchcas Gracias");
        System.exit( 0 );
    }
}