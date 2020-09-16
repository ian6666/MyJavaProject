import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game3 extends Game
{
    private HealthBar2 h1;
    private HealthBar h2;
    /**
     * Constructor for objects of class Game3.
     * 
     */
    public Game3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(); 
        Wall wall = new Wall();
        addObject(wall,444,0);
        Wall wall2 = new Wall();
//        addObject(wall2,444,150);
        addObject(wall2,444,144);
        Wall wall3 = new Wall();
//        addObject(wall3,444,375);
        addObject(wall3,444,380);
        Wall wall4 = new Wall();
        addObject(wall4,444,450);
        Player player = new Player();
        addObject(player,167,281);
        P2 p2 = new P2();
        addObject(p2,780,281);
        h1 = new HealthBar2(player);
        addObject(h1,0,0);
        h2 = new HealthBar(p2);
        addObject(h2,0,0);
        gameLevel = 3;

        level.setMessage("Level: "+gameLevel, 28, Color.BLUE, null);
        addObject(level, getWidth()-disp.getImage().getWidth()/2,
            disp.getImage().getHeight()+level.getImage().getHeight()/2);

    }
    public HealthBar getHealthBar(){
        return h2;

    }

    public HealthBar2 getHealthBar2(){
        return h1;

    }
}
