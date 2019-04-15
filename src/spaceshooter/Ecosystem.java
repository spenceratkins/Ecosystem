/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceshooter;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author jword
 */
public class Ecosystem extends JPanel {

    private Timer timer;
    private Cow[] cows;
    private Sloth[] sloths;   
    private Donkey[] donkeys;
    private Food[] foods;
    public Ecosystem() {
        super();
        setSize(1200, 800);
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduleTask(), 1000, 1000/24);
        cows = new Cow[10];
        sloths = new Sloth[10];
        donkeys = new Donkey[5];
        foods = new Food[4];
        foods[0] = new Food(50, 50,50);
        foods[1] = new Food(50,this.getWidth() - 50,50);
        foods[2] = new Food(50, 50,this.getHeight()- 50);
        foods[3] = new Food(50, this.getWidth()-50,this.getHeight()-50);
        spawnCows();
        spawnSloths();
        spawnDonkeys();
        
    }
    
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.GREEN);
         for (Cow cow : cows){
             if (cow != null)
             cow.draw(g);
         }
         for (Sloth sloth : sloths){
             if (sloth != null)
             sloth.draw(g);
            
         }
         for (Donkey donkey : donkeys){
             if (donkey != null)
             donkey.draw(g);
            
         }
         for (Food food : foods){
             if (food != null)
             food.draw(g);
            
         }
         
     
        
        
    }
private void spawnCows() {
        for (int i = 0; i < 10; i++) {
            cows[i]= new Cow (150, 10 + i * 100, 300);
        }
}
   private void spawnSloths() {
        for (int i = 0; i < 10; i++) {
            sloths[i]= new Sloth (50, 10 + i * 80, 80);
        }
}
    private void spawnDonkeys() {
        for (int i = 0; i < 5; i++) {
            donkeys[i]= new Donkey (150, 5 + i * 50, 50);
        }
}
    
    private class ScheduleTask extends TimerTask {
    
        @Override
        public void run() {
             for (Cow cow : cows){
             if (cow != null){
             wallCollissions(cow);
             cow.update();
             }
         }
             for (Sloth sloth : sloths){
             if (sloth != null){
             wallCollissions(sloth);
             sloth.update();
             }
         }
             for (Donkey donkey : donkeys){
             if (donkey != null){
             wallCollissions(donkey);
             donkey.update();
             }
         }
      
            
            repaint();
        }
  
  
    }
      private void wallCollissions(Creature c) {
        //walls = this.getWidth(), this.getHeight(), 0
        //where the hero is = hero.getX(), hero.getY()
        if (c.getX() <= 0 || c.getX() + 20 >= this.getWidth() ) {
            c.setVx(-c.getVx());
        }
        if (c.getY() <= 0 || c.getY() + 20 >= this.getHeight() ) {
            c.setVy(-c.getVy());
        }
    }

    
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            
        }
        else if (e.getKeyCode() == KeyEvent.VK_UP) {
            
        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            
        }
    }
    
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            
            
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
            
            
        if (e.getKeyCode() == KeyEvent.VK_UP)
            
            
        if (e.getKeyCode() == KeyEvent.VK_DOWN)
            
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            
        }
            
    }
    private void characterVsCharacter(Creature c, Creature c1) {
if (c.getX() + c.getSize() > c1.getX() 
&& c.getX() < c1.getX() + c1.getSize()
&& c.getY() + c.getSize()> c1.getY()
&& c.getY() < c1.getY() + c1.getSize()) {

//Characters bounce in oposite directions
int tempVx = c.getVx();
int tempVy = c.getVy();
c.setVx(c1.getVx());
c.setVy(c1.getVy());
c1.setVx(tempVx);
c1.setVy(tempVy);
c.move();
c1.move(); 
}
}
     
  
          
       }
    
    
    
    
    
    
