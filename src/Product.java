import java.util.Objects;

public class Product {
    private String productName;
    private double cost;


    public Product(String productName, double cost) {
        this.productName = Validation.validName(productName);
        this.cost = cost;
    }


    public String getProductName() {
        return productName;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Продукт " + getProductName() + ", стоимость " + getCost();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productName.equals(product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName);
    }
}
