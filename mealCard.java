

public class MealCard {
    private String uniqueCardID;
    private int balance = 100;
    private List<Meal> purchasedMeals;
    
    public MealCard(String uniqueCardID, int initialBalance) {
        validateInputs(uniqueCardID, initialBalance);
        this.uniqueCardID = uniqueCardID;
        this.balance = initialBalance;
        this.purchasedMeals = new ArrayList<>();
    }
    
    private void validateInputs(String uniqueCardID, int balance) {
        if (uniqueCardID == null || uniqueCardID.trim().isEmpty()) {
            throw new IllegalArgumentException("Card ID cannot be null or empty");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
    }
    

 
    public String getUniqueCardID() {
        return uniqueCardID;
    }
    
    public int getBalance() {
        return balance;
    }
    
 
   
    public void setBalance(int points) {
        this.balance = balance;
    }
    

    
    @Override
    public int hashCode() {
        return Objects.hash(uniqueCardID, balance);
    }
    
    @Override
    public String toString() {
        return "MealCard{" +
                "CardID :'" + uniqueCardID + '\'' +
                ", balance=" + balance +
                '}';
    }
}
