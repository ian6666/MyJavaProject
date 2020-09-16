import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Display here.
 * 
 * @Adapted from
 * @https://www.greenfoot.org/topics/57985/0
 */
public class Display extends Actor
{
    /**
     * Act - do whatever the Display wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void setMessage(String text, int size, Color bcg, Color frg)
{
    GreenfootImage image = null;
    if (text != null && !"".equals(text)) image = new GreenfootImage(text, size, bcg, frg);
    setImage(image);
}
    
}
