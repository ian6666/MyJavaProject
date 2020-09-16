import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gg extends World
{

    /**
     * Constructor for objects of class gg.
     * 
     */
    public gg(int a)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 571, 1); 
        end b = new end();
        addObject(b,0,0);
        if (a==1){
         addObject(new w("Player2 Won!!"),400,500);   
        }else{
         addObject(new w("Player1 Won!!"),400,500); 
        }
    }
}
