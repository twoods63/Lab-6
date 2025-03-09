import java.util.*;

interface FindFib{
    int calculate_fib(int n);
}
class FibIteration implements FindFib {
    @Override
    public int calculate_fib(int n) {
        int a=1, b=1;
        if(n == 1 || n == 2) {
            return 1;
        } else {
            for (int i = 2; i < n; i++) {
                int temp = a;
                a = b;
                b = temp + b;
            }
            return b;
        }
    }
}

class FibFormula implements FindFib {
    @Override
    public int calculate_fib(int n) {
        return (int) ((Math.pow((1 + Math.sqrt(5)) / 2, n) - Math.pow((1 - Math.sqrt(5)) / 2, n)) / Math.sqrt(5));
    }
}
public class Main {
    public static void main(String[] args) {
        FibIteration iteration = new FibIteration();
        FibFormula fibFormula = new FibFormula();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to find the Fibonacci Series for: ");
        int number = sc.nextInt();
        System.out.println("Fib of " + number + " by iteration is: " + iteration.calculate_fib(number));
        System.out.println("Fib of " + number + " by formula is: " + fibFormula.calculate_fib(number));
    }
}