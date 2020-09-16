import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameStarter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameStarter extends Actor
{
    /**
     * Act - do whatever the GameStarter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean gameStarted;
    public GameStarter(){
        gameStarted = false;
        //System.out.println("start");
    }
    
    public void act(){
        start();
        
    }

    public void start(){
        if("space".equals(Greenfoot.getKey())){
            Greenfoot.setWorld(new Instruction());
        }
    }
}

