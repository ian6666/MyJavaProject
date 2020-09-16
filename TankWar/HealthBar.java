import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends Actor
{
    int health =4;
    int healthBarWidth = 120;
    int healthBarHeight = 15;
    int pixelsPerHealthPoint = (int)healthBarWidth/health;
    Tank me;
    public HealthBar(Tank a){
        me = a;
        //update();
    }
    /**
     * Act - do whatever the HealthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        update();
    } 
    
    
    public void update(){
        setLocation(me.getX()+4,me.getY()+25);
        setImage(new GreenfootImage(healthBarWidth +2, healthBarHeight+2));
        GreenfootImage m = getImage();
        m.setColor(Color.WHITE);
        m.drawRect(0,0,healthBarWidth+1,healthBarHeight + 1);
        m.setColor(Color.RED);
        m.fillRect(1,1,health*pixelsPerHealthPoint,healthBarHeight);
        if(health<=0){
            Greenfoot.setWorld(new gg(2));
        }
    }
    
    public void loseHealth(){
     health--;   
    }
}
