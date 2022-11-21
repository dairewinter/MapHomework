import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Recipe {
    private String name;
    private Map<Product, Integer> products = new HashMap<>();


    public Recipe(String name) {
        this.name = name;
    }

    public void addProduct(Product product, int amount) {
        if(this.products.containsKey(product)){
            this.products.put(product, this.products.get(product)+ amount);
        } else {
            this.products.put(product, amount);
        }
    }

    public double getTotalCost() {
        double sum = 0;
        for (Map.Entry<Product, Integer> product : this.products.entrySet()){
            sum += product.getKey().getCost() * product.getValue();
        }
        return sum;
    }

    public String getName() {
        return name;
    }

}
