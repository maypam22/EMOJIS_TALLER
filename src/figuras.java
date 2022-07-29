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
                    //CARA
                    g.setColor( Color.RED );
                    g.fillOval( 10, 10, 200, 200 ); // hace el circulo color amarillo

                    g.setColor( Color.BLACK );

                    //circulo de forma
                    g.drawArc( 10, 10, 200, 200 ,0,360);
                    //OJOS
                    g.drawArc(125,50,75,30,180,-90);
                    g.drawArc(20,50,75,30,0,90);
                    g.fillOval( 125, 65, 30, 30 );
                    g.fillOval( 65, 65, 30, 30 );

                    //BOCA
                    g.fillArc( 65, 130, 90, 60 ,0,180);

                    g.setColor(Color.RED);
                    g.fillArc( 65, 140, 90, 60 ,0,180);

                    break;
                case 2:
                    //CARA
                    g.setColor( Color.BLUE );
                    g.fillOval( 50, 75, 300, 150 );
                    g.fillOval( 0, 75, 250, 150 );
                    g.fillOval( 100, 20, 150, 100 );

                    g.setColor(Color.BLACK);
                    g.drawArc( 50, 75, 300, 150,0,360 );
                    g.drawArc( 0, 75, 250, 150 ,0,360);
                    g.drawArc( 100, 20, 150, 100 ,0,360);

                    g.setColor( Color.RED );
                    g.fillRect( 50, 50, 250, 200 );//CUADRADO DE LA CARA
                    g.setColor( Color.BLACK );
                    g.drawRect( 50, 50, 250, 200 );// CONTORNO  DE LA CARA

                    g.setColor( Color.GRAY );
                    //OJOS PRIMERA CAPA
                    g.fillOval( 190, 80, 100, 100 );
                    g.fillOval( 65, 80, 100, 100 );

                    //OJOS SEGUDA CAPA
                    g.setColor(Color.BLUE);
                    g.fillOval( 200, 90, 80, 80 );
                    g.fillOval( 75, 90, 80, 80 );


                    //OJOS TERCERA CAPA
                    g.setColor(Color.BLACK);
                    g.fillOval( 210, 100, 60, 60 );
                    g.fillOval( 85, 100, 60, 60);
                    //ULTIMA CAPA DE OJOS
                    g.setColor(Color.WHITE);
                    g.fillOval( 215, 105, 30, 30 );
                    g.fillOval( 90, 105, 30, 30);
                    g.setColor(Color.BLACK);

                    //BOCA
                    g.setColor(Color.GRAY);
                    g.fillRect( 120, 200, 100, 35);
                    g.setColor(Color.BLACK);
                    g.drawRect( 120, 200, 100, 35);

                    g.setColor(Color.white);
                    g.fillRect( 130, 205, 80, 25);
                    g.setColor(Color.BLACK);
                    g.drawRect( 130, 205, 80, 25);

                    g.setColor(Color.BLACK);
                    g.drawLine( 150, 230, 150, 205);
                    g.drawLine( 170, 230, 170, 205);
                    g.drawLine( 190, 230, 190, 205);

                    break;
                case 3:

                    //empieza en 0 hasta -270
                    //CARA
                    g.setColor(Color.yellow);
                    g.fillArc(30,30, 200, 200, 0, 360);

                    //  OJOS Y CARA Y CONTORNOS
                    g.setColor(Color.BLACK);
                    g.drawArc(60, 10, 60, 60, -15, -90);
                    g.drawArc(150, 10, 60, 60, -75, -90);
                    g.drawArc(142, 80, 60, 60, -15, 210);
                    g.drawArc(67, 80, 60, 60, -15, 210);

                    g.setColor(Color.WHITE);
                    g.fillArc(142, 80, 60, 60, -15, 210);
                    g.fillArc(67, 80, 60, 60, -15, 210);

                    g.setColor(Color.BLACK);
                    g.drawArc(30,30, 200, 200, 0, 360);
                    g.fillArc(145, 85, 50, 65, -5, 185);
                    g.fillArc(75, 85, 50, 65, 0, 195);
                    g.drawArc(120, 135, 30, 30, -45, -90);

                    g.setColor(Color.WHITE);
                    g.fillArc(90, 88, 20, 20, -15, 360);
                    g.fillArc(160, 88, 20, 20, -15, 360);

                    g.setColor(Color.CYAN);
                    g.fillArc(70, 110, 60, 22, 45, 360);
                    g.fillArc(140, 110, 60, 22, 45, 360);

                    g.setColor(Color.orange);
                    g.fillArc(60, 140, 60, 22, 45, 360);
                    g.fillArc(150, 140, 60, 22, 45, 360);
                    break;
                case 4:
                    //CARA
                    g.setColor( Color.YELLOW );
                    g.fillOval( 10, 10, 200, 200 ); // hace el circulo color amarillo


                    g.setColor( Color.BLACK );
                    //circulo de forma
                    g.drawArc( 10, 10, 200, 200 ,0,360);
                    //OJOS
                    g.fillOval( 125, 65, 30, 30 );
                    g.fillOval( 65, 65, 30, 30 );

                    //BOCA
                    g.fillOval( 50, 110, 120, 60 );

                    //LENGUA
                    g.setColor( Color.RED );
                    g.fillOval( 80, 135, 60, 90 );

                    g.setColor(Color.BLACK);
                    g.drawLine(110,125,110,200);

                    //CUADRADO
                    g.setColor(Color.BLACK);
                    g.fillRect( 55, 140, 113, 10 );

                    g.setColor( Color.YELLOW );
                    g.fillRect( 50, 100, 120, 40 );

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
                    g.setColor( Color.YELLOW );
                    g.fillOval( 10, 10, 200, 200 );

                    g.setColor( Color.BLACK );
                    g.fillArc( 45, 70, 55, 30,0,180 );
                    g.fillArc( 123, 70, 55, 30, 0, 180);

                    g.fillArc( 50, 110, 120, 60,0,-180);

                    g.setColor( Color.YELLOW );
                    g.fillArc( 45, 80, 55, 30,0,180 );
                    g.fillArc( 123, 80, 55, 30, 0, 180);

                    g.fillArc( 50, 100, 120, 60,0,-180);

                    g.setColor(Color.ORANGE);
                    g.fillOval( 30, 96, 45, 45 );
                    g.fillOval( 153, 96, 45, 45 );

                    break;
                case 8:
                    g.setColor( Color.YELLOW );
                    g.fillOval( 10, 10, 200, 200 );

                    g.setColor(Color.ORANGE);
                    g.fillOval( 30, 99, 50, 50 );
                    g.fillOval( 149, 99, 50, 50 );

                    g.setColor(Color.WHITE);
                    g.fillOval( 45, 65, 50, 50 );
                    g.fillOval( 125, 65, 50, 50 );

                    g.setColor( Color.BLACK );
                    g.fillArc( 45, 35, 55, 30,30,180 );
                    g.fillArc( 123, 35, 55, 30, -30, 180);

                    g.fillOval( 58, 75, 25, 25 );
                    g.fillOval( 138, 75, 25, 25 );

                    g.fillRect(90,150,40,5);

                    g.setColor( Color.YELLOW );
                    g.fillArc( 45, 43, 55, 30,0,180 );
                    g.fillArc( 123, 43, 55, 30, 0, 180);

                    break;
            }
        }

    }

}