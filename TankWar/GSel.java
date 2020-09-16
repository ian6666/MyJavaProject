import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GSel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GSel extends Actor
{
    /**
     * Act - do whatever the GSel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("1")){
            //System.out.println("1");
            Greenfoot.setWorld(new Game1());
        }
        if(Greenfoot.isKeyDown("2")){
            //System.out.println("ok");
            Greenfoot.setWorld(new Game2());
        }
        if(Greenfoot.isKeyDown("3")){
            Greenfoot.setWorld(new Game3());
        }
    }    
}
