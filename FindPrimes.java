import java.util.LinkedList;

public class FindPrimes {
    
    public static void main(String[] args) {

        LinkedList<Integer> listOfPrimes = new LinkedList<Integer>();
        final int RANGE = 1000000;
        int upperBound;  // The largest possible prime factor for an integer i
        int count = 1;
        System.out.println(count + " " + 2);    // Prints 2, the first prime
        count++;

        for (int i = 3; i <= RANGE; i = i + 2) {
            upperBound = (int) Math.sqrt(i); // The largest prime factor is equal to the floor of the square root of i
            boolean isPrime = true;

            for (int prime : listOfPrimes) {
                if (i % prime == 0 && (prime <= upperBound)) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                listOfPrimes.addLast(i);
                System.out.println(count + " " + i);
                count++;
            }
        }

    }

}
