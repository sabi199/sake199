public class LogicalOperators {
    public static void main(String[] args) {
        //Logical Operators are used in decision making. Output will be either true or false
        //used to check weather an expression is true or false.
        //eg: && and (one false then all false), || OR (one true then all true), != not equal

        int x= 10, y=12, z=15;
        System.out.println("T && F is = " +((x<y)&&(y>z)));
        System.out.println("T && T is = " +((x<y)&&(y<z)));
        System.out.println("T || F is = " +((x<y)||(y>z)));
        System.out.println("T || T is = " +((x<y)||(y<z)));
        System.out.println("T != T is = " +((x<y)!=(y<z)));
        System.out.println("F != T is = " +((x>y)!=(y<z)));
        System.out.println("22 != 3 is = " +((x+y)!=(y-z)));
        System.out.println("22 != 22 is = " +((x+y)!=(y+x)));
    }
}
