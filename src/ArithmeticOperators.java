public class ArithmeticOperators {
    public static void main(String[] args) {

        //Arithmetic operators are used to perform arithmetic operations eg: +, -, /, %, *

        int x = 10;
        int y = 2;
        int z = x-y;
        System.out.println("Addition: " + (x+y));
        System.out.println("Subtraction: " + z);
        System.out.println("Multiplication : " + (x*y));
        System.out.println("Division : " + (x/y));
        System.out.println("modulus: " + (x%z));
        int a= 8, b=10;
          // post increment  a++ Decrement b--
        // 1st display and add
        System.out.println("First call  a++ ="+ a++);
        System.out.println("Second call a++ = "+ a);
        System.out.println("first call b-- = "+ b--);
        System.out.println("Second call b-- = "+ b);

        //pre increment ++a pre decrement --b
        //first add and display
        int i=2, j=5;
        System.out.println("First call  ++i ="+ ++i);
        System.out.println("Second call ++i = "+ i);
        System.out.println("first call --j = "+ --j);
        System.out.println("Second call --j = "+ j);
    }
}
