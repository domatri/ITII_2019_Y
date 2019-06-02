package com.itii.planning.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;

public  class   PanneauBouton
        extends JPanel
{
    /** Serial version ID. */
    private static final long serialVersionUID = -5910161269986510241L;

    private static final Dimension  C_BUTTON_SIZE   = new Dimension(150, 25);

    
    private JButton m_buttonCreate      = new JButton();
    private JButton m_buttonDelete      = new JButton();
    private JButton m_buttonDuplicate   = new JButton();
    private JButton m_buttonEdit        = new JButton();
    private JButton m_buttonMark        = new JButton();



    public  PanneauBouton()
    {
        this.setBackground(Color.red);
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
        button_addToContainer(m_buttonCreate, box);
        box.add(new Box.Filler(dim_min, dim_pref, dim_max));
        button_addToContainer(m_buttonEdit, box);
        box.add(new Box.Filler(dim_min, dim_pref, dim_max));
        button_addToContainer(m_buttonMark, box);
        box.add(new Box.Filler(dim_min, dim_pref, dim_max));
        button_addToContainer(m_buttonDuplicate, box);
        box.add(new Box.Filler(dim_min, dim_pref, dim_max));
        button_addToContainer(m_buttonDelete, box);
        box.add(new Box.Filler(dim_min, dim_pref, dim_max));
    }



    private void    initialize()
    {
        this.m_buttonCreate.setText("Créer");
        this.m_buttonDelete.setText("Supprimer");
        this.m_buttonDuplicate.setText("Dupliquer");
        this.m_buttonEdit.setText("Éditer");
        this.m_buttonMark.setText("Marquer");
    }



    private static void button_addToContainer(JButton pButton, Container pContainer)
    {
        pButton.setAlignmentX(Container.CENTER_ALIGNMENT);
        pContainer.add(pButton);
        pButton.setMinimumSize(C_BUTTON_SIZE);
        pButton.setMaximumSize(C_BUTTON_SIZE);
        pButton.setPreferredSize(C_BUTTON_SIZE);
    }
}
