public class Logarithm
{
    public void logarithm(double x, int k)
    {
        double accuracy = Math.pow(10, (-k));
        System.out.println("Точность = " + accuracy);
        int i = 1;
        double slog = -x;
        double sum = slog;
        while(Math.abs(slog) > accuracy)
        {
            slog = slog * x * i/(i+1);
            sum = sum + slog;
            i=i+1;
        }
        String floatFormat = "%+05." + (k + 1) + "f%n";
        System.out.printf("Сумма = " + floatFormat, sum);
        System.out.printf("Сумма, вычисленная с помощью стандартных функций = " + floatFormat, Math.log(1-x));
    }
}
