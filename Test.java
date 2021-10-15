public class Test {
    private String nom;
    private String prenom;
    private static int age = 43;
    public Test() {
        this("DIOP", "Adama");
    }

    public Test(String nom) {
        this.nom = nom;
    }

    public Test(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public static int getAge() {
        return age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public static String  seriedumoment(String nom){
        String  serie=nom;
        System.out.println("Ma série préféré du moment est : "+ serie);
        return serie;

    }

}
