package pl.sda.zamowienia;

public class Product {

    private String name;
    private double price;
    Category category;

    public Product(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws NameException {
        if(Character.isUpperCase(Integer.parseInt(name))){
            this.name = name;
        } else {
            throw new NameException("Nieprawidłowa wielkość liter");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws NameException {
        if(price>0) {
            this.price = price;
        } else {
            throw new NameException("Cena musi być dodatnia");
        }
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }


}
