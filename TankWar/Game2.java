import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game2 extends Game
{
    private HealthBar2 h1;
    private HealthBar h2;
    /**
     * Constructor for objects of class Game2.
     * 
     */
    public Game2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(); 
        prepare();
        gameLevel = 2;
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

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Wall wall = new Wall();
        addObject(wall,449,91);
        wall.setLocation(387,76);
        Wall wall2 = new Wall();
        addObject(wall2,373,452);
        wall2.setLocation(383,452);
        Wall wall3 = new Wall();
        addObject(wall3,523,378);
        wall3.setLocation(433,447);
        Wall wall4 = new Wall();
        addObject(wall4,286,301);
        wall4.setLocation(321,447);
        wall4.setLocation(339,425);
        Wall wall5 = new Wall();
        addObject(wall5,17,445);
        wall5.setLocation(25,450);
        wall4.setLocation(346,400);
        wall4.setLocation(325,397);
        Wall wall6 = new Wall();
        addObject(wall6,270,461);
        wall6.setLocation(283,451);
        Wall wall7 = new Wall();
        addObject(wall7,212,449);
        wall7.setLocation(500,158);
        wall7.setLocation(516,78);
        wall7.setLocation(598,94);
        wall6.setLocation(207,428);
        wall4.setLocation(320,354);
        wall4.changeScale(150, 50);
        wall4.setLocation(342,236);
        wall4.setLocation(411,338);
        wall4.setLocation(314,119);
        wall2.setLocation(773,152);
        wall7.setLocation(622,54);
        wall7.setLocation(634,65);
        wall4.setLocation(332,134);
        wall3.setLocation(422,374);
        wall3.changeScale(50, 50);
        wall3.setLocation(403,251);
        wall2.setLocation(322,456);
        wall2.changeScale(50, 50);
        wall2.setLocation(580,405);
        wall3.setLocation(398,242);
        wall2.setLocation(568,385);
        wall6.setLocation(255,436);
        Wall wall8 = new Wall();
        addObject(wall8,502,427);
        wall8.changeScale(50, 50);
        wall8.setLocation(417,442);
        wall2.setLocation(655,302);
        wall8.setLocation(535,430);
        wall8.setLocation(534,414);
        Wall wall9 = new Wall();
        addObject(wall9,860,462);
        wall9.setLocation(860,458);
        wall9.setLocation(861,451);
        Wall wall10 = new Wall();
        addObject(wall10,744,307);
        wall10.setLocation(688,390);
        wall10.setLocation(703,411);
        wall8.setLocation(506,381);
        wall10.changeScale(50, 50);
        wall10.setLocation(673,508);
        wall2.setLocation(646,289);
        wall3.setLocation(413,217);
        wall8.setLocation(469,380);

        Player player = new Player();
        addObject(player,213,23);
        player.setLocation(276,47);
        wall7.setLocation(612,90);
        wall7.setLocation(568,91);
        wall7.setLocation(577,87);

        P2 p2 = new P2();
        //addObject(p2,764,57);
        addObject(p2,764,450);
        h1 = new HealthBar2(player);
        addObject(h1,0,0);
        h2 = new HealthBar(p2);
        addObject(h2,0,0);
    }
}
