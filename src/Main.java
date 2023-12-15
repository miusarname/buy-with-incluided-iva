import product.Product;

public class Main {
        public static void main(String[] args) {
        //System.out.println("Hello world!");

        Product cellphone = new Product(150.10,"Cuadrada","rojo",150);

        System.out.println(cellphone.getIva());
        System.out.println(cellphone.getPriceWithIva());
        System.out.println(cellphone);
    }
}