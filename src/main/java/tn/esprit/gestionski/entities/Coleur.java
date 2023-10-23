package tn.esprit.gestionski.entities;

public enum Coleur {
    VERT("vert"),
    BLEU("bleu"),
    ROUGE("rouge"),
    NOIR("noir");
    private String coleur;
    Coleur(String coleur){
        this.coleur = coleur;
    }

    public String getColeur() {
        return coleur;
    }
}
