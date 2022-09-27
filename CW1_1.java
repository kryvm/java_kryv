import java.util.Scanner;

class CW1_1 {
    public static void main(String[] args) {
        char a;
        int b;
        String c;
        //System.out.println(a + " " + b + " " + c);
    }
}
class CW1_2 {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
class CW1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three words respectively: ");
        String number1 = scanner.nextLine();
        String number2 = scanner.nextLine();
        String number3 = scanner.nextLine();
        System.out.println(number1 + " " + number2 + " " + number3);
    }
}

class CW1_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers respectively: ");
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double number3 = scanner.nextDouble();
        System.out.println(number1 + number2 + number3);
    }
}

class CW1_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username:");
        String number1 = scanner.nextLine();
        System.out.println(number1);
    }
}

class CW2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your surname:");
        String number1 = scanner.nextLine();
        System.out.println("HELLO, " + number1);
    }
}
///123
class CW2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers respectively: ");
        String number1 = scanner.nextLine();
        double number2 = scanner.nextDouble();
        System.out.println("first number length = " + number1.length());
        int length2 = (int)Math.floor(Math.log10(number2) + 1);
        System.out.println("second number length = " + length2);
        double harmonic = 2/(1/Double.parseDouble(number1) + 1/number2);
        System.out.printf("Average harmonic = %.2f",harmonic);
    }
}

class CW2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers in a row: ");
        String numbers = scanner.nextLine();
        String[] numb = numbers.split(" ");
        int sum = 0;
        for (String number : numb) {
            sum += Integer.parseInt(number);
        }
        double result = sum/numb.length;
        System.out.println("result: " + result);
    }
}

class CW2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter celcius: ");
        double celcius = scanner.nextDouble();
        double farenheit = celcius*9/5 + 32;
        System.out.printf("Average harmonic = %.1f",farenheit);
    }
}

class HW2_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers respectively: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println(number1 * number2);
    }
}

class CW3_1 {
    public static void main(String[] args) {
        double a = 1.2 + 31;
        System.out.println("a = " + a);
        double b = 45*54 - 11;
        System.out.println("b = " + b);
        double c = 15/4;
        System.out.println("c = " + c);
        double d = 15.0/4;
        System.out.println("d = " + d);
        double e = 67%5;
        System.out.println("e = " + e);
        double f = (2*45.1 + 3.2)/2;
        System.out.println("f = " + f);
    }
}

class CW3_2 {
    public static void main(String[] args) {
        double a = 2+3;
        System.out.println("Результат дорівнює : " + a);
        double b = 4.5*56;
        System.out.println("Результат дорівнює : " + b);
        double c = 2/3.0;
        System.out.println("Результат дорівнює : " + c);
    }
}

class CW3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ім'я :");
        String number1 = scanner.nextLine();
        System.out.println("Привіт, " + number1 + "!");
    }
}

class CW3_4 {
    public static void main(String[] args) {
        float a1 = (float)Math.pow(10,-4);
        double a2 = Math.pow(10,-4);
        long a3 = (long)Math.pow(10,-4);

        float b1 = (float) (2.33 * Math.pow(10,5));
        double b2 = 2.33 * Math.pow(10,5);
        long b3 = (long) (2.33 * Math.pow(10,5));

        float c1 = (float)Math.PI;
        double c2 = Math.PI;
        long c3 = (long)Math.PI;

        float d1 = (float)Math.exp(1);
        double d2 = Math.exp(1);
        long d3 = (long)Math.exp(1);

        float e1 = (float)Math.log(100);
        double e2 = Math.log(100);
        long e3 = (long)Math.log(100);

    }
}

class CW3_5 {
    public static void main(String[] args) {
        int x1 = 1;
        int x2 = 2;
        int x3 = 3;
        int x4 = 4;
        int x5 = 5;
        System.out.printf("x | %d | %d | %d | %d | %d |\n",x1,x2,x3,x4,x5);

        System.out.printf("- | -- | -- | -- | -- | -- |\n");

        double y1 = 1.2;
        double y2 = 2.4;
        double y3 = 3.5;
        double y4 = 4.2;
        double y5 = 5.1;
        System.out.printf("y | %.2f | %.2f | %.2f | %.2f | %.2f |\n",y1,y2,y3,y4,y5);
    }
}

class CW3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two strings respectively: ");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        System.out.println("!!! " + str1 + " , " + str2 + " !!!");
    }
}

class CW3_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mult = 6.673*Math.pow(10,-11);
        System.out.println("Enter m1,m2 and r respectively: ");
        double m1 = scanner.nextDouble();
        double m2 = scanner.nextDouble();
        double r = scanner.nextDouble();
        double f = mult*m1*m2/Math.pow(r,2);
        System.out.printf("F = %.3e",f);
    }
}

class CW3_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        double n = scanner.nextDouble();
        System.out.println("Without functions:");
        if ( n >= 0) {
            int n1 = (int)n;
            double n2 = n - n1;
            System.out.printf("Celaya = %d, Drobnaya = %f, maximum lower/equal than n = %d, minimum higher/equal than n = %d\n",n1,n2,n1,n1+1);
        }
        else {
            int n1 = (int)n - 1;
            double n2 = n - n1;
            System.out.printf("Celaya = %d, Drobnaya = %f, maximum lower/equal than n = %d, minimum higher/equal than n = %d\n",n1,n2,n1,n1+1);
        }

        System.out.println("With functions:");
        int n1 = (int) Math.floor(n);
        double n2 = n - n1;
        System.out.printf("Celaya = %d, Drobnaya = %f, maximum lower/equal than n = %d, minimum higher/equal than n = %d\n",n1,n2,n1,n1+1);
    }
}

class HW3_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double p = (a+b+c)/2;
        double square = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.printf("Square of triangle is %f",square);
    }
}

class CW4_4 {
    public static void main(String[] args) {
        double a = 3;
        double b = 3.5 + 3*Math.pow(2,-111);
        double c = b;
        double perimeter = (a+b+c);
        double p = perimeter/2;
        double square = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.printf("Square of triangle is %f, perimeter is %f",square,perimeter);
    }
}

class HW4_6g {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        double x = scanner.nextDouble();
        double f = Math.atan(x);
        double derF = 1/(1+x*x);
        System.out.printf("Function = %f\n Derivative = %f",f,derF);
    }
}