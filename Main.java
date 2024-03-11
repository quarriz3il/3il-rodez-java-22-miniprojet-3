import src.view.View;

import src.controleur.Controleur;
import src.model.Model;

public class Main {
    
    public static void main(String[] args) {
        Model model = new Model();
        Controleur controleur = new Controleur();
        View view = new View(model, controleur);
        controleur.setModel(model);
        controleur.setVue(view);
        
    }
    
}
