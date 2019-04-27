package com.itii.planning.gui;

import javax.swing.Box;
import javax.swing.JFrame;

public  class   MainWindow
        extends JFrame
{

    /** Default generated serial ID. */
    private static final long serialVersionUID = 1L;

    private static MainWindow instance;


    private PanneauBouton   m_panneauBoutons;



    private MainWindow()
    {
        this.m_panneauBoutons    = new PanneauBouton();

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
        this.setSize(200, 100);
        this.setVisible(true);

        this.validate();
        this.repaint();
    }



    private void    _create_layout()
    {
        Box mainBox = Box.createHorizontalBox();
        this.add(mainBox);

        mainBox.add(this.m_panneauBoutons);
    }
}
