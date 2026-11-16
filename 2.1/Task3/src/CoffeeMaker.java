public class CoffeeMaker {
    private boolean on = false;
    private String coffeeType="normal";
    private int coffeeAmount=10;

    public boolean isOn(){
        return on;
    }
    public void pressOnOff() {
        on = !on;
    }

    public String getCoffeeType(){
        return coffeeType;
    }
    public void setCoffeeType(String newCoffeeType){
        if(on){
            if(newCoffeeType.equals("normal") || newCoffeeType.equals("espresso") ){
                coffeeType= newCoffeeType;
            }
        }
    }

    public int getCoffeeAmount(){
        return coffeeAmount;
    }
    public void setCoffeeAmount(int newCoffeeAmount){
        if(on){
            if(newCoffeeAmount >= 10 && newCoffeeAmount <= 80){
                coffeeAmount=newCoffeeAmount;
            }
        }
    }
}
