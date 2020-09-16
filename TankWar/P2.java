import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CPU_Red here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P2 extends Tank
{
    private int gunFireDelay2;
    private int minGunFireDelay2;
    private boolean spaceDown;

    public P2(){
        super();
        setRotation(180);
        GreenfootImage img = getImage();
        img.mirrorVertically();
        setImage(img);
        gunFireDelay2 = 95;
        minGunFireDelay2 = 100;
        direction = -1;

    }

    public void act() 
    {
        //System.out.println("start");

        if(Greenfoot.isKeyDown("right"))
        {
            tankSound.play();
            if(isTouching(Player.class))
            {
                crashSound.play();
            }
            setLocation(getX() + 1, getY());
            //turnTowards(getX() + 1, getY());
            //GreenfootImage temp = new GreenfootImage(getImage());
            //getImage().mirrorHorizontally();
            //setImage(temp);
            if (direction == -1)
            {
                getImage().mirrorHorizontally();
                direction = 1;
            }

            if(isTouching(Wall.class)/*||isTouching(Player.class)*/){
                setLocation(getX() - 1, getY());

            }
        }
        if(Greenfoot.isKeyDown("up"))
        {
            tankSound.play();      
            setLocation(getX(),getY() - 1);
            if(isTouching(Wall.class)/*||isTouching(Player.class)*/){
                setLocation(getX() , getY()+ 1);
            }
        }
        if(Greenfoot.isKeyDown("left"))
        {
            tankSound.play();      
            setLocation(getX() - 1, getY());
            //turnTowards(getX() - 1, getY());
            //GreenfootImage temp = new GreenfootImage(getImage());
            //temp.mirrorVertically();
            //setImage(temp);
            if(isTouching(Wall.class)/*||isTouching(Player.class)*/){
                setLocation(getX() + 1, getY());

            }
            if (direction == 1)
            {
                getImage().mirrorHorizontally();
                direction = -1;
            }
        }
        if(Greenfoot.isKeyDown("down"))
        {
            tankSound.play();      
            setLocation(getX(),getY() + 1);
            if(isTouching(Wall.class)/*||isTouching(Player.class)*/){
                setLocation(getX() , getY()- 1);
            }
        }

        if (Greenfoot.isKeyDown("shift")) // if change in state
        {
            //System.out.println("yes");
            spaceDown = ! spaceDown; // record new state
            if (spaceDown) Fire2(); // if key pressed, shoot
        }

        gunFireDelay2++;
    }

    public void Fire2()
    {
        //System.out.println("yes");
        Bullet b = new Bullet();
        if(gunFireDelay2 >= minGunFireDelay2){
            //System.out.println("ok");
            getWorld().addObject(b,getX(),getY()-2);
            b.setRotation(getRotation()+90*(1+direction));
            gunFireDelay2 = 0;
        }
    }
}
