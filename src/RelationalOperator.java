public class RelationalOperator {
    public static void main(String[] args) {
        //used to check relationship between two oprants (a < b)
        //returns either true or false
        //(==, <, <=, >, >=, !)
        int a=2, b=4, c=6, d=5, e=5;
        System.out.println("2==4 " + (a==b));
        System.out.println("5 ==5 is "+ (d==e));
        System.out.println("5 <=4 is "+ (d<=b));
        System.out.println("5 >=4 is "+ (d>=b));
        System.out.println("5 !=5 is "+ (d!=e));
    }
}
