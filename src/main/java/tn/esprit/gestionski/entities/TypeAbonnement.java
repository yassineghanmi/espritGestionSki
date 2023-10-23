package tn.esprit.gestionski.entities;

public enum TypeAbonnement {
  ANNUEL("annuel"), SEMESTRIEL("semestriel"), MENSUEL("mensuel");
  private String type;
  TypeAbonnement(String type){
   this.type = type;
  }
  public String getType() {
   return type;
  }
}
