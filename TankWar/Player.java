import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Tank
{
    public int gunFireDelay;
    public int minGunFireDelay;  

    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Player(){
        super();
        gunFireDelay = 100;
        minGunFireDelay = 100;

        direction = 1;

    }

    public void act() 
    {
        if(Greenfoot.isKeyDown("d"))
        {   
            tankSound.play();
            if(isTouching(P2.class))
            {
                crashSound.play();
            }

            setLocation(getX() + 1, getY());
            if(isTouching(Wall.class)/*||isTouching(P2.class)*/){
                setLocation(getX() -1 , getY());
            }
            if (direction == -1)
            {
                getImage().mirrorHorizontally();
                direction = 1;
            }

        }
        if(Greenfoot.isKeyDown("w"))
        {
            tankSound.play();      
            setLocation(getX(),getY() -1);
            if(isTouching(Wall.class)/*||isTouching(P2.class)*/){
                setLocation(getX() , getY()+ 1);
            }
        }
        if(Greenfoot.isKeyDown("a"))
        {
            tankSound.play();      
            setLocation(getX() -1, getY());
            if(isTouching(Wall.class)/*||isTouching(P2.class)*/){
                setLocation(getX() +1 , getY());
            }
            if (direction == 1)
            {
                getImage().mirrorHorizontally();
                direction = -1;
            }

        }
        if(Greenfoot.isKeyDown("s"))
        {
            tankSound.play();      
            setLocation(getX(),getY() +1);
            if(isTouching(Wall.class)/*||isTouching(P2.class)*/){
                setLocation(getX() , getY()- 1);
            }
        }
        if ("q".equals(Greenfoot.getKey())) {
            //System.out.println("no");
            Fire();
        }
        gunFireDelay++;
    }

    public void Fire()
    {
        Bullet2 b = new Bullet2();
        if(gunFireDelay >= minGunFireDelay){
            getWorld().addObject(b,getX(),getY()-4);
            b.setRotation(getRotation()+90*(1-direction));
            gunFireDelay = 0;
        }
    }
}
