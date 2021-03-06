import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    private boolean isDown;
    private String key;
    private String sound;
    private String notPressed;
    private String pressed;
    
    public Key ( String keyName, String soundFile, String keyNotPressed, String keyPressed)
    {
        key = keyName;
        sound = soundFile;
        notPressed = keyNotPressed;
        pressed = keyPressed;
        
        setImage( notPressed + ".png");
    }
    
    /**
     * Create a new key.
     */
    public Key()
    {
        
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        if(isDown == false && Greenfoot.isKeyDown(key))
        {
            setImage(pressed + ".png");
            isDown = true;
            play();
        }
        
        if(isDown == true && !Greenfoot.isKeyDown(key))
        {
            setImage(notPressed + ".png");
            isDown = false;
        }
       
    }
    
    private void play()
    {
        Greenfoot.playSound( sound +".wav" );
    }
}

