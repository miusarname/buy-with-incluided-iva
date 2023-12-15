package product;

import thing.Thing;

public class Product extends Thing {
    double price;

    public Product(double Weight, String Form, String Colors,double Price) {
        super(Weight, Form, Colors);
        this.price = Price;
    }

    public double getIva(){
        return this.price * 0.19;
    }

    public double getPriceWithIva(){
        return getIva()+this.price;
    }
}
