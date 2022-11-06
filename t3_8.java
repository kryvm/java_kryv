import java.text.DecimalFormat;

public class t3_8 {

    private static final String[] tensNames = { "", " ten", " twenty",
            " thirty", " forty", " fifty", " sixty", " seventy", " eighty",
            " ninety" };

    private static final String[] numNames = { "", " one", " two", " three",
            " four", " five", " six", " seven", " eight", " nine", " ten",
            " eleven", " twelve", " thirteen", " fourteen", " fifteen",
            " sixteen", " seventeen", " eighteen", " nineteen" };

    private static String convert(int number) {
        String soFar;

        if (number % 100 < 20) {
            soFar = numNames[number % 100];
            number /= 100;
        } else {
            soFar = numNames[number % 10];
            number /= 10;

            soFar = tensNames[number % 10] + soFar;
            number /= 10;
        }
        if (number == 0)
            return soFar;
        return numNames[number] + " hundred" + soFar;
    }

    public static String convert_final(long number) {
        if (number == 0) {
            return "zero";
        }

        String negative = "";

        if (number < 0) {
            negative = "minus ";
            number = (-1)*number;
        }

        String snumber = Long.toString(number);

        // pad with "0"
        String mask = "000000000000";
        DecimalFormat df = new DecimalFormat(mask);
        snumber = df.format(number);

        int n_9 = Integer.parseInt(snumber.substring(3, 6));
        int n_6 = Integer.parseInt(snumber.substring(6, 9));
        int n_3 = Integer.parseInt(snumber.substring(9, 12));

        String mills;
        switch (n_9) {
            case 0:
                mills = "";
                break;
            case 1:
                mills = convert(n_9) + " million ";
                break;
            default:
                mills = convert(n_9) + " million ";
        }
        String result = mills;

        String hundth;
        switch (n_6) {
            case 0:
                hundth = "";
                break;
            case 1:
                hundth = "one thousand ";
                break;
            default:
                hundth = convert(n_6)
                        + " thousand ";
        }
        result = result + hundth;

        String th;
        th = convert(n_3);
        result = result + th;

        result = negative + result;

        System.out.println(result);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(convert_final(-5421));  // "twenty two"
    }
}