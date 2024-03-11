package src.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Model {

    private String motChoisi;
    private String filePath = "C:\\Users\\qziya\\Documents\\3iL\\java\\Pendu\\3il-rodez-java-22-miniprojet-3\\mots.txt";;

    public Model()
    {

    }

    public String choisirMotAleatoire() {
        ArrayList<String> mots = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                mots.add(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //
        if (mots.isEmpty()) {
            System.err.println("Le fichier est vide ou inaccessible.");
            return null;
        }

        Random random = new Random();
        int randomIndex = random.nextInt(mots.size());
        String ligneAleatoire = mots.get(randomIndex);
        String[] motsDansLigne = ligneAleatoire.split("\\s+"); // Séparer les mots par les espaces
        return motsDansLigne[0]; // Retourner le premier mot de la ligne
    }

    public String getmotChoisi()
    {
        return this.motChoisi;
    }
}
