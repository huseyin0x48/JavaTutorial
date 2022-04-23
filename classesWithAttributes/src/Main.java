public class Main {

    public static void main(String[] args) {

        Product product = new Product(1, "Laptop", "Lenovo", 3000, 3);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());

    }

}
