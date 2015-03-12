package caricature_saguinsin;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
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
        
        //left ear
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(283,251);
        gp.quadTo(276, 345, 312, 328);
        gp.lineTo(323, 288);
        gp.closePath();
        gg.setColor(new Color(240,162,68));
        gg.fill(gp);
        
        //right ear
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(518.59, 250);
        gp.quadTo(520.45, 350.70, 490, 319.79);
        gp.lineTo(480, 272);
        gp.closePath();
        gg.fill(gp);
        
        //back
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(337,417);
        gp.lineTo(342, 465);
        gp.lineTo(322, 429);
        gp.closePath();
        gg.setColor(new Color(220,145,50));
        gg.fill(gp);
        
        //neck
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(328, 370);
        gp.lineTo(342, 469);
        gp.lineTo(417, 502);
        gp.lineTo(492, 471);
        gp.lineTo(496, 429.31);
        gp.lineTo(480, 420.25);
        gp.lineTo(477.55, 357.89);
        gp.closePath();
        gg.setColor(new Color(242,164,70));
        gg.fill(gp);
        
        //hair
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(305, 302.37);
        gp.quadTo(277.11, 240.53, 275.79, 228.95);
        gp.quadTo(266.32, 183.68, 278.68, 165.79);
        gp.quadTo(250.26, 145, 254.74, 136.84);
        gp.quadTo(271.05, 152.11, 277.89, 150);
        gp.quadTo(278.95, 135.26, 268.95, 128.16);
        gp.quadTo(276, 120.79, 292, 136);
        gp.quadTo(283, 100, 309, 90);
        gp.quadTo(310, 104, 312.89, 100.26);
        gp.quadTo(339, 59, 352, 59);
        gp.quadTo(343, 69, 345, 72);
        gp.quadTo(369, 51, 389, 58);
        gp.quadTo(401, 62, 415, 58);
        gp.quadTo(424, 55, 438, 73);
        gp.quadTo(449, 60, 454, 62);
        gp.quadTo(459, 69, 458, 75);
        gp.quadTo(467, 62, 467.89, 65.26);
        gp.lineTo(466, 78);
        gp.lineTo(477, 65);
        gp.lineTo(474, 80);
        gp.lineTo(485.53, 67);
        gp.quadTo(473, 92, 479, 99.21);
        gp.quadTo(486.58, 91, 498, 96);
        gp.lineTo(494, 107);
        gp.lineTo(510, 103);
        gp.quadTo(495, 114, 497, 120);
        gp.quadTo(518, 110, 525.53, 125);
        gp.quadTo(508, 130, 509, 135);
        gp.quadTo(534, 136, 540, 145);
        gp.quadTo(522.63, 147.37, 525, 152);
        gp.quadTo(545, 159, 549, 169);
        gp.quadTo(529, 164, 530, 169);
        gp.lineTo(538, 180.53);
        gp.lineTo(530, 181);
        gp.lineTo(534, 192);
        gp.lineTo(525, 191);
        gp.quadTo(528, 226, 524, 249);
        gp.quadTo(517, 272, 493, 292);
        gp.closePath();
        gg.setColor(Color.BLACK);
        gg.fill(gp);
        
        //face outline
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(306, 232.35);
        gp.quadTo(300.69, 289.70, 304, 302);    //left point
        gp.quadTo(325.90, 424.26, 400.22, 420.55);      //chine
        gp.curveTo(474.12, 415.95, 492, 328.24, 494, 285.67);   //right point
        gp.curveTo(492.94, 208.32, 479.75, 148.87, 366.64, 156.09);     //top
        gp.curveTo(350, 158.46, 312.93, 177.09, 306, 232.35);   //upper left
        gp.closePath();
        gg.setColor(new Color(250,172,78));    //previously 222,173,107
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
        gg.setStroke(new BasicStroke(2));
        gg.setColor(new Color(118,65,0));
        gg.draw(gp);
        
        //left eye bag
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        /*gp.moveTo(337.99, 268.17);
        gp.quadTo(338.86, 275.29, 361.27, 271.47);
        gp.curveTo(372.90, 271.30, 362.14, 277.20, 349.98, 278.25);
        gp.curveTo(327.57, 273.90, 334.17, 265.91, 337.99, 268.17);*/
        gp.moveTo(337, 272);
        gp.quadTo(349, 277, 363, 273);
        gg.setStroke(new BasicStroke(1));
        gg.setColor(new Color(210,132,28));
        gg.draw(gp);
        
        //left eyeball
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(345.95,257.47);
        gp.quadTo(343.69, 261.13, 345.95, 264.04);
        gp.lineTo(359.96, 265.45);
        gp.quadTo(363.29, 260.38, 360.93, 258.01);
        gp.curveTo(356.62, 253.85, 348, 253.82, 345.95, 257.47);
        gg.setStroke(new BasicStroke(1));
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
        gg.setStroke(new BasicStroke(2));
        gg.setColor(new Color(118,65,0));
        gg.draw(gp);
        
        //right eye bag
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(429.84, 272.11);
        gp.quadTo(446.54, 276.73, 457.90, 271.05);
        gg.setStroke(new BasicStroke(1,BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        gg.setColor(new Color(210,132,28));
        gg.draw(gp);
        
        //right eyeball
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(434.97, 256.39);
        gp.quadTo(434, 263.29, 440.64, 265.45);
        gp.quadTo(452.22, 265.97, 450.92, 254.02);
        gp.quadTo(443.27, 252.51, 434.97, 256.39);
        gg.setColor(Color.BLACK);
        gg.fill(gp);
        
        //left brow
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(329.87, 243.71);
        gp.quadTo(354.97, 232.28, 372.81, 244.27);
        gg.setStroke(new BasicStroke(8, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        gg.setColor(new Color(50,0,0));
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
        /*
        //nose shade
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(363.85, 315);
        gp.quadTo(368.86, 319.08, 370.57, 319.34);
        gp.curveTo(373.47, 318.68, 376.63, 317.50, 377.81, 315.92);
        gp.curveTo(379.13, 314.47, 386.90, 314.07, 387.69, 317.10);
        gp.curveTo(388.87, 319.87, 394.53, 320.40, 394.53, 320.40);
        gp.quadTo(400.20, 321.05, 403.62, 317.23);
        gp.curveTo(404.94, 315.92, 414.55, 312.63, 418.77, 316.96);
        gp.curveTo(420.48, 319.34, 430.62, 318.29, 430.88, 313.02);
        gg.setStroke(new BasicStroke(5, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        gg.setColor(new Color(162,77,1));
        gg.draw(gp);
        
        //nose bridge
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(398.37, 259.67);
        gp.lineTo(397.24, 304.52);
        gg.setColor(new Color(255,172,85));
        gg.setStroke(new BasicStroke(10, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        gg.draw(gp);
        
        //left dark nose shade
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(386, 267);
        gp.lineTo(368, 281);
        gp.lineTo(363, 305);
        gp.quadTo(377, 311, 387, 289);
        gp.closePath();
        gg.setColor(new Color(210,127,36));
        gg.fill(gp);
        */
        
        //lip fill
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(352.79, 345.94);
        gp.quadTo(362.93, 335.93, 395.72, 336.07);
        gp.quadTo(434.83, 334.09, 444.94, 342.12);
        gp.quadTo(426.93, 362.40, 413.89, 368.99);
        gp.quadTo(399, 378.34, 381.63, 370.04);
        gp.curveTo(365.43, 362.14, 352.79, 345.94, 352.79, 345.94);
        gg.setColor(Color.BLACK);
        gg.fill(gp);
        
        //gums
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(367.26, 338.98);
        gp.lineTo(366, 359);
        gp.lineTo(397, 366);
        gp.lineTo(428.92, 356);
        gp.lineTo(430, 340);
        gp.closePath();
        gg.setColor(new Color(102,29,0));
        gg.fill(gp);
        
        //upper lip fill
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(362.73, 340.89);
        gp.curveTo(367.06, 336.19, 418.64, 331.86, 435.95, 338.45);
        gp.quadTo(402.82, 351.44, 362.73, 340.89);
        gg.setColor(new Color(160,60,0));
        gg.fill(gp);
        
        //lower lip fill
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(361.98, 355.95);
        gp.quadTo(396.61, 369.88, 434.07, 353.13);
        gp.quadTo(395.79, 395.02, 361.98, 355.95);
        gg.fill(gp);
        
        //teeth
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(367.93, 357.77);
        gp.lineTo(367.93, 352.02);
        gp.quadTo(370.26, 349.53, 370.93, 352.02);
        gp.quadTo(372.92, 345.96, 376.90, 350.94);
        gp.quadTo(381.88, 340.49, 385.53, 351.02);
        gp.quadTo(390.01, 340.07, 397.97, 351.02);
        gp.quadTo(405.02, 339.57, 407.84, 350.03);
        gp.quadTo(413.23, 340.98, 417.71, 350.03);
        gp.quadTo(422.69, 341.98, 425.17, 345.05);
        gp.quadTo(427.79, 350.43, 425.92, 356.08);
        gp.lineTo(418, 355);
        gp.lineTo(416, 357);
        gp.lineTo(408, 357);
        gp.lineTo(407, 359);
        gp.lineTo(399, 359);
        gp.lineTo(397.97, 358.18);
        gp.lineTo(388.39, 357.81);
        gp.lineTo(387.66, 356.9);
        gp.lineTo(377.95, 357.81);
        gp.closePath();
        //gp.quadTo(402.90, 366.27, 367.93, 357.77);
        gg.setColor(Color.WHITE);
        gg.fill(gp);
        
        //right arm
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(677, 659);
        gp.quadTo(688, 740, 682, 800);
        gp.lineTo(594, 800);
        gp.lineTo(589.40, 746.24);
        gp.lineTo(591.75, 693.49);
        gp.closePath();
        gg.setColor(new Color(240,172,65));
        gg.fill(gp);
        
        //left arm
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(244.32, 698);
        gp.lineTo(250, 800);
        gp.lineTo(157, 800);
        gp.quadTo(145, 743, 149, 664);
        gp.lineTo(196, 643);
        gp.closePath();
        gg.fill(gp);
        
        //shirt
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(326, 424);
        gp.quadTo(330, 477, 410, 488);
        gp.quadTo(484, 498, 491, 430);
        gp.quadTo(490, 420, 482.58, 420.85);
        gp.quadTo(490, 413, 496, 428);
        gp.lineTo(621, 480);
        gp.quadTo(640, 488, 658, 507);
        gp.quadTo(668, 520, 670, 532);
        gp.lineTo(713, 643);
        gp.quadTo(645, 689, 593, 694);
        gp.lineTo(587, 800);
        gp.lineTo(250, 800);
        gp.lineTo(245, 698);
        gp.quadTo(160, 672, 133, 657);
        gp.quadTo(135, 594, 146, 546);
        gp.quadTo(154, 513, 180, 497);
        gp.lineTo(200, 478);
        gp.quadTo(288, 453, 326, 424);
        gg.setColor(new Color(255,250,77));
        gg.fill(gp);
        /*
        //right armpit
        gp = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
        gp.moveTo(596, 649);
        gp.quadTo(597.68, 680.70, 590, 679);
        gp.lineTo(593.34, 694.31);
        gg.setColor(Color.BLACK);
        gg.draw(gp);
        */
        
        //S
        gg.setColor(Color.BLACK);
        gg.fillRect(260, 550, 90, 110);
        gg.setFont(new Font("Arial", Font.BOLD, 20));
        gg.setColor(new Color(255,250,77));
        gg.drawString("16", 265, 575);
        
        gg.setFont(new Font("Arial", Font.BOLD, 35));
        gg.setColor(new Color(220,0,0));
        gg.drawString("S", 265, 610);
        
        gg.setFont(new Font("Arial", Font.PLAIN, 12));
        gg.setColor(new Color(255,250,77));
        gg.drawString("Sulfur", 265, 630);
        
        gg.setFont(new Font("Arial", Font.PLAIN, 12));
        gg.setColor(new Color(255,250,77));
        gg.drawString("32.065", 265, 645);
        
        
        //Ta
        gg.setColor(Color.BLACK);
        gg.fillRect(360, 550, 90, 110);
        gg.setFont(new Font("Arial", Font.BOLD, 20));
        gg.setColor(new Color(255,250,77));
        gg.drawString("73", 365, 575);
        
        gg.setFont(new Font("Arial", Font.BOLD, 35));
        gg.setColor(new Color(220,0,0));
        gg.drawString("Ta", 365, 610);
        
        gg.setFont(new Font("Arial", Font.PLAIN, 12));
        gg.setColor(new Color(255,250,77));
        gg.drawString("Tantalum", 365, 630);
        
        gg.setFont(new Font("Arial", Font.PLAIN, 12));
        gg.setColor(new Color(255,250,77));
        gg.drawString("180.94788", 365, 645);
        
        //Nd
        gg.setColor(Color.BLACK);
        gg.fillRect(460, 550, 90, 110);
        gg.setFont(new Font("Arial", Font.BOLD, 20));
        gg.setColor(new Color(255,250,77));
        gg.drawString("60", 465, 575);
        
        gg.setFont(new Font("Arial", Font.BOLD, 35));
        gg.setColor(new Color(220,0,0));
        gg.drawString("Nd", 465, 610);
        
        gg.setFont(new Font("Arial", Font.PLAIN, 12));
        gg.setColor(new Color(255,250,77));
        gg.drawString("Neodymium", 465, 630);
        
        gg.setFont(new Font("Arial", Font.PLAIN, 12));
        gg.setColor(new Color(255,250,77));
        gg.drawString("144.242", 465, 645);
        
        //O
        gg.setColor(Color.BLACK);
        gg.fillRect(310, 670, 90, 110);
        gg.setFont(new Font("Arial", Font.BOLD, 20));
        gg.setColor(new Color(255,250,77));
        gg.drawString("8", 315, 695);
        
        gg.setFont(new Font("Arial", Font.BOLD, 35));
        gg.setColor(new Color(220,0,0));
        gg.drawString("O", 315, 730);
        
        gg.setFont(new Font("Arial", Font.PLAIN, 12));
        gg.setColor(new Color(255,250,77));
        gg.drawString("Oxygen", 315, 750);
        
        gg.setFont(new Font("Arial", Font.PLAIN, 12));
        gg.setColor(new Color(255,250,77));
        gg.drawString("15.9994", 315, 765);
        
        //Uut
        gg.setColor(Color.BLACK);
        gg.fillRect(410, 670, 90, 110);
        gg.setFont(new Font("Arial", Font.BOLD, 20));
        gg.setColor(new Color(255,250,77));
        gg.drawString("113", 415, 695);
        
        gg.setFont(new Font("Arial", Font.BOLD, 35));
        gg.setColor(new Color(220,0,0));
        gg.drawString("Uut", 415, 730);
        
        gg.setFont(new Font("Arial", Font.PLAIN, 12));
        gg.setColor(new Color(255,250,77));
        gg.drawString("Ununtrium", 415, 750);
        
        gg.setFont(new Font("Arial", Font.PLAIN, 12));
        gg.setColor(new Color(255,250,77));
        gg.drawString("284 u", 415, 765);
        
    }
}