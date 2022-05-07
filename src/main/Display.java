package main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class Display extends JPanel implements Runnable {

    // SCREEN SETTINGS

    // Tile = originalTileSize x originalTileSize pixels
    final int originalTileSize = 16;
    final int scale = 4;

    // Real tileSize = scale*originalTileSize x scale*originalTileSize pixels
    final int tileSize = originalTileSize * scale;
    // final int maxScreenCol = 24;
    // final int maxScreenRow = 12;
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCol;
    final int screenHeight = tileSize * maxScreenRow;

    Thread gameThread;

    public Display() {

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }

    public void startGameThread() {

        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {

        
    }
}