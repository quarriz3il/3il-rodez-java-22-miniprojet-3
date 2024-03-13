package src.view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.*;

import src.controleur.Controleur;
import src.model.Model;

public class View extends JFrame{

    private JFrame fenetre = this;

    public View()
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            // Méthode run qui sera exécutée dans le thread de l'interface graphique
            public void run() 
            {        
                fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JLabel labelMot = new JLabel("Entrez un mot:");
                JTextField textField = new JTextField(20);  
                JButton buttonValider = new JButton("Valider");

                labelMot.setBounds(20,80,200,10);
                textField.setBounds(20,100,200,20);
                buttonValider.setBounds(20,120,200,20);

   
                fenetre.add(labelMot, BorderLayout.NORTH);
                fenetre.add(textField, BorderLayout.NORTH);
                fenetre.add(buttonValider, BorderLayout.NORTH);

                //buttonValider.addActionListener(controleur);
                
                fenetre.pack();
                fenetre.setVisible(true);
            }
        });
    }    
}
 