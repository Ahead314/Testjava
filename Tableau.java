public class Tableau {
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5};
        int [] b = {6, 7, 8, 9, 10};
        a=b;

        if (a==null || b==null || a.length != b.length){
            System.out.println("Contenus différents ou nuls");
        }
        else{
            int i = 0;
            while(i < a.length && (a[i]==b[i])){
                ++i;
            }
            if(i>= a.length){
                System.out.println("Contenus identiques");
            }
            else{
                System.out.println("Contenus différents");
            }
        }

    }
}