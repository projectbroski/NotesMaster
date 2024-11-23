package com.notesmaster;

import javax.swing.*;
import java.awt.*;

public class Home{

    private JFrame mainFrame;
    private JLabel h;

    public Home(){
        initializeFrame();
    }

    public void initializeFrame(){
        mainFrame = new JFrame("Notes Master");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(new Dimension(450,400));

        Container contentPane = mainFrame.getContentPane();
        contentPane.setBackground(Color.decode("#444444"));

        SideBar sb = new SideBar();

        mainFrame.add(sb,BorderLayout.WEST);

        mainFrame.setVisible(true);
    }

    public static void main(String args[]){
        SwingUtilities.invokeLater(Home::new);
    }
}