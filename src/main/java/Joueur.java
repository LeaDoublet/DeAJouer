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
    public int score(){
        int score = 0;
        for (int i=0; i<nbDe;i++){
            score += tableauAjouer[i].getValue();
        } return score;
    }

    public int min() {
        int min = 100;
        for (int i = 0; i < nbDe; i++) {
            min = (Math.min(tableauAjouer[i].getValue(), min));
        }
        return min;
    }
    public int max(){
        int max = 0;
        for (int i=0; i<nbDe; i++){
            max= (Math.max(tableauAjouer[i].getValue(), max));
        }
        return max;
    }


        public void playCraps() {
            if (this.nbDe != 2 || this.tableauAjouer[0].getFace() != 6 || this.tableauAjouer[1].getFace() != 6) {
                System.out.println("On peut uniquement jouer au CRAPS avec Deux dés de 6 faces. Choisissez vos dés en conséquence :)");
                return;
            }
            int firstRoll = this.score();

            if (firstRoll == 7 || firstRoll == 11) {
                System.out.println("C'est gagné !");
            } else if (firstRoll == 2 || firstRoll == 3 || firstRoll == 12) {
                System.out.println("C'est perdu ....");
            } else {
                System.out.println("Le nombre de point est :  " + firstRoll);
                int currentRoll;

                do {
                    this.lance();

                    currentRoll = this.score();
                    System.out.println("C'est repartie pour un tour : " + currentRoll);

                    if (currentRoll == 7) {
                        System.out.println("Cest perdu ....");
                        return;
                    } else if (currentRoll == firstRoll) {
                        System.out.println("Bien joué ! ");
                        return;
                    }

                    // Si pas 7 ou nombre initial de point
                    System.out.println("C'est repartie pour un lancé...");
                } while (true);
            }
        }


}
