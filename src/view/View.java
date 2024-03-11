package src.view;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.*;

import src.controleur.Controleur;
import src.model.Model;

public class View extends JFrame{

    private Model model;
    private JLabel libelle;
    JFrame fenetre = this;

    public View(Model model, Controleur controleur)
    {
        this.model = model;
        this.libelle = new JLabel(model.choisirMotAleatoire());

        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            // Méthode run qui sera exécutée dans le thread de l'interface graphique
            public void run() 
            {
                fenetre.getContentPane().add(libelle);
            
                fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
                JButton boutonStart = new JButton("Commencer Partie");
                boutonStart.addActionListener(controleur);
        
                fenetre.add(boutonStart, BorderLayout.NORTH);
                
                fenetre.pack();
                fenetre.setVisible(true);
            }
        });
    }

    public void setlibelle()
    {
        libelle.setText(model.getmotChoisi());
    }

    
}
