public class CoffeeMakerDriver {
    public static void main(String[] args){
        CoffeeMaker myCoffee= new CoffeeMaker();

        myCoffee.pressOnOff();
        myCoffee.setCoffeeType("espresso");
        myCoffee.setCoffeeAmount(50);

        System.out.println("Coffee maker is on");
        System.out.println("Coffee type is " + myCoffee.getCoffeeType());
        System.out.println("Coffee amount is "+ myCoffee.getCoffeeAmount());

        myCoffee.pressOnOff();
        System.out.println("Coffee maker is off");

    }
}
