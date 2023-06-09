package laba2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Setting the number of iterations
        int n = 20;

        // Setting the initial amount
        double sum = 0;

        // Performing a cycle
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= 1 / (2.0 * i - 1);
            } else {
                sum += 1 / (2.0 * i - 1);
            }
        }
     // Output the result
        System.out.println("The sum of the series is up to 5 characters: " + String.format("%.5f", sum));
	}

}
