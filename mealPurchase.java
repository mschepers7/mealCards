import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MealCard extends mealCard {
  
    private List<Meal> purchasedMeals;
    
    public MealPurchase(String uniqueCardID, int initialBalance) {
        this.purchasedMeals = new ArrayList<>();
    }

  
    public boolean addBalance(int points) {
        if(balance >= 0 ){
            setBalance(getBalance()+points);
            return true;
            }else {
            return false;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MealCard mealCard = (MealCard) obj;
        return balance == mealCard.balance && 
               Objects.equals(uniqueCardID, mealCard.uniqueCardID);
    }
    

    
     public boolean purchaseMeal(Meal meal) {
        if (meal == null) {
            throw new IllegalArgumentException("Meal cannot be null");
        }
        
        if (balance >= meal.getPurchasePrice()) {
            balance -= meal.getPurchasePrice();
            purchasedMeals.add(meal);
            return true; 
        }
        return false; 
    }
  
}
