package easy;

import java.util.HashMap;
import java.util.Map;

public class _12_IntegerToRoman {
    public static void main(String[] args) {
        String teste1 = intToRoman(12000);
        System.out.println(teste1);
    }
    static String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder resultado = new StringBuilder();
        String numString = num + "";

                for(int i = 0; i < values.length; i++) {

                    while (num >= values[i]){
                        resultado.append(symbols[i]);
                        num-= values[i];
                    }

                    /*if(num >= values[i]){
                        resultado.append(symbols[i]);
                        num-= values[i];
                        break;
                    }

                    */

                }



        //if value[0] != 4 // != 9 append symbol to result
        //if value starts with 4/9 == subtractive form
        return resultado.toString();
    }

}
