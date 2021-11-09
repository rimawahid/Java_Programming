
package Object_Oriented_Thinking;

public class BMI {
    private String name;
    private int age;
    private double height; //foot
    private double width; //kg
    public static final double FOOT_PRE_METER= 0.3048;

    public BMI(String name, int age, double height, double width) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.width = width;
    }
    public BMI(String name,double height, double width){
        this(name,20,height,width);
    }
    public double getBMI(){
        double bmi = width/((height*FOOT_PRE_METER)*(height*FOOT_PRE_METER));
        return Math.round( bmi*100)/100.0;
    }
    
    public String getStatus(){
        double bmi = getBMI();
        if (bmi<18.5) {
            return "Underweight";
        }else if(bmi <25){
            return "Normal";
        }else{
            return "Overweight";
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public static double getMETER_PRE_INCH() {
        return METER_PRE_INCH;
    }
    
}
