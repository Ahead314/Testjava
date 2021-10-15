public class Ttest {
    public static void main(String[] args) {
        String coursuivis [] = {"Html&CSS","Php","Java","JavaScript","SQL"};

        Test personne1 = new Test();
        System.out.println("Je m'appelle "
                + personne1.getPrenom()
                + " "
                + personne1.getNom()
                +"\n"
                + "Je suis née en 1978 et j'ai "
                + Test.getAge()
                +" ans"
                +"\n"
                +Test.seriedumoment("Mr Robot")
                +"\n"
                +"Le cours suivi du moment est "
                +coursuivis[2]);
        System.out.println("J'apprend aussi :");
        for (String coursuivi:
                coursuivis) {
            System.out.println(coursuivi);
        }
    }
}
