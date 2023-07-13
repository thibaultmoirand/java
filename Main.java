import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static String[] listeBruteFournisseurs;
    static String[] listeFournisseursDistincts;
    static int[] nbDeCliens;
    public static void main(String[] args) {

            String[] email = {"gfbsrthbsdf@gmail.com", "evqaeraherv@gmail.com", "erbeqrbefqbr@sfr.com", "efbqetehbe@gail.fr", "efbteqbsw@gmail.com"};
        listeBruteFournisseurs =new String[email.length];
        for (int i = 0; i < email.length; i++)
        {
            //Pour chaque adresse, récupération de la chaine après le @:
            listeBruteFournisseurs[i]=email[i].substring(email[i].indexOf('@')+1);

        }
                System.out.println("Liste brute des fournisseurs:");
        System.out.println(Arrays.toString(listeBruteFournisseurs));
        Arrays.sort(listeBruteFournisseurs);


        //2-Initialiser le tableau des fournisseurs distincts avec une taille de 1 (car il y a au moins 1 fournisseur)
        //et initialiser le tableau du nombre de clients par fournisseurs
        listeFournisseursDistincts = new String[1];
        nbDeCliens = new int[1];

        //3-Ajouter le premier fournisseur et lui associer 1 client:
        listeFournisseursDistincts[0]=listeBruteFournisseurs[0];
        nbDeCliens[0]=1;

        for (int i = 0; i < listeBruteFournisseurs.length; i++){
            if (!listeBruteFournisseurs[i].equals(listeFournisseursDistincts[listeFournisseursDistincts.length-1]))
            {
                //Agrandir le tableau des fournisseurs distincts d'une case
                //et agrandir le tableau du nompbre de clients d'une case
                listeFournisseursDistincts = Arrays.copyOf(listeFournisseursDistincts, listeFournisseursDistincts.length+1);
                nbDeCliens = Arrays.copyOf( nbDeCliens,  nbDeCliens.length+1);
                //Ajouter ce nouveau fournisseur dans le tableau et lui associer 1 client
                listeFournisseursDistincts[listeFournisseursDistincts.length-1]=listeBruteFournisseurs[i];
                nbDeCliens[ nbDeCliens.length-1]=1;

            }
            else {
                nbDeCliens[nbDeCliens.length-1]+=1;
            }

        }
        System.out.println("Liste des fournisseurs distincts:");
        System.out.println(Arrays.toString(listeFournisseursDistincts));
        System.out.println("Nombre de clients pour chaque fournisseurs");
        System.out.println(Arrays.toString(nbDeCliens));

//        System.out.println("Parts de marché:");
//        for(int i=0;i<listeFournisseursDistincts.length;i++)
//        {
//            System.out.println(String.format("=> %s \t: %d clients sur %d (%.1f%%)"
//                    , listeFournisseursDistincts[i]
//                    , nbDeCliens[i]
//                    , email.length,
//                    (nbDeCliens[i]*100.0/email.length)));
//        }

    }
}
