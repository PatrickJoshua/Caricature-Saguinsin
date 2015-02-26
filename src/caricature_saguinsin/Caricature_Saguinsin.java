package caricature_saguinsin;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.GeneralPath;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author patrickjoshuasaguinsin
 */
public class Caricature_Saguinsin {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Caricature - Patrick Joshua Saguinsin");
        frame.add(new panel());
        frame.setSize(800,800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}

class panel extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D gg = (Graphics2D)g;
        gg.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        GeneralPath gp;
        int x = 0;
        
        //face outline
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(306, 232.35);
        gp.quadTo(300.69, 289.70, 304, 302);    //left point
        gp.quadTo(325.90, 424.26, 400.22, 420.55);      //chine
        gp.curveTo(474.12, 415.95, 492, 328.24, 494, 285.67);   //right point
        gp.curveTo(492.94, 208.32, 479.75, 148.87, 366.64, 156.09);     //top
        gp.curveTo(350, 158.46, 312.93, 177.09, 306, 232.35);   //upper left
        gp.closePath();
        gg.setColor(new Color(222,173,107));
        gg.fill(gp);
        
        //left inner eye
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(372.73, 267.13);
        gp.quadTo(359.70, 244.90, 329.66, 265.05);
        gp.quadTo(333.48, 261.05, 372.73, 267.13);
        gg.setColor(Color.white);
        gg.fill(gp);
        gg.setColor(Color.black);
        gg.draw(gp);
        
        //left eye fold
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(371.69, 263.83);
        gp.quadTo(357.97, 240.38, 332.78, 261.75);
        gg.setColor(Color.BLACK);
        gg.draw(gp);
        
        //left eye bag
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(337.99, 268.17);
        gp.quadTo(338.86, 275.29, 361.27, 271.47);
        gp.curveTo(372.90, 271.30, 362.14, 277.20, 349.98, 278.25);
        gp.curveTo(327.57, 273.90, 334.17, 265.91, 337.99, 268.17);
        gg.setColor(Color.black);
        gg.fill(gp);
        
        //right inner eye
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(423.80, 265.36);
        gp.quadTo(441.92, 242.27, 469.98, 263.23);
        gp.curveTo(450.80, 261.10, 435.17, 269.27, 423.80, 265.36);
        gg.setColor(Color.white);
        gg.fill(gp);
        gg.setColor(Color.black);
        gg.draw(gp);
        
        //right eye fold
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(423.80, 260.36);
        gp.quadTo(441.92, 237.27, 469.98, 258.23);
        gg.setStroke(new BasicStroke(5));
        gg.draw(gp);
        
        //right eye bag
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(429.84, 272.11);
        gp.quadTo(446.54, 276.73, 457.90, 271.05);
        gg.setStroke(new BasicStroke(8,BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        gg.draw(gp);
    }
}