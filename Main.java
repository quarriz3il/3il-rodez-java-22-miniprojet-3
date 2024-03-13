import src.view.View;

import src.controleur.Controleur;
import src.model.Model;

public class Main {
    
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controleur controleur = new Controleur(model, view);
        view.setvalider(controleur);   
    }
    
}
