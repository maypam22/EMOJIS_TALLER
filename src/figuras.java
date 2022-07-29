import javax.swing.*;
import java.awt.*;

public class figuras extends JPanel {
    private int opcion;

    public figuras(int opcionUsuario){
        opcion=opcionUsuario;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int i=0;i<10;i++){
            switch(opcion){
                case 1:

                    break;
                case 2:

                    break;
                case 3:


                    break;
                case 4:

                    break;
            }
        }

    }

}