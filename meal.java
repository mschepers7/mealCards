import java.util.Objects;

public class Meal {
    private String name;
    private int purchasePrice;

    
    public Meal(String name, int purchasePrice) {  n
      
        this.name = name;
        this.purchasePrice = purchasePrice;
    }
    
    
    private void validateInputs(String name, int purchasePrice) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (purchasePrice < 0) {
            throw new IllegalArgumentException("Purchase price cannot be negative");
        }
    }
    
 
    public int getPurchasePrice() {
        return purchasePrice;
    }
    
    public String getName() {
        return name;
    }
    
     public int setPurchasePrice() {
        return purchasePrice;
    }
    
    public String setName() {
        return name;
    }
    
  
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Meal meal = (Meal) obj;
        return purchasePrice == meal.purchasePrice && 
               Objects.equals(name, meal.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name, purchasePrice);
    }
    
   
}
