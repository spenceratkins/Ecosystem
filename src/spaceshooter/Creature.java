/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceshooter;

import java.awt.Graphics;

/**
 *
 * @author jword
 */
public abstract class Creature {
    
    //Fields
    protected int x;
    protected int y;
    protected int vx;
    protected int vy;
    final int marginX;
    final int marginY;
    

    //Constructor
    public Creature(int x, int y) {
        marginX = 10;
        marginY = 10; 
        this.x = x;
        this.y = y;
        this.vx = (int) (Math.random()*6+1);
         this.vy = (int) (Math.random()*10+1);
       
       
    }
public abstract int getSize();
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getVx() {
        return vx;
    }

    public int getVy() {
        return vy;
    }

    public Creature() {
        this(100,100);
    }
    
    public abstract void draw(Graphics g);
    
    public void update() {
        move();
    }
    
    public void move() {
        x += vx;
        y += vy;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setVx(int vx) {
        this.vx = vx;
    }

    public void setVy(int vy) {
        this.vy = vy;
    }

    
    

   
   

   
}
