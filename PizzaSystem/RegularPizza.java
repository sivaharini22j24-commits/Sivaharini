package PizzaSystem;

public class RegularPizza extends Pizza {

    public RegularPizza(Customer customer) {
        this.setCustomer(customer);
        this.setOrderId(customer.getOrderId());
    }
    public void extraToppings(){
        System.out.println("Extra Toppings Added");
    }


}