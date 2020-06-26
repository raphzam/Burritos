import java.util.Random;

public class BurritoMethods {
    public static void main(String[] args) {
        Random random = new Random();


//            TALLYING INGREDIENTS USED
            int whiteRiceCounter, brownRiceCounter, chickenCounter, steakCounter, carnidasCounter, chorizoCounter,
                    sofritasCounter, veggieMeatCounter, pintoBeanCounter, blackBeanCounter, mildSalsaCounter, mediumSalsaCounter, hotSalsaCounter,
                    lettuceCounter, fajitasCounter, cheeseCounter, guacCounter, quesoCounter, sourCreamCounter;





        for (int i = 0; i < 25; i++) {

//            GENERATING THE INGREDIENTS (CALL INGREDIENT GENERATORS)
            String rice = rice();
            String meat = meat();
            String beans = beans();
            String salsa = salsa();
            String veggies = veggies();
            String cheese = cheese();
            String guac = guac();
            String queso = queso();
            String sourcream = sourcream();


//            GETTING INGREDIENT PRICES (CALL INGREDIENT PRICE METHODS)

            double ricePrice = ricePrice(rice);
            double meatPrice = meatPrice(meat);
            double beanPrice = beanPrice(beans);
            double salsaPrice = salsaPrice(salsa);
            double veggiePrice = veggiePrice(veggies);
            double cheesePrice = cheesePrice(cheese);
            double guacPrice = guacPrice(guac);
            double quesoPrice = quesoPrice(queso);
            double sourcreamPrice = sourcreamPrice(sourcream);


//            CHOOSE HOW MANY INGREDIENTS GET ADDED TO BURRITO (BETWEEN 5 AND 9)
            int burritoCapacity = random.nextInt(5)+5;
            //System.out.println(burritoCapacity); //amount of ingredients in burrito (between 5 and 9)


            String burrito = "";
            String baseBurrito = rice + ", " + meat + ", " + beans + ", " + salsa + ", " + veggies;
            double totalPrice = 0;
            double baseBurritoPrice = 3 + ricePrice + meatPrice+ beanPrice+ salsaPrice + veggiePrice;


//            switch
//
//            riceTally(rice);
//
//            //riceTally
//            //meatTally
//            //beanTally
//            //salsaTally
//            //veggieTally


//            ASSEMBLING AND PRICING INGREDIENTS USED IN BURRITO
            switch (burritoCapacity){
                case 5: burrito = baseBurrito;
                    totalPrice = baseBurritoPrice;
                    break;
                case 6: burrito = baseBurrito + ", " + cheese;
                    totalPrice = baseBurritoPrice + cheesePrice;
                    //cheeseTally
                    break;
                case 7: burrito = baseBurrito + ", " + cheese + ", " + guac;
                    totalPrice = baseBurritoPrice + cheesePrice + guacPrice;
                    //cheeseTally
                    //guacTally
                    break;
                case 8: burrito = baseBurrito + ", " + cheese + ", " + guac + ", " + queso;
                    totalPrice = baseBurritoPrice + cheesePrice + guacPrice + quesoPrice;
                    //cheeseTally
                    //guacTally
                    //quesoTally
                    break;
                case 9: burrito = baseBurrito + ", " + cheese + ", " + guac + ", " + queso + ", " + sourcream;
                    totalPrice = baseBurritoPrice + cheesePrice+ guacPrice + quesoPrice + sourcreamPrice;
                    //cheeseTally
                    //guacTally
                    //quesoTally
                    break;
            }




//            PRINTING CUSTOM BURRITO AND PRICE

            System.out.printf("Burrito %d: %s\t Price: $%.2f\n", i+1, burrito, totalPrice);
            System.out.println();



        }//burrito for loop


    }// main










    //INGREDIENT GENERATORS
    public static String rice () {
        Random random = new Random();
        String [] riceArray = {"white rice", "brown rice", "white and brown rice", "no rice"};
        String rice = riceArray[random.nextInt(riceArray.length)];
        return rice;
    }
    public static String meat (){
        Random random = new Random();
        String [] meatArray = {"chicken", "steak", "carnidas", "chorizo", "sofritas",
                 "veggie meat", "no meat", "all meat"};
        String meat = meatArray[random.nextInt(meatArray.length)];
        return meat;
     }
    public static String beans (){
        Random random = new Random();
        String [] beansArray = {"pinto beans", "black beans", "black and pinto beans", "no beans"};
        String beans = beansArray[random.nextInt(beansArray.length)];
        return beans;
     }
    public static String salsa(){
         Random random = new Random();
         String [] salsaArray = {"mild salsa", "medium salsa", "hot salsa",
                 "all salsa", "no salsa"};
         String salsa = salsaArray[random.nextInt(salsaArray.length)];
         return salsa;
     }
    public static String veggies(){
         Random random = new Random();
         String [] veggieArray = {"lettuce", "fajitas", "all veggies", "no veggies"};
         String veggies = veggieArray[random.nextInt(veggieArray.length)];
         return veggies;
    }
    public static String cheese(){
        Random random = new Random();
        String [] cheeseArray = {"cheese", "no cheese"};
        String cheese = cheeseArray[random.nextInt(cheeseArray.length)];
        return cheese;
    }
    public static String guac(){
        Random random = new Random();
        String [] guacArray = {"guac", "no guac"};
        String guac = guacArray[random.nextInt(guacArray.length)];
        return guac;
    }
    public static String queso(){
        Random random = new Random();
        String [] quesoArray = {"queso", "no queso"};
        String queso = quesoArray[random.nextInt(quesoArray.length)];
        return queso;
    }
    public static String sourcream(){
        Random random = new Random();
        String [] sourCreamArray = {"sour cream", "no sour cream"};
        String sourcream = sourCreamArray[random.nextInt(sourCreamArray.length)];
        return sourcream;
    }

    //INGREDIENT PRICE METHODS
    public static double ricePrice (String rice){
        double ricePrice = 0;
        switch(rice){
            case ("white rice"):
                ricePrice+=.5;
                break;
            case ("brown rice"):
                ricePrice+=.5;
                break;
            case ("white and brown rice"):
                ricePrice +=.5;
                break;
            case("no rice"):
                ricePrice = 0;
                break;
        }
        return ricePrice;
    }
    public static double meatPrice (String meat) {


        double meatPrice = 0;
        switch (meat){
            case("chicken"):
                meatPrice += .5;
                break;
            case("steak"):
                meatPrice += .5;
                break;
            case("carnidas"):
                meatPrice += .5;
                break;
            case("chorizo"):
                meatPrice += .5;
                break;
            case("sofritas"):
                meatPrice += .5;
                break;
            case("veggie meat"):
                meatPrice += .5;
                break;
            case("all meat"):
                meatPrice += .5;
                break;
            case("no meat"):
                meatPrice = 0;
                break;
        }
        return meatPrice;
    }
    public static double beanPrice (String beans){


        double beanPrice = 0;
        switch (beans){
            case ("pinto beans"):
                beanPrice +=.5;
                break;
            case ("black beans"):
                beanPrice +=.5;
                break;
            case ("black and pinto beans"):
                beanPrice +=.5;
                break;
            case ("no beans"):
                beanPrice = 0;
                break;
        }
    return beanPrice;
    }
    public static double salsaPrice(String salsa){

        double salsaPrice = 0;
        switch (salsa){
            case ("mild salsa"):
                salsaPrice+= .5;
                break;
            case ("medium salsa"):
                salsaPrice+= .5;
                break;
            case ("hot salsa"):
                salsaPrice+= .5;
                break;
            case ("all salsa"):
                salsaPrice+= .5;
                break;
            case ("no salsa"):
                salsaPrice = 0;
                break;
        }
        return salsaPrice;
    }
    public static double veggiePrice (String veggies){

        double veggiePrice = 0;
        switch (veggies){
            case("lettuce"):
                veggiePrice+=.5;
                break;
            case("fajitas"):
                veggiePrice+=.5;
                break;
            case("all veggies"):
                veggiePrice+=.5;
                break;
            case("no veggies"):
                veggiePrice = 0;
                break;
        }
        return veggiePrice;

    }
    public static double cheesePrice (String cheese){

        double cheesePrice = 0;
        switch (cheese){
            case("cheese"):
                cheesePrice+=.5;
                break;
            case("no cheese"):
                cheesePrice = 0;
                break;
        }
        return cheesePrice;
    }
    public static double guacPrice (String guac){

        double guacPrice = 0;
        switch (guac){
            case("guac"):
                guacPrice+=.5;
                break;
            case("no guac"):
                guacPrice = 0;
                break;
        }
        return guacPrice;
    }
    public static double quesoPrice (String queso){


        double quesoPrice = 0;
        switch (queso){
            case("queso"):
                quesoPrice+=.5;
                break;
            case("no queso"):
                quesoPrice = 0;
                break;
        }
    return quesoPrice;
    }
    public static double sourcreamPrice (String sourcream){


        double sourcreamPrice =0;
        switch (sourcream){
            case("sour cream"):
                sourcreamPrice+=.5;
                break;
            case("no sour cream"):
                sourcreamPrice =0;
                break;
        }
        return sourcreamPrice;
    }



//    //INGREDIENT TALLY
//    public static int riceTally (String rice){
//        int riceTally = 0;
//        switch(rice){
//            case ("white rice"):
//                riceTally+=1;
//                break;
//            case ("brown rice"):
//                riceTally+=1;
//                break;
//            case ("white and brown rice"):
//                riceTally+=2;
//                break;
//            case("no rice"):
//                break;
//        }
//        return riceTally;
//    }







































}// class
