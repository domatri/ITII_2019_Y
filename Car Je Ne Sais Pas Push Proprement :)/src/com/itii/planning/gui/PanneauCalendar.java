package com.itii.planning.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;

public  class   PanneauCalendar
        extends JPanel
{
    /** Serial version ID. */
    private static final long serialVersionUID = -5910161269986510241L;

    private static final Dimension  C_PANEL_SIZE   = new Dimension(150, 25);

    
    private JPanel m_panelCalendar      = new JPanel();



    public  PanneauCalendar()
    {
        this.setBackground(Color.green);
        this.setPreferredSize(new Dimension(100,200));

        this._create_layout();
        
        this.initialize();
    }



    private void    _create_layout()
    {
        Box box = Box.createVerticalBox();
        this.add(box);

        final Dimension dim_min     = new Dimension(10,10);
        final Dimension dim_pref    = new Dimension(25,25);
        final Dimension dim_max     = new Dimension(1000,1000);

        box.add(new Box.Filler(dim_min, dim_pref, dim_max));
        JPanel_addToContainer(m_panelCalendar, box);
        
    }



    private void    initialize()
    {
        
    }



    private static void JPanel_addToContainer(JPanel pPanel, Container pContainer)
    {
	pPanel.setAlignmentX(Container.CENTER_ALIGNMENT);
        pContainer.add(pPanel);
        pPanel.setMinimumSize(C_PANEL_SIZE);
        pPanel.setMaximumSize(C_PANEL_SIZE);
        pPanel.setPreferredSize(C_PANEL_SIZE);
    }
}
