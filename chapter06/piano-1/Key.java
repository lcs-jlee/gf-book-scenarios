import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    //tracks whether is "piano key down" image has already been set or not.
    //isDown is primitive data type
    private boolean isDown;
    //Track what key is being played AND what sound file to play
    //key and sound are object data types -shows in black, type in Capitalized
    private String key;
    private String sound;
    private boolean keyWhite;
    /**
     * Create a new key.
     * Constructor
     */
    public Key(String keyName,String soundFile, boolean isKeyWhite)
    {
        //Key begins in the "up" position
        isDown = false;
        
        //Initialize the key and sound instance variables
        
        key = keyName;
        sound = soundFile;
        keyWhite = isKeyWhite;
        if (keyWhite == false)
        {
            setImage("black-key.png");
        }
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        
        
        if (keyWhite == true)
        {
            if (!isDown && Greenfoot.isKeyDown(key))
            {
                setImage("white-key-down.png");
                play();
                isDown = true;
            }
            if (isDown == true && !Greenfoot.isKeyDown(key))
            {
                setImage("white-key.png");
                isDown = false;
            }
        }
        else
        {
            
            if (!isDown && Greenfoot.isKeyDown(key))
            {
                setImage("black-key-down.png");
                play();
                isDown = true;
            }
            if (isDown == true && !Greenfoot.isKeyDown(key))
            {
                setImage("black-key.png");
                isDown = false;
            }
        }
        
    }
    /**
     * Play the note of this key
     */
    public void play()
    {
        Greenfoot.playSound(sound + ".wav");
        
    }
}

