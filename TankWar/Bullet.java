import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    private boolean hit = false;
    private GreenfootSound bulletSound = new GreenfootSound("bullet.mp3");
    private GreenfootSound explosionSound = new GreenfootSound("Bomb.mp3");

    public Bullet(){
        getImage().scale(getImage().getWidth()-30,getImage().getHeight()-10); 
        setRotation(270);
        bulletSound.play();
    }

    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isTouching(Player.class)){
            hit = true;
            explosionSound.play();
        }
        move(5);
        if (isAtEdge() || isTouching(Wall.class))
        {
            getWorld().removeObject(this);
            
        }
        if(getWorld()!=null && hit){
                ((Game)getWorld()).getHealthBar2().loseHealth();
                getWorld().removeObject(this);
            }
            hit = false;
    }
}
