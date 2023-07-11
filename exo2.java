
public class exo2 {

    public static void main(String[] args){
        int min = 0;
        int max = 1000;
        int result = 0;
        int i = 0;

        while (result < 1){

            int randomNb2 = (int) Math.floor(Math.random() * (max - min + 1) + min);
            //System.out.println(randomNb2);
            int test1 = randomNb2 % 2;
            i++;
            if (test1 == 0) {

                int randomNb1 = (int) Math.floor(Math.random() * (max - min + 1) + min);
                //System.out.println(randomNb1);
                int test2 = randomNb1 % 2;
                if (test2 == 0) {


                    int randomNb3 = (int) Math.floor(Math.random() * (max - min + 1) + min);
                    //System.out.println(randomNb3);
                    int test3 = randomNb3 % 2;
                    if (test3 == 0){


                    }else {
                        System.out.println("nb 1 pair: "+randomNb2);
                        System.out.println("nb 2 pair: "+randomNb1);
                        System.out.println("nb 3 impair: "+randomNb3);
                        System.out.println("le resulta a été trouver en "+ i + " fois");
                        result++;

                    }
                }
            }
        }


    }


}
