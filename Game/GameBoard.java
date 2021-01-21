package Game;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GameBoard extends JFrame {


    private final ArrayList<Object> pieceCollection;

    @Override
    public void update(Graphics g) {
        
    }

    public GameBoard() {

        this.setSize(500,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(3);

        this.pieceCollection = new ArrayList<>();



       // JFrame applicationFrame = new JFrame();
       // applicationFrame.setSize(500,500);
       // applicationFrame.setVisible(true);
       // applicationFrame.setDefaultCloseOperation(3);

    }

    @Override
    public void paint(Graphics g) {
        
        super.paint(g);

        for(int row = 0; row < 5; row++);
          for(int col = 0; col < 5; col++);

        g.setColor(Color.red);
        g.fillRect(0,0,100,100);


    }
}
