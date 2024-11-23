package com.notesmaster;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class SideBar extends JPanel{
    public SideBar(){
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(50,Integer.MAX_VALUE));
        setBackground(Color.decode("#FFFFFF"));

        try {
            // Load the Ionicons font
            Font ioniconsFont = Ionicons.getFont(48f); // Use Ionicons class method to get the font

            // Create a JLabel to display an icon using its Unicode from Ionicons class
            JLabel iconLabel = new JLabel(Ionicons.getIcon("heart")); // Example: "heart" icon
            iconLabel.setFont(ioniconsFont);
            iconLabel.setHorizontalAlignment(SwingConstants.CENTER);

            // Add the iconLabel to the panel
            add(iconLabel, BorderLayout.CENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }


        //add(iconLabel);
    }
}