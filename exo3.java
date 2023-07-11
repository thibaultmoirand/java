import java.util.Scanner;




public class exo3 {
    public static void main(String[] args){
        int min = 0;
        int max = 10000;
        int randomNb = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println(randomNb);

        Scanner donner = new Scanner(System.in);
        System.out.println("Veuillez saisir un chiffre entre "+min+" et "+max+" :");
        int chiffre1 = donner.nextInt();
        System.out.println("Vous avez saisi : " + chiffre1);
        if (chiffre1 == randomNb){
            System.out.println("gg");
        }





    }
}
