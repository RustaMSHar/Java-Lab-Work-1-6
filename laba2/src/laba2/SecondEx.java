package laba2;

public class SecondEx {

	public static void main(String[] args) {
		
        double h = 0.001;
        double x = 1.0;
        double result = numerical_derivative(x, h);
        System.out.println("The derivative of the function at the point " + x + " equal to " + result);
    }

    public static double numerical_derivative(double x, double h) {
        double fx = x * x - x + 1.0;
        double fxh = (x + h) * (x + h) - (x + h) + 1.0;
        return (fxh - fx) / h;
    }

}
