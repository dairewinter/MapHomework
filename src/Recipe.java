import java.util.List;

public class Recipe {
    private List<Product> products;
    private double totalCost;
    private String name;

    public Recipe(List<Product> products, double totalCost, String name) {
        this.products = products;
        this.totalCost = totalCost;
        this.name = name;
    }

    public double getTotalCost(Product product) {
        return product.getAmount() * product.getCost();
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts(){
        return products;
    }
}
