
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class t3_16 {
    public static String filterUkr(String a) {
        String[] letters = {"а","б","в","г","ґ","д","е","є","ж","з","и","і","ї","й","к","л","м","н","о","п","р","с","т","у","ф","х","ц","ч","ш","щ","ь","ю","я"};
        String[] arr = a.split("");
        String res = "";
        List<String> lettersList = new ArrayList<>(Arrays.asList(letters));
        for (int i = 0; i < a.length(); i++) {
            if(lettersList.contains(arr[i])) {
                res = res + arr[i];
            }
        }
        return res;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in,  "UTF-8");
        String word = input.nextLine();

        try {
            word = new String(word.getBytes("windows-1251"), Charset.forName("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(filterUkr(word));
    }
}
