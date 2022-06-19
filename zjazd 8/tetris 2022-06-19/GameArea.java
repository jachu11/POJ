package tetris;

import java.awt.Color;                      //biblioteka dla kolorów
import java.awt.Graphics;                   //biblio pozwalająca rysować elementy
import javax.swing.JPanel;                  

public class GameArea extends JPanel {       
    
    private int gridRows;
    private int gridColumns;
    private int gridCellSize;
    
    private TetrisBlock block; //zamiast private int[][] block = { {1,0}, {1,0}, {1,1}}

    public GameArea(JPanel placeholder, int columns) {
        placeholder.setVisible(false);
        this.setBounds(placeholder.getBounds() );
        this.setBackground(placeholder.getBackground() );
        this.setBorder(placeholder.getBorder() );
        /*
        dla rozmiaru, tla i ramki mam placeholder ktory przechwytuje 
        moje ustawienia z czesci 'Design'
        */
        
        gridColumns = columns;
        gridCellSize = this.getBounds().width / gridColumns;
        gridRows = this.getBounds().height / gridCellSize;
        /*  
        pole gry w tetrisie to siatka - powyżej okreslam rozmiar kazdej komórki 
        która dla kazdej szerokosci przyjmuje szerokosc / ilosc kolumn i
        dla kazdej wysokosci przyjmuje wysokosc / ilosc wierszy     
        */
        spawnBlock();
    }

    public void spawnBlock() //metoda odpowiedzialna za kolorowanie bloku
    {
        block = new TetrisBlock(new int [][] { {1,0}, {1,0}, {1,1} }, Color.blue );
    }
    
     
    private void drawBlock (Graphics g) 
        {
            int h = block.getHeight();
            int w = block.getWidth();
            Color c = block.getColor();
            int[][] shape = block.getShape();
            
          for (int row = 0; row < h; row++ )
          {
              for(int col = 0; col < w; col++)
              {
                  if (shape[row][col] ==1) 
                  {
                      int x = (block.getX() + col) * gridCellSize;
                      int y = (block.getY() + row) * gridCellSize;
                      
                      g.setColor(c);
                      g.fillRect(x, y, gridCellSize, gridCellSize);
                      g.setColor(Color.black);
                      g.drawRect(x, y, gridCellSize, gridCellSize);
                  }
              }
          }
              
              
              
              
         }
    
    
    @Override
    protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        
//            for (int y = 0; y < gridRows; y++) 
//            {
//                    for (int x = 0; x < gridColumns; x++) 
//                    {
//                        g.drawRect(x * gridCellSize, y * gridCellSize, gridCellSize, gridCellSize);
//                    }
//            }
     drawBlock (g);
    }
   
}
