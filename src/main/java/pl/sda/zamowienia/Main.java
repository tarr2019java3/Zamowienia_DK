package pl.sda.zamowienia;

public class Main {

    public static void main(String[] args) {

        // Typ wyliczeniowy - ENum

        Product product1 = new Product("Produkt1", 99, Category.A);
        Product product2 = new Product("Produkt2", 59, Category.B);
        Product product3 = new Product("Produkt3", 199, Category.C);

        Customer customer1 = new Customer("Jan", "Kowalski", 59, "jankowalski@wp.pl");
        Customer customer2 = new Customer("Zbyszek", "Nowak", 69, "zbyszeknowak@wp.pl");
        Customer customer3 = new Customer("Kamil", "Kamiński", 16, "kamilkaminski@wp.pl");

        Order order1 = new Order(customer1, product1, 5, 12.07.2020);
        Order order2 = new Order(customer2, product2, 15, 08.03.2020);
        Order order3 = new Order(customer3, product3, 1, 05.02.2020);



    }

}
