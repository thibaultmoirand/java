import java.util.Scanner;




public class exo3 {
    public static void main(String[] args){
        int min = 0;
        int max = 10000;
        int i = 0;
        int nb = 0;
        Scanner donner = new Scanner(System.in);
        int randomNb = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println(randomNb);
        while (i < 1) {

            System.out.println("Veuillez saisir un chiffre entre " + min + " et " + max + " :");
            int chiffre1 = donner.nextInt();
//            System.out.println("Vous avez saisi : " + chiffre1);
            nb++;
            if (chiffre1 == randomNb) {
                System.out.println("gg");
                i++;
                System.out.println("tu a "+nb+" tentative");
            }
            if (chiffre1 < randomNb){
                System.out.println("plus");
            }
            if (chiffre1 > randomNb){
                System.out.println("moin");
            }
        }





    }
}
