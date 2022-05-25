package controlStatement;

public class Homework {
    public static void main(String[] args) {
        int a= 85, b=985, c=85;
        //print highest number
        if((a>b)&&(a>c)){
            System.out.println(a);
        }
        else if ((b>a)&&(b>c)) {
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
    }
}