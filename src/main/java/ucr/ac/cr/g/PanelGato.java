/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.g;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Marco
 */
public class PanelGato extends JPanel {    
    
    int tammax, tam, can, res;
    
    boolean i1 = false, i2 = false;
    boolean ic1 = false, ic2 = false;
    boolean ib1 = false, ib2 = false;

    boolean c1 = false, c2 = false;
    boolean cc1 = false, cc2 = false;
    boolean cb1 = false, cb2 = false;

    boolean d1 = false, d2 = false;
    boolean dc1 = false, dc2 = false;
    boolean db1 = false, db2 = false;

    public PanelGato(int tammax, int can) {
        this.tammax = tammax;
        this.can = can;
        this.tam = tammax / can;
        this.res = tammax % can;
    }

    /**
     *
     * @param pintor
     */
    @Override
    public void paint(Graphics pintor) {
        Image image = new ImageIcon("./src/main/resources/img/steve.png").getImage();
        Image image2 = new ImageIcon("./src/main/resources/img/creeper.png").getImage();
        super.paint(pintor);
        for (int i = 0; i < can; i++) {
            for (int j = 0; j < can; j++) {
                pintor.setColor(Color.gray);
                pintor.fillRect(res / 2 + i * tam, res / 2 + j * tam, 150, 150);
            }

        }

        if (i1 == true) {
            pintor.drawImage(image, res / 2 + 0 * tam, res / 2 + 0 * tam, null);
        }

        if (i2 == true) {
            pintor.drawImage(image2, res / 2 + 0 * tam, res / 2 + 0 * tam, null);
        }
        if (ic1 == true) {
            pintor.drawImage(image, res / 2 + 0 * tam, res / 2 + 1 * tam, null);
        }

        if (ic2 == true) {
            pintor.drawImage(image2, res / 2 + 0 * tam, res / 2 + 1 * tam, null);
        }
        if (ib1 == true) {
            pintor.drawImage(image, res / 2 + 0 * tam, res / 2 + 2 * tam, null);
        }

        if (ib2 == true) {
            pintor.drawImage(image2, res / 2 + 0 * tam, res / 2 + 2 * tam, null);
        }
        //centro
        if (c1 == true) {
            pintor.drawImage(image, res / 2 + 1 * tam, res / 2 + 0 * tam, null);
        }
        if (c2 == true) {
            pintor.drawImage(image2, res / 2 + 1 * tam, res / 2 + 0 * tam, null);
        }
        if (cc1 == true) {
            pintor.drawImage(image, res / 2 + 1 * tam, res / 2 + 1 * tam, null);
        }

        if (cc2 == true) {
            pintor.drawImage(image2, res / 2 + 1 * tam, res / 2 + 1 * tam, null);
        }
        if (cb1 == true) {
            pintor.drawImage(image, res / 2 + 1 * tam, res / 2 + 2 * tam, null);
        }

        if (cb2 == true) {
            pintor.drawImage(image2, res / 2 + 1 * tam, res / 2 + 2 * tam, null);
        }
        //de
        if (d1 == true) {
            pintor.drawImage(image, res / 2 + 2 * tam, res / 2 + 0 * tam, null);
        }
        if (d2 == true) {
            pintor.drawImage(image2, res / 2 + 2 * tam, res / 2 + 0 * tam, null);
        }
        if (dc1 == true) {
            pintor.drawImage(image, res / 2 + 2 * tam, res / 2 + 1 * tam, null);
        }
        if (dc2 == true) {
            pintor.drawImage(image2, res / 2 + 2 * tam, res / 2 + 1 * tam, null);
        }
        if (db1 == true) {
            pintor.drawImage(image, res / 2 + 2 * tam, res / 2 + 2 * tam, null);
        }
        if (db2 == true) {
            pintor.drawImage(image2, res / 2 + 2 * tam, res / 2 + 2 * tam, null);
        }

    }

}
