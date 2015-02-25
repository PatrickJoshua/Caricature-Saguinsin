package caricature_saguinsin;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
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
        
    }
}