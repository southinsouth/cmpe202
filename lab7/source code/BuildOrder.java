

public class BuildOrder {

//    public static Component getOrder()
//    {
//        Composite order = new Composite( "Order" ) ;
//        order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
//        order.addChild(new Leaf("The Purist", 8.00 ));
//
//        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
//        // base price for 1/3 lb
//        Burger b = new Burger( "Burger Options" ) ;
//        String[] bo = { "Beef", "1/3lb.", "On A Bun" } ;
//        b.setOptions( bo ) ;
//        // 1 cheese free, extra cheese +1.00
//        Cheese c = new Cheese( "Cheese Options" ) ;
//        String[] co = { "Danish Blue Cheese", "Horseradish Cheddar" } ;
//        c.setOptions( co ) ;
//        c.wrapDecorator( b ) ;
//        // 4 toppings free, extra +.75
//        Toppings t = new Toppings( "Toppings Options" ) ;
//        String[] to = { "Bermuda Red Onion", "Black Olives", "Carrot Strings", "Coleslaw" } ;
//        t.setOptions( to ) ;
//        t.wrapDecorator( c ) ;
//        // premium topping +1.50
//        Premium p = new Premium( "Premium Options" ) ;
//        String[] po = { "Applewood Smoked Bacon" } ;
//        p.setOptions( po ) ;
//        p.wrapDecorator( t ) ;
//        // 1 sauce free, extra +.75
//        Sauce s = new Sauce( "Sauce Options" ) ;
//        String[] so = { "Appricot Sauce" } ;
//        s.setOptions( so ) ;
//        s.wrapDecorator( p ) ;
//
//        // Setup Custom Burger Ingredients
//        customBurger.setDecorator( s ) ;
//        customBurger.addChild( b ) ;
//        customBurger.addChild( c ) ;
//        customBurger.addChild( t ) ;
//        customBurger.addChild( p ) ;
//        customBurger.addChild( s ) ;
//
//        // Add Custom Burger to the ORder
//        order.addChild( customBurger );
//        return order ;
//    }
//    public static Component getOrder()
//    {
//        Composite order1 = new Composite( "Order" ) ;
//
//        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
//        // base price for 1/3 lb
//        Burger b = new Burger( "Burger Options" ) ;
//        String[] bo = { "Organic Bison", "1/2lb.", "On A Bun" } ;
//        b.setOptions( bo ) ;
//        // 1 cheese free, extra cheese +1.00
//        Cheese c = new Cheese( "Cheese Options" ) ;
//        String[] co = { "Yellow American", "Spicy Jalapeno Jack" } ;
//        c.setOptions( co ) ;
//        c.wrapDecorator( b ) ;
//        // premium cheese + 1.50
//        PremiumCheese pc = new PremiumCheese( "Cheese Options" ) ;
//        String[] pco = { "Danish Blue Cheese" } ;
//        pc.setOptions( pco ) ;
//        pc.wrapDecorator( c ) ;
//        // 1 sauce free, extra +.75
//        Sauce s = new Sauce( "Sauce Options" ) ;
//        String[] so = { "Mayonnaise", "Thai Peanut Sauce" } ;
//        s.setOptions( so ) ;
//        s.wrapDecorator( pc ) ;
//        // Unlimited Topping
//        Toppings t = new Toppings( "Toppings Options" ) ;
//        String[] to = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles"} ;
//        t.setOptions( to ) ;
//        t.wrapDecorator( s ) ;
//        // premium topping +1.50
//        PremiumTopping p = new PremiumTopping( "Premium Options" ) ;
//        String[] po = { "Marinated Tomatos" } ;
//        p.setOptions( po ) ;
//        p.wrapDecorator( t ) ;
//        // Bun
//        Bun bun = new Bun( "Bun Options" ) ;
//        String[] buno = { "Ciabatta (Vegan)" } ;
//        bun.setOptions( buno ) ;
//        bun.wrapDecorator( p ) ;
//        // Side +3.00
//        Side sd = new Side( "Side Options" ) ;
//        String[] sdo = { "Shoestring Fries" } ;
//        sd.setOptions( sdo ) ;
//        sd.wrapDecorator( bun ) ;
//
//
//
//        // Setup Custom Burger Ingredients
//        customBurger.setDecorator( sd ) ;
//        customBurger.addChild( b ) ;
//        customBurger.addChild( c ) ;
//        customBurger.addChild( pc ) ;
//        customBurger.addChild( s ) ;
//        customBurger.addChild( t ) ;
//        customBurger.addChild( p ) ;
//        customBurger.addChild( bun ) ;
//        customBurger.addChild( sd ) ;
//
//
//        // Add Custom Burger to the ORder
//        order1.addChild( customBurger );
//
//        return order1;
//
//
//
//    }
public static Component getOrder()
{
    Composite order1 = new Composite( "Order" ) ;

    CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
    // base price for 1/3 lb
    Burger b = new Burger( "Burger Options" ) ;
    String[] bo = { "Hormone & Antibiotic Free Beef", "1/3lb.", "On A Bun" } ;
    b.setOptions( bo ) ;
    // 1 cheese free, extra cheese +1.00
    Cheese c = new Cheese( "Cheese Options" ) ;
    String[] co = { "Smoked Gouda", "Greek Feta" } ;
    c.setOptions( co ) ;
    c.wrapDecorator( b ) ;
    // premium cheese + 1.50
    PremiumCheese pc = new PremiumCheese( "Cheese Options" ) ;
    String[] pco = { "Fresh Mozzarella" } ;
    pc.setOptions( pco ) ;
    pc.wrapDecorator( c ) ;
    // 1 sauce free, extra +.75
    Sauce s = new Sauce( "Sauce Options" ) ;
    String[] so = { "Hananero Salsa" } ;
    s.setOptions( so ) ;
    s.wrapDecorator( pc ) ;
    // Unlimited Topping
    Toppings t = new Toppings( "Toppings Options" ) ;
    String[] to = { "Crushed Peanuts"} ;
    t.setOptions( to ) ;
    t.wrapDecorator( s ) ;
    // premium topping +1.50
    PremiumTopping p = new PremiumTopping( "Premium Options" ) ;
    String[] po = { "Sunny Side Up Egg", "Mirinated Tomatoes" } ;
    p.setOptions( po ) ;
    p.wrapDecorator( t ) ;
    // Bun
    Bun bun = new Bun( "Bun Options" ) ;
    String[] buno = { "Gluten-Free Bun" } ;
    bun.setOptions( buno ) ;
    bun.wrapDecorator( p ) ;
    // Side +3.00
    Side sd = new Side( "Side Options" ) ;
    String[] sdo = { "Shoestring Fries" } ;
    sd.setOptions( sdo ) ;
    sd.wrapDecorator( bun ) ;



    // Setup Custom Burger Ingredients
    customBurger.setDecorator( sd ) ;
    customBurger.addChild( b ) ;
    customBurger.addChild( c ) ;
    customBurger.addChild( pc ) ;
    customBurger.addChild( s ) ;
    customBurger.addChild( t ) ;
    customBurger.addChild( p ) ;
    customBurger.addChild( bun ) ;
    customBurger.addChild( sd ) ;


    // Add Custom Burger to the ORder
    order1.addChild( customBurger );

    return order1;



}

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/