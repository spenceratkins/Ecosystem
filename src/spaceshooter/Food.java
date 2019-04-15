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
 * @author 692589
 */
public class Food extends Creature{
  
    private int size;
    private Color color;
    private ImageIcon ii;
    private Image img;
    
    public Food(int size, int x, int y) {
        super(x,y);
        x = 50;
        y = 50;
        this.size = size;
        this.color = new Color(255,0,100,100);
        this.ii = new ImageIcon(getClass().getResource("/images/food.png"));
        this.img = ii.getImage();
    }

    @Override
    public int getSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void draw(Graphics g) {
         g.drawImage(img, x, y, size, size, null);
    }

    
    
}
