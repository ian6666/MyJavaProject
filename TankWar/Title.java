import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends World
{
    public static GreenfootSound intro = new GreenfootSound("Carmina_burana_O_Fortuna_clip.mp3");
    /**
     * Constructor for objects of class Level_1.
     * 
     */
    public Title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 572, 1);
        
        GameStarter a = new GameStarter();
        addObject(a,0,0);
        intro.setVolume(70);
        intro.playLoop();
        //prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    
}
