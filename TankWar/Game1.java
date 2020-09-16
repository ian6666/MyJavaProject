import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game1 extends Game
{
    private HealthBar2 h1;
    private HealthBar h2;
    /**
     * Constructor for objects of class Game1.
     * 
     */
    public Game1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(); 
        prepare();
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

    private void prepare()
    {

        Wall wall = new Wall();
        addObject(wall,406,133);
        Wall wall2 = new Wall();
        addObject(wall2,512,206);
        wall2.setRotation(90);
        wall2.setLocation(474,180);
        wall2.setLocation(474,175);
        Player player = new Player();
        addObject(player,114,45);
        player.setLocation(109,54);
        P2 p2 = new P2();
        addObject(p2,743,428);
        p2.setLocation(741,448);
        wall.setLocation(358,211);
        wall.setLocation(359,225);
        wall2.setLocation(453,300);
        wall2.setLocation(425,300);
        Wall wall3 = new Wall();
        addObject(wall3,459,217);
        wall3.changeScale(70, 80);
        wall3.setLocation(653,54);
        wall3.setLocation(650,44);
        Wall wall4 = new Wall();
        addObject(wall4,97,436);
        wall4.changeScale(70, 80);
        wall4.setLocation(169,480);
        h1 = new HealthBar2(player);
        addObject(h1,0,0);
        h2 = new HealthBar(p2);
        addObject(h2,0,0);
        gameLevel = 1;
    }
}
