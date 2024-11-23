package com.notesmaster;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel{
    public Color bgColor;

    public MainPanel(Color bgColor){
        this.bgColor = bgColor;
        setLayout(new BorderLayout());
        setBackground(Color.decode("#444444"));

        add(container());
    }

    private JPanel container(){
        JPanel container = new JPanel();
        container.setLayout(new BorderLayout());
        container.setBackground(bgColor);

        container.add(welcome(),BorderLayout.CENTER);

        return container;
    }

    private JPanel welcome(){
        JPanel wcontent = new JPanel();
        wcontent.setBackground(bgColor);
        wcontent.setLayout(new BorderLayout());
        wcontent.setBorder(BorderFactory.createEmptyBorder(30,70,10,10));

        JPanel contentContainer = new JPanel();
        contentContainer.setBackground(bgColor);
        contentContainer.setLayout(new BoxLayout(contentContainer,BoxLayout.Y_AXIS));

        contentContainer.add(heading("Welcome to Notes Master",22));
        contentContainer.add(plainoptions("Your new place to write, edit and to track your work along with all your documents ",15));
        contentContainer.add(plainoptions("and writings organised in one place.",15));
        contentContainer.add(inputBox());


        wcontent.add(contentContainer,BorderLayout.CENTER);

        return wcontent;
    }

    private JPanel inputBox() {
    JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT)); // Use FlowLayout for constrained size
    panel.setBackground(bgColor);

    JTextField tp = new JTextField("Folder name", 30); // Set preferred width with columns
    tp.setBorder(BorderFactory.createEmptyBorder(10,40,10,10));
    tp.setFont(new Font("Helvetica", Font.PLAIN, 18));
    tp.setOpaque(true);
    panel.add(tp);

    return panel;
}

    private JLabel heading(String heading,int size){
        JLabel text = new JLabel(heading);
        text.setFont(new Font("Helvetica", Font.BOLD, size));
        text.setBorder(BorderFactory.createEmptyBorder(5,0,10,0));
        return text;
    }

     private JLabel plainoptions(String heading,int size){
        JLabel text = new JLabel(heading);
        text.setFont(new Font("Arial", Font.PLAIN, size));
        text.setHorizontalAlignment(SwingConstants.CENTER);
        text.setBorder(BorderFactory.createEmptyBorder(5,0,5,0));
        return text;
    }
}