package ATM;
import java.util.Arrays;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        int ab = 0;
        int ac = 0;
        int ad = 0;


        String[] Log;
        String[] log = {"log"};
        Log = new String[1];
        Log[0]=log[0];


        Cliens c1 = new Cliens();
        c1.setCode(0000);
        c1.setNom("titi");
        c1.setPrenom("zbzezrb");
        c1.setAdresse("41 rue du bois");
        c1.setVille("lyon");
        c1.setCodePostal(69000);
        c1.setSold(1000);




        System.out.println("        ATM");
        System.out.println("  appuyer sur a");
        Scanner entrer = new Scanner(System.in);
        String start = entrer.nextLine();
        String esp = "a";


        if (start.equals(esp)){
            while (ab <= 1) {
                System.out.println("  ATM  ");
                System.out.println("Veuillez selectionner ce que vous vouler faire");
                System.out.println("1 : authentification");
                System.out.println("2 : crée compte");
                System.out.println("3 : quitter");
                Scanner sChoix1 = new Scanner(System.in);
                int choix1 = sChoix1.nextInt();
                if (choix1 == 1) {



                    ac = 0;
                    System.out.println("  ATM  ");
                    System.out.println("1 : authentification");
                    System.out.println(" merci de rentre votre code");
                    Scanner entrerAuthent = new Scanner(System.in);
                    int authent = entrerAuthent.nextInt();
                    if (authent == c1.getCode()) {
                        while (ac <= 1) {
                            ad = 0;


                            System.out.println("  ATM  ");
                            System.out.println("Veuillez selectionner ce que vous vouler faire");
                            System.out.println("1 : info cliens");
                            System.out.println("2 : consulter le solde");
                            System.out.println("3 : deposer de l'argent");
                            System.out.println("4 : retirer de l'argent");
                            System.out.println("5 : consulter l'historique des operations");
                            System.out.println("6 : back");
                            System.out.println("7 : quitter");
                            Scanner sChoix2 = new Scanner(System.in);
                            int choix2 = sChoix2.nextInt();
                            if (choix2 == 1) {
                                while (ad <= 1) {
                                    System.out.println(" info cliens");
                                    System.out.println(c1.getNom());
                                    System.out.println(c1.getPrenom());
                                    System.out.println(c1.getAdresse());
                                    System.out.println(c1.getVille());
                                    System.out.println(c1.getCodePostal());
                                    System.out.println("1 : back");
                                    System.out.println("2 : quitter");
                                    Scanner modifx = new Scanner(System.in);
                                    int modif = modifx.nextInt();
                                    if (modif == 1){
                                        ad++; ad++;
                                    } else if (modif == 2) {
                                        ad++; ad++;
                                        ac++;ac++;
                                        ab++;ab++;
                                    }


                                }
                            } else if (choix2 == 2) {
                                while (ad <= 1) {
                                    System.out.println(" consulter le solde");
                                    System.out.println("votre sold est de : "+c1.getSold());

                                    System.out.println("1 : back");
                                    System.out.println("2 : quitter");
                                    Scanner modifx = new Scanner(System.in);
                                    int modif = modifx.nextInt();
                                    if (modif == 1) {
                                        ad++; ad++;
                                    } else if (modif == 2) {
                                        ad++; ad++;
                                        ac++;
                                        ac++;
                                        ab++;
                                        ab++;
                                    }
                                }
                            } else if (choix2 == 3) {
                                while (ad <= 1) {
                                    System.out.println(" deposer de l'argent");
                                    System.out.println(" rentrer le montent que vous vouller deposer");
                                    Scanner modifsoldx = new Scanner(System.in);
                                    int modifsold = modifsoldx.nextInt();
                                    String[] modifsoldlog = {"depo de :"+modifsoldx.nextLine()};
                                    c1.setSold(c1.getSold()+ modifsold);
                                    modifsold = 0;


                                    Log = Arrays.copyOf(Log, Log.length+1);
                                    Log[Log.length-1]=modifsoldlog[0];


                                    System.out.println("votre nouveaux sold est de : "+c1.getSold());

                                    System.out.println("1 : back");
                                    System.out.println("2 : quitter");
                                    Scanner modifx = new Scanner(System.in);
                                    int modif = modifx.nextInt();
                                    if (modif == 1) {
                                        ad++; ad++;
                                    } else if (modif == 2) {
                                        ad++; ad++;
                                        ac++;
                                        ac++;
                                        ab++;
                                        ab++;
                                    }
                                }
                            } else if (choix2 == 4) {
                                while (ad <= 1) {
                                    System.out.println(" retirer de l'argent");

                                    System.out.println(" rentrer le montent que vous vouller retirer");
                                    Scanner modifsoldx = new Scanner(System.in);
                                    int modifsold = modifsoldx.nextInt();


                                    c1.setSold(c1.getSold() - modifsold);
                                    modifsold = 0;
                                    System.out.println("votre nouveaux sold est de : "+c1.getSold());

                                    System.out.println("1 : back");
                                    System.out.println("2 : quitter");
                                    Scanner modifx = new Scanner(System.in);
                                    int modif = modifx.nextInt();
                                    if (modif == 1) {
                                        ad++; ad++;
                                    } else if (modif == 2) {
                                        ad++; ad++;
                                        ac++;
                                        ac++;
                                        ab++;
                                        ab++;
                                    }
                                }
                            } else if (choix2 == 5) {
                                while (ad <= 1) {
                                    System.out.println(" consulter l'historique des operations");
                                    System.out.println(Log);



                                    System.out.println("1 : back");
                                    System.out.println("2 : quitter");
                                    Scanner modifx = new Scanner(System.in);
                                    int modif = modifx.nextInt();
                                    if (modif == 1) {
                                        ad++; ad++;
                                    } else if (modif == 2) {
                                        ad++; ad++;
                                        ac++;
                                        ac++;
                                        ab++;
                                        ab++;
                                    }
                                }


                            } else if (choix2 == 6) {
                                ac++;ac++;
                            } else if (choix2 == 7) {
                                ac++;ac++;
                                ab++;ab++;
                            }
                        }


                    } else {
                        System.out.println("code incorecte");
                    }


                } else if (choix1 == 2) {

                    System.out.println("  ATM  ");
                    System.out.println("  votre nom");
                    Scanner nomx = new Scanner(System.in);
                    String nom = nomx.nextLine();
                    c1.setNom(nom);
                    System.out.println("  votre prenom");
                    Scanner prenomx = new Scanner(System.in);
                    String prenom = prenomx.nextLine();
                    c1.setPrenom(prenom);
                    System.out.println("  votre adresse");
                    Scanner adressex = new Scanner(System.in);
                    String adresse = adressex.nextLine();
                    c1.setAdresse(adresse);
                    System.out.println("  votre ville");
                    Scanner villex = new Scanner(System.in);
                    String ville = villex.nextLine();
                    c1.setVille(ville);
                    System.out.println("  votre codePostal");
                    Scanner codePostalx = new Scanner(System.in);
                    int codePostal= codePostalx.nextInt();
                    c1.setCodePostal(codePostal);
                    System.out.println("  votre code");
                    Scanner codex = new Scanner(System.in);
                    int code= codex.nextInt();
                    c1.setCode(code);









                } else if (choix1 == 3) {
                    ab++;ab++;

                }

            }
        }
    }
}
