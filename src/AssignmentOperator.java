public class AssignmentOperator {
    public static void main(String[] args) {
        //Used to assign value from right to left
        //eg: a=10 a has value of 10, b=a b has value 10
        int a = 6; int b=a;
        int c= ++a; int g= 5;

        System.out.println("first call a=6 is now a="+ a);  // 1st call a =6
        System.out.println(b);
        System.out.println(c);
        System.out.println(a);
        System.out.println(g);
        System.out.println(--g);
    }
}
