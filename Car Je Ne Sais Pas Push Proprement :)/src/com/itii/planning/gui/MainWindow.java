package com.itii.planning.gui;

import java.awt.Dimension;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.BorderLayout;

public  class   MainWindow
        extends JFrame
{

    /** Default generated serial ID. */
    private static final long serialVersionUID = 1L;

    private static MainWindow instance;


    private PanneauBouton   m_panneauBoutons = null;
    private PanneauMenuDeroulant m_panneauMenuDeroulant = null;
    private PanneauCalendar m_panneauCalendarListe = null;
    private PanneauCalendar m_panneauCalendarSemaine = null;
    private PanneauCalendar m_panneauCalendarMois = null;



    private MainWindow()
    {
        this.m_panneauBoutons    = new PanneauBouton();
        this.m_panneauMenuDeroulant = new PanneauMenuDeroulant();
        this.m_panneauCalendarListe = new PanneauCalendar();
        this.m_panneauCalendarSemaine = new PanneauCalendar();
        this.m_panneauCalendarMois = new PanneauCalendar();
        
        this._create_layout();

        initialize();
    }

    public static MainWindow getInstance()
    {
        if (instance == null)
        {
            instance = new MainWindow();
        }

        return instance;
    }

    private void initialize()
    {
        Dimension FixedDimension = new Dimension(800,600);
        this.setSize(800, 600);
        this.setName("test");
        this.validate();
        this.repaint();

        /*
        this.setPreferredSize(FixedDimension);
        this.setMinimumSize(FixedDimension);
        this.setMaximumSize(FixedDimension);
        */
        this.setTitle("Youpi");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        // Creation des menus dans la barre de menus
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);
        JMenu editMenu = new JMenu("Edit");
        menuBar.add(editMenu);
        JMenu viewMenu = new JMenu("View");
        menuBar.add(viewMenu);
        JMenu helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);

        // Creation des items dans menu file
        JMenuItem quitItem = new JMenuItem("Quit");
        fileMenu.add(quitItem);
        JMenuItem createItem = new JMenuItem("Create");
        editMenu.add(createItem);
        JMenuItem editItem = new JMenuItem("Edit");
        editMenu.add(editItem);
        JMenuItem markItem = new JMenuItem("Mark");
        editMenu.add(markItem);
        JMenuItem duplicateItem = new JMenuItem("Duplicate");
        editMenu.add(duplicateItem);
        JMenuItem deleteItem = new JMenuItem("Delete");
        editMenu.add(deleteItem);

        // Creation des items dans menu view
        JMenuItem listItem = new JMenuItem("List");
        viewMenu.add(listItem);
        JMenuItem weekItem = new JMenuItem("Week");
        viewMenu.add(weekItem);
        JMenuItem monthItem = new JMenuItem("Month");
        viewMenu.add(monthItem);

        // Creation des panels

        this.setVisible(true);
    }

    private void _create_layout()
    {
        Box mainBox = Box.createHorizontalBox();
        getContentPane().add(mainBox, BorderLayout.NORTH);
        
        mainBox.add(this.m_panneauMenuDeroulant);
        
        
        Box buttonBox = Box.createHorizontalBox();
        getContentPane().add(buttonBox, BorderLayout.EAST);
        
        buttonBox.add(this.m_panneauBoutons);
        
        
        Box calendarBox = Box.createHorizontalBox();
        getContentPane().add(calendarBox, BorderLayout.CENTER);
      
        calendarBox.add(this.m_panneauCalendarListe);
        //TO DO : ActionListener pour affecter la combobox au bon panel
        //calendarBox.add(this.m_panneauCalendarSemaine);
        //calendarBox.add(this.m_panneauCalendarMois);
        
    }
}
