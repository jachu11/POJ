package tetris;

import java.awt.Color;                      //biblioteka dla kolorów
import java.awt.Graphics;                   //biblio pozwalająca rysować elementy
import javax.swing.JPanel;                  

public class GameArea extends JPanel {       
    
    private int gridRows;
    private int gridColumns;
    private int gridCellSize;

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
        gridRows = this.getBounds().height/ gridCellSize;
        /*  
        pole gry w tetrisie to siatka - powyżej okreslam rozmiar kazdej komórki 
        która dla kazdej szerokosci przyjmuje szerokosc / ilosc kolumn i
        dla kazdej wysokosci przyjmuje wysokosc / ilosc wierszy     
        */
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int x = 0; x < gridColumns; x++) {
            g.drawRect(x * gridCellSize, 0, gridCellSize, gridCellSize);
        }
    }

}
