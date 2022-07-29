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
                case 5:
                    g.setColor( Color.YELLOW );
                    g.fillOval( 10, 10, 200, 200 );

                    g.setColor( Color.BLACK );
                    g.fillArc( 55, 50, 45, 26 ,0,180);
                    g.fillArc( 133, 50, 45, 26,0,180 );

                    g.fillOval( 55, 65, 30, 30 );
                    g.fillOval( 135, 65, 30, 30 );

                    g.fillOval( 50, 110, 120, 60 );

                    g.setColor( Color.YELLOW );
                    g.fillOval( 55, 60, 26, 26 );
                    g.fillOval( 135, 60, 26, 26 );

                    g.fillOval( 50, 120, 120, 70 );

                    g.fillArc( 50, 55, 55, 30,0,180 );
                    g.fillArc( 128, 55, 55, 30, 0, 180);

                    break;
                case 6:
                    g.setColor( Color.YELLOW );
                    g.fillOval( 10, 10, 200, 200 );

                    g.setColor( Color.BLACK );

                    g.fillArc( 55, 70, 35, 20 ,0,180);
                    g.fillArc( 133, 70, 35, 20,0,180 );

                    g.fillArc(55,75,30,30,0,-180);
                    g.fillArc(135,75,30,30,0,-180);

                    g.fillOval( 50, 110, 120, 60 );


                    g.setColor( Color.YELLOW );

                    g.fillArc( 50, 75, 35, 20 ,0,180);
                    g.fillArc( 128, 75, 35, 20,0,180 );

                    g.fillOval( 50, 120, 120, 70 );

                    break;
                case 7:

                    break;
                case 8:

                    break;
            }
        }

    }

}