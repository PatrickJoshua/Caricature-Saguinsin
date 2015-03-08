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
        gp.moveTo(371.69, 258.83);
        gp.quadTo(357.97, 243.38, 332.78, 258.75);
        gg.setStroke(new BasicStroke(5));
        gg.setColor(Color.BLACK);
        gg.draw(gp);
        
        //left eye bag
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(337.99, 268.17);
        gp.quadTo(338.86, 275.29, 361.27, 271.47);
        gp.curveTo(372.90, 271.30, 362.14, 277.20, 349.98, 278.25);
        gp.curveTo(327.57, 273.90, 334.17, 265.91, 337.99, 268.17);
        gg.setStroke(new BasicStroke(1));
        gg.setColor(Color.black);
        gg.fill(gp);
        
        //left eyeball
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(345.95,257.47);
        gp.quadTo(343.69, 261.13, 345.95, 264.04);
        gp.lineTo(359.96, 265.45);
        gp.quadTo(363.29, 260.38, 360.93, 258.01);
        gp.curveTo(356.62, 253.85, 348, 253.82, 345.95, 257.47);
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
        gg.setStroke(new BasicStroke(5,BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        gg.draw(gp);
        
        //right eyeball
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(434.97, 256.39);
        gp.quadTo(434, 263.29, 440.64, 265.45);
        gp.quadTo(452.22, 265.97, 450.92, 254.02);
        gp.quadTo(443.27, 252.51, 434.97, 256.39);
        gg.fill(gp);
        
        //left brow
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(329.87, 243.71);
        gp.quadTo(354.97, 232.28, 372.81, 244.27);
        gg.setStroke(new BasicStroke(8, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        gg.draw(gp);
        
        //right brow
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(422.94, 243.15);
        gp.quadTo(444.97, 229.21, 467.83, 240.08);
        gg.draw(gp);
        
        //nose
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(363.85, 315);
        gp.quadTo(368.86, 319.08, 370.57, 319.34);
        gp.curveTo(373.47, 318.68, 376.63, 317.50, 377.81, 315.92);
        gp.curveTo(379.13, 314.47, 386.90, 314.07, 387.69, 317.10);
        gp.curveTo(388.87, 319.87, 394.53, 320.40, 394.53, 320.40);
        gp.quadTo(400.20, 321.05, 403.62, 317.23);
        gp.curveTo(404.94, 315.92, 414.55, 312.63, 418.77, 316.96);
        gp.curveTo(420.48, 319.34, 430.62, 318.29, 430.88, 313.02);
        gg.setStroke(new BasicStroke(1, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        gg.draw(gp);
    }
}