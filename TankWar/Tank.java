import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tank extends Actor
{
    protected GreenfootSound crashSound = new GreenfootSound("Crash_Large.mp3");
    protected GreenfootSound tankSound = new GreenfootSound("Tank.mp3");

    private int speed;
    protected int direction;  // +1 right; -1 left
    /**
     * Act - do whatever the Tank wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public Tank(){            
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 130, image.getHeight() - 100);
        setImage(image);
        speed = 1;
        tankSound.setVolume(50);
        crashSound.setVolume(100);
    }

    public void act() 
    {

    }
    
    public void setDirection(int dir)
    {
        direction = dir;
    }
    
    public int getDirection()
    {
        return direction;
    }
    
}
