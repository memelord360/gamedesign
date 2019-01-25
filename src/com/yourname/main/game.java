/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yourname.main;

import javax.swing.JFrame;

public class game 
{
    public static final int WINDOW_WIDTH = 800; 
    public static final int WINDOW_HEIGHT = 384;
    private static final String TITLE = "New and Improved Game";
    private JFrame mainWindow;
    private LevelPanel lp;
    
    public game()
    {
        initGame();
        initComponents();
        initWindow();
        lp.startGame();
    }
    private void initGame()
    {
        lp = new LevelPanel();
        mainWindow = new JFrame();
    }
    private void initComponents()
    {
        mainWindow.add(lp);
    }
    private void initWindow()
    {
       mainWindow.setTitle(game.TITLE); 
       mainWindow.setSize(game.WINDOW_WIDTH, game.WINDOW_HEIGHT);
       mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       mainWindow.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        game g = new game();
    }
}
