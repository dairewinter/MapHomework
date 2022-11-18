import java.util.Objects;

public class Product {
    private String productName;
    private double cost;
    public int amount;
    private final boolean isBought;

    public Product(String productName, double cost, int amount) {
        this.productName = Validation.validName(productName);
        this.cost = cost;
        this.amount = Validation.validAmount(amount);
        this.isBought = false;
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Продукт " + getProductName() + ", стоимость " + getCost() + ", количество " + getAmount();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.cost, cost) == product.cost && amount == product.amount && productName.equals(product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, cost, amount);
    }
}
