import java.util.Scanner;

public class TestDeJeuDeDes {
        public static void main(String[] args) {
                final int NBJOUEURS = 2;
                Joueur[] tableauJoueur = new Joueur[NBJOUEURS];
                int nbDes;
                int nbFaces;

                Scanner scanner = new Scanner (System.in);
                System.out.print( " Bonjour, veuillez entrer le nombre de dés : ");
                nbDes = scanner.nextInt();
                System.out.print(" Quel est le nombre de face des dés? : ");
                nbFaces = scanner.nextInt();

                for (int i=0; i< NBJOUEURS;i++){
                        Joueur j = new Joueur(nbDes,nbFaces);
                        System.out.print("Veuillez donner le nom du joueur "+i+" : ");
                        j.setNom(scanner.next());
                        System.out.print(" ET son prénom ? : ");
                        j.setPrenom(scanner.next());
                        tableauJoueur[i]=j;
                }

                for (int i = 0; i< NBJOUEURS; i++){
                        tableauJoueur[i].lance();
                        System.out.println("score : "+tableauJoueur[i].score()
                        + " --- Min : "+ tableauJoueur[i].min()+ " --- Max : "+ tableauJoueur[i].max());
                }

        }
}
