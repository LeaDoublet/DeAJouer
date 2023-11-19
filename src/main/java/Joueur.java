public class Joueur {
    private String nom;
    private String prenom;
    private DeAJouer tableauAjouer [];
    private int nbDe;

    public void setNom(String n){
        this.nom = n;
    }
    public void setPrenom(String pren){
        this.prenom = pren;
    }
    public String getNom(){
        return this.nom;
    }
    public String getPrenom(){
        return this.prenom;
    }
    public Joueur(int nbDes,int nbfaces){
        this.nbDe = nbDes;
        tableauAjouer = new DeAJouer[nbDes];
        for (int i=0; i<nbDes; i++){
            tableauAjouer[i] = new DeAJouer(1,nbfaces);
        }
    }
    public void lance(){
        System.out.println("Je m'appelle " +nom + " "+prenom+" jai "+nbDe+ " Dés.");
        for( int i=0; i<nbDe; i++){
            tableauAjouer[i].lanceLeDe();
            tableauAjouer[i].afficheValeur();
        }
    }

}
