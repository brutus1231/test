
import java.util.Scanner;

public class BinaryNumberConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        System.out.println(convert(n.toString()));
    }

    private static String convert(String digitStr) {
        Integer digit = Integer.parseInt(digitStr);
        Integer digitDiv2 = Integer.parseInt(digitStr) / 2;
        Integer modulo = Integer.parseInt(digitStr) % 2;
        if (digit < 1) {
            if(digit == 2)return "10";
            else return digitDiv2.toString();
        }
        return convert(digitDiv2.toString()) + modulo;
    }


}
