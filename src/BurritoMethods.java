import java.util.Random;

public class BurritoMethods {
    public static void main(String[] args) {
        Random random = new Random();


//            INGREDIENTS USED COUNTERS
//        int chickenCounter, steakCounter, carnidasCounter, chorizoCounter,
//        sofritasCounter, veggieMeatCounter, pintoBeanCounter, blackBeanCounter, mildSalsaCounter, mediumSalsaCounter, hotSalsaCounter,
//        lettuceCounter, fajitasCounter, cheeseCounter, guacCounter, quesoCounter, sourCreamCounter = 0;

        int whiteRiceCounter=0;
        int brownRiceCounter=0;
        int chickenCounter=0;
        int steakCounter= 0;
        int carnidasCounter = 0;
        int chorizoCounter =0;
        int sofritasCounter = 0;
        int veggieMeatCounter =0;
        int pintoBeanCounter=0;
        int blackBeanCounter =0;
        int mildSalsaCounter = 0;
        int mediumSalsaCounter =0;
        int hotSalsaCounter =0;
        int lettuceCounter =0;
        int fajitasCounter =0;
        int cheeseCounter = 0;
        int guacCounter =0;
        int quesoCounter =0;
        int sourCreamCounter=0;
        double grandTotal =0;



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

            //the price of each ingredient generated is calculated but they are not added to the price of the burrito
            //until they are used



            //TALLYING INGREDIENTS (but not adding to counter - they have not been used yet)
            int whiteRiceTally = 0;
            int brownRiceTally = 0;
            switch(rice){
                case ("white rice"):
                    whiteRiceTally++;
                    break;
                case ("brown rice"):
                    brownRiceTally++;
                    break;
                case ("white and brown rice"):
                    whiteRiceTally++;
                    brownRiceTally++;
                    break;

                case("no rice"):
                    break;
            }

            int chickenTally =0;
            int steakTally =0;
            int carnidasTally= 0;
            int chorizoTally =0;
            int sofritasTally =0;
            int veggieMeatTally = 0;
            switch (meat){

                case("chicken"):
                    chickenTally++;
                    break;
                case("steak"):
                    steakTally++;
                    break;
                case("carnidas"):
                    carnidasTally++;
                    break;
                case("chorizo"):
                    carnidasTally++;
                    break;
                case("sofritas"):
                    sofritasTally++;
                    break;
                case("veggie meat"):
                    veggieMeatTally++;
                    break;
                case("all meat"):
                    veggieMeatTally++;
                    sofritasTally++;
                    carnidasTally++;
                    steakTally++;
                    chickenTally++;
                    break;
                case("no meat"):
                    break;
            }

            int pintoBeanTally = 0;
            int blackBeanTally =0;
            switch (beans){
                    case ("pinto beans"):
                        pintoBeanTally++;
                        break;
                    case ("black beans"):
                        blackBeanTally++;
                        break;
                    case ("black and pinto beans"):
                        blackBeanTally++;
                        pintoBeanTally++;
                        break;
                    case ("no beans"):
                        break;
                }

            int mildSalsaTally=0;
            int mediumSalsaTally=0;
            int hotSalsaTally=0;
            switch (salsa){

                    case ("mild salsa"):
                        mildSalsaTally++;
                        break;
                    case ("medium salsa"):
                        mediumSalsaTally++;
                        break;
                    case ("hot salsa"):
                        hotSalsaTally++;
                        break;
                    case ("all salsa"):
                        hotSalsaTally++;
                        mediumSalsaTally++;
                        mildSalsaTally++;
                        break;
                    case ("no salsa"):
                        break;
                }

            int lettuceTally =0;
            int fajitasTally=0;
            switch (veggies){
                case("lettuce"):
                    lettuceTally++;
                    break;
                case("fajitas"):
                    fajitasTally++;
                    break;
                case("all veggies"):
                    fajitasTally++;
                    lettuceTally++;
                    break;
                case("no veggies"):
                    break;
            }

            int cheeseTally = 0;
            switch (cheese){
                    case("cheese"):
                        cheeseTally++;
                        break;
                    case("no cheese"):
                        break;
                }

            int guacTally =0;
            switch (guac){
                    case("guac"):
                        guacTally++;
                        break;
                    case("no guac"):
                        break;
                }

            int quesoTally = 0;
            switch (queso){
                    case("queso"):
                        quesoTally++;
                        break;
                    case("no queso"):
                        break;
                }

            int sourCreamTally = 0;
            switch (sourcream){
                    case("sour cream"):
                        sourCreamTally++;
                        break;
                    case("no sour cream"):
                        break;
                }


            //ingredients are tallied but are not actually counted until they are USED in the burrito being assembled
            //and added to their respective counters

            //CHEESE, GUAC, QUESO AND SOURCREAM SHOULD ONLY BE COUNTED IF ADDED TO THE BURRITO IN THE ASSEMBLER
            //add within burrito assembler cheeseCounter, guacCounter, quesoCounter, sourCreamCounter;


//            CHOOSE HOW MANY INGREDIENTS GET ADDED TO BURRITO (BETWEEN 5 AND 9)
            int burritoCapacity = random.nextInt(5)+5;
            //System.out.println(burritoCapacity); //amount of ingredients in burrito (between 5 and 9)



//            ASSEMBLING AND PRICING INGREDIENTS USED IN BURRITO
            //burritoCapacity is randomly generated and determines how many ingredient categories are used
            //the base burrito has rice, meat, beans, salsa and veggie by default
            // larger burrito capacities will sequentially add cheese, guac, queso and sour cream
            //the price and tallies are only ADDED for ingredients used
            String burrito = "";
            String baseBurrito = rice + ", " + meat + ", " + beans + ", " + salsa + ", " + veggies;
            double totalPrice = 0;
            double baseBurritoPrice = 3 + ricePrice + meatPrice+ beanPrice+ salsaPrice + veggiePrice;



            //THESE INGREDIENTS WILL ALWAYS BE COUNTED BECAUSE THEY ARE IN THE BASE BURRITO

            whiteRiceCounter += whiteRiceTally;
            brownRiceCounter += brownRiceTally;
            chickenCounter += chickenTally;
            steakCounter += steakTally;
            carnidasCounter += carnidasTally;
            chorizoCounter += chorizoTally;
            sofritasCounter += sofritasTally;
            veggieMeatCounter += veggieMeatTally;
            pintoBeanCounter += pintoBeanTally;
            blackBeanCounter += blackBeanTally;
            mildSalsaCounter+= mildSalsaTally;
            mediumSalsaCounter+= mediumSalsaTally;
            hotSalsaCounter += hotSalsaTally;
            lettuceCounter += lettuceTally;
            fajitasCounter+= fajitasTally;



            switch (burritoCapacity){
                case 5: burrito = baseBurrito;
                    totalPrice = baseBurritoPrice;
                    break;
                case 6: burrito = baseBurrito + ", " + cheese;
                    totalPrice = baseBurritoPrice + cheesePrice;
                    cheeseCounter+=cheeseTally;
                    break;
                case 7: burrito = baseBurrito + ", " + cheese + ", " + guac;
                    totalPrice = baseBurritoPrice + cheesePrice + guacPrice;
                    cheeseCounter+=cheeseTally;
                    guacCounter+=guacTally;
                    break;
                case 8: burrito = baseBurrito + ", " + cheese + ", " + guac + ", " + queso;
                    totalPrice = baseBurritoPrice + cheesePrice + guacPrice + quesoPrice;
                    cheeseCounter+=cheeseTally;
                    guacCounter+=guacTally;
                    quesoCounter+=quesoTally;
                    break;
                case 9: burrito = baseBurrito + ", " + cheese + ", " + guac + ", " + queso + ", " + sourcream;
                    totalPrice = baseBurritoPrice + cheesePrice+ guacPrice + quesoPrice + sourcreamPrice;
                    cheeseCounter+=cheeseTally;
                    guacCounter+=guacTally;
                    quesoCounter+=quesoTally;
                    sourCreamCounter+=sourCreamTally;
                    break;
            }



//            PRINTING CUSTOM BURRITO AND PRICE
            System.out.printf("Burrito %d: %s\t Price: $%.2f\n", i+1, burrito, totalPrice);
            System.out.println();
            grandTotal+=totalPrice; //the price of this burrito is added to the grandTotal



        }//burrito for loop



        System.out.printf("This order has " + whiteRiceCounter + " white rice, " + brownRiceCounter + " brown rice, " +
                chickenCounter + " chicken, " + steakCounter + " steak, " + carnidasCounter + " carnitas, " +
                chorizoCounter + " chorizo, \n" + sofritasCounter + " sofritas, " + veggieMeatCounter + " veggie meat, " +
                blackBeanCounter + " black beans, " + pintoBeanCounter + " pinto beans, " + mildSalsaCounter + " mild salsa, " +
                mediumSalsaCounter + " medium salsa, " + hotSalsaCounter + " hot salsa, \n" + fajitasCounter + " fajitas, " +
                lettuceCounter + " lettuce, " + cheeseCounter + " cheese, " + guacCounter + " guac, " + quesoCounter +
                " queso, " + sourCreamCounter + " sour cream, and the grand total is $%.2f\n",  grandTotal);


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



}// class


























