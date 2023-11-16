public class DeAJouer {
    public int value;
    public int nb_face;

    //Constructeur par defaut
    public DeAJouer(){
        value = 1;
        nb_face=6;
    }

    public DeAJouer(int value, int nb_face){
        this.value=value;
        this.nb_face=nb_face;
    }

    public void setValue(int v){
        this.value=v;
    }
    public void setNb_face(int nbFace){
        this.nb_face=nbFace;
    }
    public int getValue(){
        return value;
    }
    public int getFace(){
        return nb_face;
    }
}
