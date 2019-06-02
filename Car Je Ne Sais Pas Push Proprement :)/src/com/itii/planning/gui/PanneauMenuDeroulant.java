package com.itii.planning.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JLabel;

public  class   PanneauMenuDeroulant
        extends JPanel
{
    /** Serial version ID. */
    private static final long serialVersionUID = -5910161269986510241L;

    private static final Dimension  C_COMBOBOX_SIZE   = new Dimension(150, 25);


    private JComboBox<String> m_comboBoxTypeView      = new JComboBox<String>();   
    private JLabel m_labelTypeView                    = new JLabel("Vue : ");
    private Box box;
    

    
    public  PanneauMenuDeroulant()
    {
        this.setBackground(Color.blue);
        this.setPreferredSize(new Dimension(354, 80));

        this._create_layout();
        
        this.initialize();
    }



    private void    _create_layout()
    {
        box = Box.createHorizontalBox();
        this.add(box);

        final Dimension dim_min     = new Dimension(10,10);
        final Dimension dim_pref    = new Dimension(25,25);
        final Dimension dim_max     = new Dimension(1000,1000);
        box.add(m_labelTypeView);
        box.add(new Box.Filler(dim_min, dim_pref, dim_max));
        JCombo_addToContainer(m_comboBoxTypeView, box);       
    }



    private void    initialize()
    {
        this.m_comboBoxTypeView.setModel(new DefaultComboBoxModel<String>(new String[] {"Liste", "Semaine", "Mois"}));
        
    }


    
    private static void JCombo_addToContainer(JComboBox<String> m_comboBoxTypeView, Container pContainer)
    {	
	m_comboBoxTypeView.setAlignmentX(Container.CENTER_ALIGNMENT);
        pContainer.add(m_comboBoxTypeView);
        m_comboBoxTypeView.setMinimumSize(C_COMBOBOX_SIZE);
        m_comboBoxTypeView.setMaximumSize(C_COMBOBOX_SIZE);
        m_comboBoxTypeView.setPreferredSize(C_COMBOBOX_SIZE);
    }
    
}
