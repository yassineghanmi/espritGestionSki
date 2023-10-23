package tn.esprit.gestionski.entities;

public enum Support {
    SKI("ski"),SNOWBOARD("snowboard");

    private String support;
    Support(String support){
        this.support = support;
    }
    public String getSupport() {
        return support;
    }
}
