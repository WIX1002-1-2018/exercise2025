/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W10;

/**
 *
 * @author pensyarah
 */
public class Coordinate {
    public double x;
    public double y;
    
    public Coordinate(){
        this.x = 0;
        this.y = 0;
    }
    
    public Coordinate(double x,double y){
        this.x=x;
        this.y=y;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public void setX(double x){
        this.x = x;
    }
    
    public void setY(double y){
        this.y = y;
    }
    public void display(){
        System.out.printf("Coordinate : (%.2f,%.2f)\n", x, y);
    }
}
