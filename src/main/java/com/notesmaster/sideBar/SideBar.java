package com.notesmaster;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class SideBar extends JPanel{
    public Color lightBg;

    public SideBar(Color lightBg){
        this.lightBg = lightBg;
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(250,Integer.MAX_VALUE));
        setBackground(Color.decode("#FAFAF9"));

        add(header(),BorderLayout.NORTH);

        JPanel container = new JPanel();
        container.setBackground(lightBg);
        container.setLayout(new BorderLayout());
        container.add(actionmenu(),BorderLayout.NORTH);
        container.add(foldermenu(),BorderLayout.CENTER);

        add(container,BorderLayout.CENTER);
    }

    private JPanel header(){
        JPanel mainHeader = new JPanel();
        mainHeader.setBackground(lightBg);
        mainHeader.setLayout(new BorderLayout());
        mainHeader.setBorder(BorderFactory.createEmptyBorder(30,10,10,10));

        JLabel label = new JLabel("Notes Master");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Helvetica", Font.BOLD, 24));

        mainHeader.add(label,BorderLayout.WEST);

        return mainHeader;
    }

    private JPanel actionmenu(){
        JPanel amenu = new JPanel();
        amenu.setBackground(lightBg);
        amenu.setLayout(new BoxLayout(amenu,BoxLayout.Y_AXIS));
        amenu.setBorder(BorderFactory.createEmptyBorder(40,10,10,10));

        amenu.add(options("Workspace",14));
        amenu.add(options("Personal",14));
        amenu.add(options("Priority",14));
        amenu.add(options("Deleted",14));

        return amenu;
    }

    private JPanel foldermenu(){
        JPanel fmenu = new JPanel();
        fmenu.setLayout(new BoxLayout(fmenu,BoxLayout.Y_AXIS));
        fmenu.setBackground(lightBg);
        fmenu.setBorder(BorderFactory.createEmptyBorder(40,10,10,10));

        fmenu.add(options("Recents",12));
        fmenu.add(plainoptions("Meeting with John",12));
        fmenu.add(plainoptions("Assignment check",12));
        fmenu.add(plainoptions("Call Mike",12));

        return fmenu;
    }

    private JLabel options(String heading,int size){
        JLabel text = new JLabel(heading);
        text.setFont(new Font("Helvetica", Font.BOLD, size));
        text.setBorder(BorderFactory.createEmptyBorder(10,0,10,0));
        return text;
    }

    private JLabel plainoptions(String heading,int size){
        JLabel text = new JLabel(heading);
        text.setFont(new Font("Helvetica", Font.PLAIN, size));
        text.setBorder(BorderFactory.createEmptyBorder(10,0,10,0));
        return text;
    }
}