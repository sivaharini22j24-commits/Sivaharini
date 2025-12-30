package PizzaSystem;

public class Main {
    public  static void main(String agrs[]){
        Customer customer = new Customer(2456,"RegularPizza",2);
       /* customer.setOrderId(2456);
        customer.setPizzaType("RegularPizza");
        customer.setSize(2);*/

        RegularPizza regular =new RegularPizza(customer);
        System.out.println("===CUSTOMER 1===");
        regular.orderPizza(customer.getSize());
        regular.extraToppings();

        Customer customer1 = new Customer();
        customer1.setOrderId(2456);
        customer1.setPizzaType("PremiumPizza");
        customer1.setSize(4);

        PremiumPizza premium = new PremiumPizza(customer);
        System.out.println("===CUSTOMER 2===");
        premium.orderPizza(customer1.getSize());
        premium.garmetCrustAdd();
    }
}