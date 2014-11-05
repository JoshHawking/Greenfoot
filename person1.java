import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.*;
import java.awt.Color;

/**
 * Write a description of class person1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class person1 extends Actor
{
    
    
    
    int count = 0;
    boolean win = false;

    /**
     * Act - do whatever the person1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        barrel();

        if(win == false){

        }else{
            endGame();
        }     

        key();
        MouseInfo pointer = Greenfoot.getMouseInfo();
        if(pointer != null)
        {
            int mouseX = pointer.getX();
            int mouseY = pointer.getY();
            turnTowards(mouseX, mouseY);
            int button = pointer.getButton();
            if(button == 1)
            {
                move(5);
            }
        }

    }    

    private void endGame(){

        
        Greenfoot.stop();

        return;
    } 
    private void barrel(){
        if(isTouching(barrel.class)){
            if(count == 5){
                win = true;

            }     
            else{
                removeTouching(barrel.class);
                count++;  

            }    

        }

    }

    private void key(){

        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+5 ,getY());

        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-5,getY());
        }
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX() ,getY()-5);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX() ,getY()+5);
        }
    }

}
