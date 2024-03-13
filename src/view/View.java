package src.view;

import java.awt.BorderLayout;
import javax.swing.*;
import src.controleur.Controleur;

public class View extends JFrame{

    private JFrame fenetre = this;
    private JButton buttonValider;
    private JLabel labelMot;

    public void setvalider(Controleur c)
    {
        buttonValider.addActionListener(c);
    }


    public View()
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            // Méthode run qui sera exécutée dans le thread de l'interface graphique
            public void run() 
            {        
                fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                labelMot = new JLabel("Entrez un mot:");
                JTextField textField = new JTextField(20);  
                buttonValider = new JButton("Valider");

                labelMot.setBounds(20,80,200,10);
                textField.setBounds(20,100,200,20);
                buttonValider.setBounds(20,120,200,20);

                fenetre.add(labelMot, BorderLayout.NORTH);
                fenetre.add(textField, BorderLayout.NORTH);
                fenetre.add(buttonValider, BorderLayout.NORTH);

                fenetre.pack();
                fenetre.setVisible(true);
            }
        });
    }
    
    public JLabel getlabelMot()
    {
        return this.labelMot;
    }
}
 