package tn.esprit.gestionski.entities;

public enum TypeCours {
    COLLECTIF_ENFANT("collectif enfant"),COLLECTIF_ADULTE("collectif adulte"),PARTICULIER("particulier");
    private String type;
    TypeCours(String type){
        this.type = type;
    }
    public String getType() {
        return type;
    }
}
