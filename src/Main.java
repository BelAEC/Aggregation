import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Voiture voiture1 = new Voiture("Toyota", "Camry", "Pirelli", 33,32, "ete");
        voiture1.afficherInfosVoiture();
        Voiture v2 = new Voiture("Bmw", "x4", "pirelli", 25,22, "hiver");
        v2.afficherInfosVoiture();
        System.out.println("testE");
    }
}
    class Voiture {
        private String marqueV;
        private String modeleV;
        private static final int NBROUES = 4;
        private Roue[] roue = new Roue[NBROUES]; //  instance roues de la classe Roues - DECLARATION TABALEAU
        //on ne mets pas la reoue dans le constructure ci - bas
        public Voiture(String marqueV, String modeleV, String marque, int dimension, double pression, String type) {
            //objet Roue pas mis dans le constructeur car la boucle initialise les roues

            this.marqueV = marqueV;
            this.modeleV = modeleV;
            for (int i = 0; i < 4; i++) {
                //on initialise 4 roues pareilles dans le constructuer de la voitrue
               roue[i]= new Roue(marque,dimension, pression, type);
            }
        }
        public String getMarqueV() {

            return marqueV;
        }

        public String getModeleV() {
            return modeleV;
        }

        public Roue[] getRoue() {

            return roue;
        }

               public void afficherInfosVoiture() {

                System.out.println("Informations de la voiture: \n" + " Marque: " + marqueV + "\n"
                + " Modèle: " + modeleV + "\n");

                //afficher les infos de l'objet roue.

                 this.roue[0].afficherInfosRoue(); //la méthode est dans la classe roue
                //or for (int i = 0; i<roue.length; i++){
                //roue[i].afficherInfosRoue();

            }

            class Roue {
               private String marque;
              private int dimension;
                private double pression;

                private String type;

                public static final int nbRoues = 4;

                // Constructor for Roues
                public Roue(String marque, int dimension, double pression, String type) {
                    this.marque = marque;
                    this.dimension =dimension;
                    this.pression = pression;
                    this.type = type;
                }

                //affichers les infos dans la classe roue
                public void afficherInfosRoue() {

                    System.out.println("Marque pneu: " +this.marque + "\n" +
                            "Pression: " + this.pression + "\n" +
                            "Dimension: " +this.dimension+ "\n"+
                            "Type: " + this.type);
                }

                public int getdimension()
                {
                    return dimension;
                }

                public void setdimension(int dimension) {
                    this.dimension = dimension;
                }

                public void setPression(double pression) {
                    this.pression = pression;
                }

                public void setMarque(String marque) {
                    this.marque = marque;
                }

                public void setType(String type) {
                    this.type = type;
                }

               public double getPression() {
                    return pression;
                }

                public String getMarque() {

                    return marque;
                }

                public String getType() {

                    return type;
                }
            }
        }
