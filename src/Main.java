import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Create 10 burritos each containing one random selection from each of five specific categories.
        Random r = new Random();
        ArrayList<String> rice = new ArrayList<>();
        rice.add("white");
        rice.add("brown");
        rice.add("no");

        ArrayList<String> meat = new ArrayList<>();
        meat.add("chicken");
        meat.add("steak");
        meat.add("carnitas");
        meat.add("chorizo");
        meat.add("sofritas");
        meat.add("veggie not");

        ArrayList<String> beans = new ArrayList<>();
        beans.add("pinto");
        beans.add("black");
        beans.add("no");

        ArrayList<String> salsa = new ArrayList<>();
        salsa.add("mild");
        salsa.add("medium");
        salsa.add("hot");
        salsa.add("no");

        ArrayList<String> veggies = new ArrayList<>();
        veggies.add("lettuce");
        veggies.add("fajita veggies");
        veggies.add("no veggies");

        String [][] burritos = new String[10][5];

        for(int i = 0; i < 10; i++){
            int randomRice = r.nextInt(rice.size());
            int randomMeat = r.nextInt(meat.size());
            int randomBeans = r.nextInt(beans.size());
            int randomSalsa = r.nextInt(salsa.size());
            int randomVeggies = r.nextInt(veggies.size());

            burritos[i][0] = rice.get(randomRice) + " rice";
            burritos[i][1] = meat.get(randomMeat) + " meat";
            burritos[i][2] = beans.get(randomBeans) + " beans";
            burritos[i][3] = salsa.get(randomSalsa) + " salsa";
            burritos[i][4] = veggies.get(randomVeggies);
        }
        //Print out the list of burritos.
        for(int i = 0; i < 10; i++){
            System.out.print("Burrito " + (i+1) + ": ");
            for(int j = 0; j < 5; j++){
                System.out.print(burritos[i][j] + ", ");
            }
            System.out.println("\b\b");
        }
    }
}
