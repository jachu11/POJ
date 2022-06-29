package tetris;

import java.util.logging.Level;
import java.util.logging.Logger;

public class GameThread extends Thread 
{
    private GameArea ga;
    
    public GameThread(GameArea ga)
    {
        this.ga = ga;
        
        
    }
    
    
    
    
     @Override
     public void run()
     {
         while(true)
         {
             ga.spawnBlock();
             
             while (ga.moveBlockDown())
             {
        
                try {
                    ga.moveBlockDown();
                    Thread.sleep(500);

                } catch (InterruptedException ex) {
                    Logger.getLogger(GameThread.class.getName()).log(Level.SEVERE, null, ex);
                }
             }
             if(ga.isBlockOutOfBounds())
             {
                 System.out.println("game over");
                 break;
             }
             ga.moveBlockToBackground();
             ga.clearLines();
     }  
     }
}
