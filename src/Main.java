import java.io.*;
import java.util.Scanner;
import java.util.Formatter;

public class Main {
    public static void main(String[] args)
    {
        try
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите k: ");
            int k = in.nextInt();
            if(k <= 0)
            {
                throw new RuntimeException("Значение k должно быть положительным!");
            }

            Formatter fmt = new Formatter();
            fmt.format("Десятичная запись числа k: %d%n", k);
            String octal_number_format = "%#05o%n";
            fmt.format("Восьмеричная запись числа k: " + octal_number_format, k);
            String hexadecimal_number_format = "%#05X%n";
            fmt.format("Шестнадцатеричная запись числа k: " + hexadecimal_number_format, k);
            System.out.print(fmt);

            System.out.print("Введите x: ");
            double x = in.nextDouble();
            if(x >= 1 || x < -1)
            {
                throw new RuntimeException("Значение x должно быть в пределах [-1; 1)!");
            }

            String floatFormat = "%+05." + (k + 1) + "f%n";
            System.out.printf("x = " + floatFormat, x);

            Logarithm object = new Logarithm();
            object.logarithm(x, k);

            in.close();
            fmt.close();
        }
        catch(RuntimeException e)
        {
            System.out.println("Ошибка введенных данных: " + e.getMessage());
        }
    }
}

