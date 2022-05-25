package controlStatement;

public class SimpleInterest {

    public static void main(String[] args) {
        double principle = 5000;
        double rate = 5.0/100; //0.05
        double time = 3;
        double si, a;
        double ci;

        a = principle*(1+(rate * time));
        si = a - principle;
        System.out.println("Amount is = "+ a);
        System.out.println("Simple Interest = "+ si);
        ci = principle * Math.pow((1 + rate),time)-principle;
        System.out.println("Compound Interest = "+ci);
    }
}
