final class Main {

  public static void main(final String[] args) {

    Order o1 = new Order(45, 20);

    Fries fry = new Fries("LTL","CAL", 1);
    Burger burger = new Burger("LBB");
    burger.addComponent(new Topping("LETTUCE"));
    burger.addComponent(new Topping("TOMATO"));
    burger.addComponent(new Topping("G ONION"));
    burger.addComponent(new Topping("JALA Grilled"));



    o1.addComponent(burger);
    o1.addComponent(fry);

    System.out.println("Print Receipt \n");
    System.out.println(o1.getDescription("receipt"));
    System.out.println("------------------------------------------ \n");
    System.out.println("Print Packing Slip \n");
    System.out.println(o1.getDescription("packing"));

  }
}