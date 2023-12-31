package com.cooksys.lemonadestand;

import com.cooksys.lemonadestand.model.Customer;
import com.cooksys.lemonadestand.model.Order;
import com.cooksys.lemonadestand.model.Lemonade;

public class Application {
  public static void main(String[] args) {
    Customer customer1 = new Customer("Drew", "(555)555-5555");
    Customer customer2 = new Customer("Will", "(999)999-9999");

    Order order1 = new Order(customer1);
    order1.addLemonade(new Lemonade(1, .5, 1, 5));
    order1.addLemonade(new Lemonade(1, .5, 1, 5));
    order1.addLemonade(new Lemonade(1, .5, 1, 5));
    order1.addLemonade(new Lemonade(1, .5, 1, 5));

    System.out.println(order1.getTotal());

    Order order2 = new Order(customer2);
    order2.addLemonade(new Lemonade(1, 2.5, 1, 5));
    order2.addLemonade(new Lemonade(3,  .5, 1, 5));
    order2.addLemonade(new Lemonade(1,  .5, 4, 5));
    order2.addLemonade(new Lemonade(2, 1.5, 1.75, 5));

    System.out.println(order2.getTotal());
  }
}