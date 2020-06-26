#Burritos

This program will assemble 25 random burrito customizations.

INPUT 
    
    rice options
    white
    brown
    white and brown
    no rice
    
    meat options
    chicken
    steak
    carnidas
    chorizo
    sofritas
    veggie meat
    no meat
    all
    
    beans
    pinto beans
    black beans 
    no beans
    black and pinto beans
    
    salsa
    mild
    medium
    hot
    none
    all salsa
    
    veggies
    lettuce
    fajita veggies
    none
    all
    
    cheese
    cheese
    no cheese
    
    guac
    guac
    no guac
    
    queso
    queso
    no queso
    
    sour cream
    sour cream
    no sour cream
    
    
   


OUTPUT
    
    25 burrito customizations with ingrendients listed
        each burrito contains between 5 and 9 ingredients
        price per burrito
    

PROCESS
BEGIN

    create arrays for each ingredient category
    
    
    random pick rice
    random pick meat
    random pick beans
    random pick salsa
    random pick veggies
    random pick cheese
    random pick guac
    random pick queso
    random pick sour cream
    
    generate number between 5 and 9 for amount of ingredients the burrito
    if num of ingredients is 5 add rice, meat, beans, salsa, and veggies to burrito
    if num of ingredents is 6 or higher, start to add cheese guac, queso, sour cream
    add price for every ingredient added to the burrito
    
    
    display burrito number
    display burrito ingredients
    display burrito price
    
    repeat 25 times
    
    
END

TODO
    
    build one burrito first
    confirm lowest burrito price
    confirm highest burrito price
    meet basic requirements
    attempt to do extra challenges
    clean up code into separate modules
    
    


