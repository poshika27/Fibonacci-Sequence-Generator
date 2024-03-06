public class Fibonacci {
    public static void main(String[] args) {
        int numTerms = 10; // Change this value to generate a different number of terms
        System.out.println("Fibonacci Sequence of " + numTerms + " terms:");
        printFibonacci(numTerms);
    }

    public static void printFibonacci(int numTerms) {
        int num1 = 0, num2 = 1;
        for (int i = 0; i < numTerms; i++) {
            System.out.print(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}
