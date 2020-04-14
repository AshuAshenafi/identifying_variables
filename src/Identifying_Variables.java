/*
Identifying and declaring variables
 */

public class Identifying_Variables {
    public static void main(String[] args) {

        // number of visited countries in a rank form like first, second,third ...
        String rank_visited_country = "first";

        // initialize country name
        String country_name = "Kenya";

        // initialize population size in terms of millions
        float population_size = 49.7f;

        // initialize capital city
        String capital_city = "Nairobi";

        // initialize currency amount
        float currency_amount = 103.84f;

        // initialize the countries currency name
        String currency_name = "Kenyan Shillings";

        // initialize the things you plan to visit
        String things_to_visit = "Nairobi National Park";

        // expectation of your feeling in visiting the things planed above
        String what_to_feel = "the giraffes";


        // print the addressing Mom and Dad.
        System.out.println("Hey Mom and Dad!");

        // print second line with rank of visited country
        System.out.println("Here are some interesting details about the " + rank_visited_country + " country I'm visiting.");

        // print country name
        System.out.println("Name: " + country_name);

        //print population size
        System.out.println("Population Size: " + population_size + " million");

        //print capital city
        System.out.println("Capital: " + capital_city);

        //print currency amount and currency name straight
        System.out.println("Currency: One U.S Dollar equals $" + currency_amount + " " + currency_name + "!!");

        // print things to visit and your expectation
        System.out.println("I'm so excited to visit the " + things_to_visit + " and feel " + what_to_feel + "!! Talk later.");



    }


}
