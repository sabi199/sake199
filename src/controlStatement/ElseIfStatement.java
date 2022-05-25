package controlStatement;

public class ElseIfStatement {
    public static void main(String[] args) {
        char grade = 'a';
        if (grade == 'a'){
            System.out.println("Congratulations you got 90 + !!!!");
        } else if (grade == 'b' ) {
            System.out.println("Congratulation you got 80-90");
        }
        else{  //executes if condition 1 and 2 are false
            System.out.println("Better Luck Next Time");
        }
    }
}