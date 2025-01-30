public class Bmi {
    public static double BMI(double height,double weight){
        double Bmi=weight/Math.pow(height,weight);
        return Bmi;
    }
    public static void main(String[]args){
        double height=1.79832;
        double weight=70;
        double Bmi=BMI(height,weight);
        System.out.print("the BMI is"+Bmi+"so");
        if(Bmi<18.5)
        System.out.print("underweight");
        else if(Bmi>=18.5&&Bmi<24.9)
        System.out.print("healthy");
        else if(Bmi>=24.9&&Bmi<30)
        System.out.print("overweight");
        else if(Bmi>=30)
        System.out.print("suffering from obesity");
    }
    
}
