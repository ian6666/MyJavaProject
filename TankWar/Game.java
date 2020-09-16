import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Game extends World
{
    protected GreenfootSound fieldSound = new GreenfootSound("Modern_Battlefield.mp3");
    protected int gameLevel;
    protected Display disp = new Display();
    protected Display level = new Display();
    /**
     * Constructor for objects of class Game.
     * 
     */
    public Game()
    {    
        super(888, 526, 1);
        disp.setMessage("Tank Wars", 50, new Color(128,0,0), Color.YELLOW);
        addObject(disp, getWidth()-disp.getImage().getWidth()/2,
                        disp.getImage().getHeight()/2);
        Title.intro.setVolume(30);                
    }
    public abstract HealthBar getHealthBar();
    public abstract HealthBar2 getHealthBar2();
    
    public void act()
    {
        fieldSound.setVolume(50);
        fieldSound.play();
    }
}
