package com.itii.planning.gui;

import javax.swing.JFrame;

public  class   MainWindow
        extends JFrame
{

    /** Default generated serial ID. */
    private static final long serialVersionUID = 1L;

    private static MainWindow instance;



    private MainWindow()
    {
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
}