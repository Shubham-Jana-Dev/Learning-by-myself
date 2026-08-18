package MathematicsPractice;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {
    public static void main(String[] args) {
        int num = 1994;
        HashMap<Integer, String> oneLess = new HashMap<>(Map.of(4, "IV", 9, "IX", 40, "XL", 90, "XC", 400, "CD", 900, "CM"));
        HashMap<Integer, String> whole = new HashMap<>(Map.of(1, "I", 5, "V", 10, "X", 50, "L", 100, "C", 500, "D", 1000, "M"));
        String result = "";
        int temp = num;
        int rev = 0;
        int tenCount = 0;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
            tenCount++;
        }
        System.out.println(rev);

        while (rev != 0) {
            System.out.println((int) (Math.pow(10, tenCount) * (rev % 10)) / 10);
            int bitNum = (int) (Math.pow(10, tenCount) * (rev % 10)) / 10;
            while (bitNum > 0) {
                if (bitNum == 4) {
                    result = result + "IV";
                    break;
                } else if (bitNum == 9) {
                    result = result + "IX";
                    break;
                } else if (bitNum == 40) {
                    result = result + "XL";
                    break;
                } else if (bitNum == 90) {
                    result = result + "XC";
                    break;
                } else if (bitNum == 400) {
                    result = result + "CD";
                    break;
                } else if (bitNum == 900) {
                    result = result + "CM";
                    break;
                } else if (bitNum >= 1000) {
                    bitNum = bitNum - 1000;
                    result = result + 'M';
                } else if (bitNum >= 500) {
                    bitNum = bitNum - 500;
                    result = result + 'D';
                } else if (bitNum >= 100) {
                    bitNum = bitNum - 100;
                    result = result + 'C';
                } else if (bitNum >= 50) {
                    bitNum = bitNum - 50;
                    result = result + 'L';
                } else if (bitNum >= 10) {
                    bitNum = bitNum - 10;
                    result = result + 'X';
                } else if (bitNum >= 5) {
                    bitNum = bitNum - 5;
                    result = result + 'V';
                } else if (bitNum >= 1) {
                    bitNum = bitNum - 1;
                    result = result + 'I';
                }
                System.out.println(result);
            }
            tenCount--;
            rev = rev / 10;
        }
        System.out.println(result);


    }
}