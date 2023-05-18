/*
Create Product class with fields id, name and price and 
create Prodct object and store data and 
display that data.
*/

public class Product1{
    private int id;
    private String name;
    private float price;

    public static void main(String[] args){
        Product1 product = new Product1();
        product.id = 101;
        product.name = "Soap";
        product.price = 24.5f;

        System.out.println("product is : " + product.name 
        + " \nits id is :" + product.id + " and price is : " + product.price + ". ");

    }
}