package tetris;
import java.awt.Color;  

public class TetrisBlock 
{
    private int[][] shape;
    private Color color;
    private int x,y;

        public TetrisBlock(int[][] shape, Color color)
        {
            this.shape = shape;
            this.color = color;
            
            x = 3 ;
            y = 2;
        }
        
    public int[][] getShape() {
       return shape;
    }
    
    public Color getColor() {
        return color;
    }
    
    public int getHeight() {
        return shape.length;
    }
    
    public int getWidth() {
        return shape[0].length;
    }
    
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
   
}
