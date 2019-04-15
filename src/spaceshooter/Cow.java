/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceshooter;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author jword
 */
public class Cow extends Creature {
    private int size;
    private Color color;
    private ImageIcon ii;
    private Image img;
    
    public Cow(int size, int x, int y) {
        super(x,y);
        this.size = size;
        this.color = new Color(255,0,100,100);
        this.ii = new ImageIcon(getClass().getResource("/images/dairy-cow.png"));
        this.img = ii.getImage();
    }
    
   

   

    
    
    @Override
    public void draw(Graphics g) {
        //g.drawOval(x, y, size, size);
        g.drawImage(img, x, y, size, size, null);
    }

    @Override
    public int getSize() {
        return size;
    }

  
    
}
