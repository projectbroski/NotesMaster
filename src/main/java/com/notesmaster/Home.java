package com.notesmaster;

import javax.swing.*;
import java.awt.*;

public class Home{

    private JFrame mainFrame;
    private JLabel h;
    public Color mainColor=Color.decode("#FFFFFF");
    public Color lightColor=Color.decode("#FAFAF9");

    public Home(){
        initializeFrame();
    }

    public void initializeFrame(){
        mainFrame = new JFrame("Notes Master");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(new Dimension(450,400));

        Container contentPane = mainFrame.getContentPane();
        contentPane.setBackground(Color.decode("#FFFFFF"));

        SideBar sb = new SideBar(lightColor);
        MainPanel mp = new MainPanel(mainColor);

        mainFrame.add(sb,BorderLayout.WEST);
        mainFrame.add(mp,BorderLayout.CENTER);

        mainFrame.setVisible(true);
    }

    public static void main(String args[]){
        System.setProperty("awt.useSystemAAFontSettings", "on");
        System.setProperty("swing.aatext", "true");
        SwingUtilities.invokeLater(Home::new);
    }
}