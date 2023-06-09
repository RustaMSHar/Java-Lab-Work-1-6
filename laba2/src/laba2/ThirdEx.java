package laba2;

public class ThirdEx {
    public static double integrate(double a, double b, int n) {
        double h = (b - a) / n;
        double sum = (f(a) + f(b)) / 2.0;
        for (int i = 1; i < n; i++) {
            double x = a + i * h;
            sum += f(x);
        }
        return sum * h;
    }

    public static double f(double x) {
        return 4 * Math.sqrt(1 - x * x);
    }

    public static void main(String[] args) {
        double a = 0.0; // lower limit
        double b = 1.0; // upper limit
        int n = 100; // number of trapezoids
        double result = integrate(a, b, n);
        System.out.println("The result is " + result);
    }
}
