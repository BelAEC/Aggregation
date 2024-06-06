public class Library {

    public static void main(String[] args) {
        Bibliotheque b1 = new Bibliotheque("L'inspiration", "123 Rue st Denis", "allo !","Boris Vian", 1944, "Roman");
        b1.afficherInfos();
        b1.afficherLivresParGenre("Roman");
    }
}
class Bibliotheque {
    String nom;
    String addresse;
    public static final int NbLivres = 100;

    private Livre[] livre = new Livre[NbLivres];
    private int nbLivres = 0;

    public Bibliotheque(String nom, String addresse, String titre, String auteur, int anneePublication, String genre) {
        this.nom = nom;
        this.addresse = addresse;

        for (int i = 0; i < NbLivres; i++) {
            //on initialise 4 roues pareilles dans le constructuer de la voitrue
            livre[i] = new Livre(titre, auteur, anneePublication, genre);
        }
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public Livre[] getLivre() {
        return livre;
    }

    public void setLivre(Livre[] livre) {
        this.livre = livre;
    }

    public int getNbLivres() {
        return nbLivres;
    }

    public void setNbLivres(int nbLivres) {
        this.nbLivres = nbLivres;
    }


    public void afficherInfos() {
        System.out.println("Nom : " + nom + " Adresse : " + addresse + "Nombre de livres : " + nbLivres
                + "Livres :");
        for (int i = 0; i < nbLivres; i++) {

            System.out.println("Titre : " + livre[i].getTitre() + ", Auteur : " + livre[i].getAuteur() +
                    ", Année de publication : " + livre[i].getAnneePublication() + ", Genre : " + livre[i].getGenre());
        }
    }
    public void afficherLivresParGenre(String genre) {

        System.out.println("Livres dans la categorie " + genre + ":");
        for (int i = 0; i < nbLivres; i++) {
            if (livre[i].getGenre().equals(genre)) {
                System.out.println("Titre : " + livre[i].getTitre() + ", Auteur : "
                        + livre[i].getAuteur() +
                        ", Année de publication : " + livre[i].getAnneePublication());
            }
        }
    }

    class Livre {
        private String titre;
        private String auteur;
        private int anneePublication;
        private String genre;

        public Livre(String titre, String author, int anneePublication, String genre) {
            this.titre = titre;
            this.auteur = author;
            this.anneePublication = anneePublication;
            this.genre = genre;

        }


        public String getTitre() {
            return titre;
        }

        public void setTitre(String titre) {
            this.titre = titre;
        }

        public String getAuteur() {
            return auteur;
        }

        public void setAuteur(String auteur) {
            this.auteur = auteur;
        }

        public int getAnneePublication() {
            return anneePublication;
        }

        public void setAnneePublication(int anneePublication) {
            this.anneePublication = anneePublication;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }
    }
}

