import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ins here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gins extends Actor
{
    /**
     * Act - do whatever the Ins wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if("space".equals(Greenfoot.getKey())){
            Greenfoot.setWorld(new Selection());
        }
    }    
}
