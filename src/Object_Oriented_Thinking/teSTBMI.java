package Object_Oriented_Thinking;

public class teSTBMI {

    public static void main(String[] args) {
        BMI bmi1 = new BMI("Rima", 27, 5.1, 50);
        System.out.println("The BMI for " + bmi1.getName() + 
                " is " + bmi1.getBMI() + " " + bmi1.getStatus());

        BMI bmi2 = new BMI("Rima1", 5.8, 97);
        System.out.println("The BMI for " + bmi2.getName() + 
                " is " + bmi2.getBMI() + " " + bmi2.getStatus());
    }
}
