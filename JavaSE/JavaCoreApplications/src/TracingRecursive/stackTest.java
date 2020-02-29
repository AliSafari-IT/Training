/*
 * In Java the call stack keeps track of the methods that you have called since 
 the main method executes. A stack is a way of organizing data that adds and 
 removes items only from the top of the stack. An example is a stack of cups. 
 You can grap a cup from the top of the stack or add more cups at the top of the
 stack.
 When you are executing one method (method a) and it calls another method 
 (method b) the method call is placed on the call stack along with information 
 about where it was called from, which tells the run-time where to return to 
 when the current method finishes executing. When method b finishes executing 
 the run-time pops the method b off of the call stack and returns execution to 
 the next line to be executed in method a.

 Consider the following class definition.
 */
package TracingRecursive;

/**
 *
 * @author Ali
 */
public class stackTest {

    public static void test1() {
        System.out.println("In test1");
        test2();
        System.out.println("In test 1 after test 2.");
    }

    private static void test2() {
        System.out.println("In test 2.");
        int y = 0;
        int x = 3 / y;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int mystery(int n, int a) {
        if (n == 1) {
            return a;
        }
        return a * mystery(n - 1, a);
    }

    public static int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        } else if (bunnies == 1) {
            return 2;
        } else {
            return 2 + bunnyEars(bunnies - 1);
        }
    }

    public static void mysteria(int x) {
        System.out.print(x % 10);

        if ((x / 10) != 0) {
            mysteria(x / 10);
        }
        System.out.print(x % 10);
    }

    public static int mysterian(String str) {
        if (str.length() == 1) {
            return 0;
        } else {
            if (str.substring(0, 1).equals("y")) {
                return 1
                        + mysterian(str.substring(1));
            } else {
                return mysterian(str.substring(1));
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("In main method:");
        int a = factorial(6);
        System.out.println("factorial(6)= " + a);
        int k = mystery(4, 3);
        System.out.println("mystery(4,3)= " + k);
        int m = bunnyEars(5);
        System.out.println("bunnyEars(5)= " + m);
        System.out.print("mysteria(1234)= ");
        mysteria(1234);
        System.out.println("\nmysterian(“xyzxyxy”)= " + mysterian("xyzxyxy"));

    }
}
