import java.util.Random;

public class SandBox {
    public static void main(String[] args) {
        Random random = new Random();



//        INGREDIENT ARRAYS

        String [] riceArray = {"white rice", "brown rice", "all", "none"};

        String [] meatArray = {"chicken", "steak", "carnidas", "chorizo", "sofritas",
                "veggie meat", "none", "all"};

        String [] beansArray = {"pinto beans", "black beans", "all", "none"};

        String [] salsaArray = {"mild salsa", "medium salsa", "hot salsa",
                "all salsa", "none"};

        String [] veggieArray = {"lettuce", "fajitas", "all veggies", "no veggies"};

        String [] cheeseArray = {"yes", "no"};

        String [] guacArray = {"yes", "no"};

        String [] quesoArray = {"yes", "no"};

        String [] sourCreamArray = {"yes", "no"};


        for (int i = 0; i < 25; i++) {

            //GENERATING THE INGREDIENTS
            String rice = riceArray[random.nextInt(riceArray.length)];
            String meat = meatArray[random.nextInt(meatArray.length)];
            String beans = beansArray[random.nextInt(beansArray.length)];
            String salsa = salsaArray[random.nextInt(salsaArray.length)];
            String veggies = veggieArray[random.nextInt(veggieArray.length)];
            String cheese = cheeseArray[random.nextInt(cheeseArray.length)];
            String guac = guacArray[random.nextInt(guacArray.length)];
            String queso = quesoArray[random.nextInt(quesoArray.length)];
            String sourcream = sourCreamArray[random.nextInt(sourCreamArray.length)];

            //IF TREE VERIFYING THE INGREDIENTS

            double ricePrice = 0;
            switch(rice){
                case ("white rice"):
                    ricePrice+=.5;
                    break;
                case ("brown rice"):
                    ricePrice+=.5;
                    break;
                case ("all"):
                    ricePrice +=.5;
                    rice = "white and brown rice";
                    break;
                case("none"):
                    ricePrice = 0;
                    rice = "no rice";
                    break;
            }

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
                case("all"):
                    meatPrice += .5;
                    meat = "all meat";
                    break;
                case("none"):
                    meatPrice = 0;
                    meat = "no meat";
                    break;
            }

            double beanPrice = 0;
            switch (beans){
                case ("pinto beans"):
                    beanPrice +=.5;
                    break;
                case ("black beans"):
                    beanPrice +=.5;
                    break;
                case ("all"):
                    beanPrice +=.5;
                    beans = "black and pinto beans";
                    break;
                case ("none"):
                    beans = "no beans";
                    beanPrice = 0;
                    break;

            }

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
                case ("none"):
                    salsa = "no salsa";
                    salsaPrice = 0;
                    break;
            }

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

            double cheesePrice = 0;
            switch (cheese){
                case("yes"):
                    cheesePrice+=.5;
                    cheese = "cheese";
                    break;
                case("no"):
                    cheese = "no cheese";
                    cheesePrice = 0;
                    break;
            }

            double guacPrice = 0;
            switch (guac){
                case("yes"):
                    guacPrice+=.5;
                    guac = "guac";
                    break;
                case("no"):
                    guac = "no guac";
                    guacPrice = 0;
                    break;
            }

            double quesoPrice = 0;
            switch (queso){
                case("yes"):
                    quesoPrice+=.5;
                    queso = "queso";
                    break;
                case("no"):
                    queso = "no queso";
                    quesoPrice = 0;
                    break;
            }

            double sourcreamPrice =0;
            switch (sourcream){
                case("yes"):
                    sourcreamPrice+=.5;
                    sourcream = "sour cream";
                    break;
                 case("no"):
                    sourcream = "no sour cream";
                    sourcreamPrice =0;
                    break;
            }



            //PICKING THE AMOUNT OF INGREDIENTS TO BE IN THE BURRITO
            int burritoCapacity = random.nextInt(5)+5;
//            System.out.println(burritoCapacity); //amount of ingredients in burrito (between 5 and 9)


            String burrito = "";
            String baseBurrito = rice + ", " + meat + ", " + beans + ", " + salsa + ", " + veggies;
            double totalPrice = 0;
            double baseBurritoPrice = 3 + ricePrice + meatPrice+ beanPrice+ salsaPrice + veggiePrice;

            //ASSEMBLING AND PRICING INGREDIENTS USED IN BURRITO
            switch (burritoCapacity){
                case 5: burrito = baseBurrito;
                totalPrice = baseBurritoPrice;
                break;
                case 6: burrito = baseBurrito + ", " + cheese;
                totalPrice = baseBurritoPrice + cheesePrice;
                break;
                case 7: burrito = baseBurrito + ", " + cheese + ", " + guac;
                totalPrice = baseBurritoPrice + cheesePrice + guacPrice;
                break;
                case 8: burrito = baseBurrito + ", " + cheese + ", " + guac + ", " + queso;
                totalPrice = baseBurritoPrice + cheesePrice + guacPrice + quesoPrice;
                break;
                case 9: burrito = baseBurrito + ", " + cheese + ", " + guac + ", " + queso + ", " + sourcream;
                totalPrice = baseBurritoPrice + cheesePrice+ guacPrice + quesoPrice + sourcreamPrice;
                break;
            }


            //ASSEMBLING THE BURRITO


//         burrito = rice + ", " + meat + ", " + beans + ", " + salsa + ", " + veggies + ", "
//                + cheese + ", " + guac + ", " + queso + ", " + sourcream;

//            System.out.println("Burrito 1: " + burrito + " Price: $" + totalPrice);
            System.out.printf("Burrito %d: %s\t Price: $%.2f\n", i+1, burrito, totalPrice);


        }//for loop


    }
}
