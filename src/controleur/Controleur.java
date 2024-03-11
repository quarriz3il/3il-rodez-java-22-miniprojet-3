package src.controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import src.model.Model;
import src.view.View;

public class Controleur implements ActionListener{

    private Model model;
    private View vue;

    public Controleur()
    {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.vue.setlibelle();
    }

    public void setVue(View vue){
        this.vue = vue;
    }

    public void setModel(Model model){
        this.model = model;
    }
    
}
