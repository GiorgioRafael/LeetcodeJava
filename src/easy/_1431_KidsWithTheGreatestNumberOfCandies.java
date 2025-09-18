package easy;
import java.util.ArrayList;
import java.util.List;
public class _1431_KidsWithTheGreatestNumberOfCandies {


    public static void main(String[] args) {

    int[] candies = new int[5];
    candies[0] = 2;
    candies[1] = 3;
    candies[2] = 5;
    candies[3] = 1;
    candies[4] = 3;

    int extraCandies = 1;


        List<Boolean> tentativa = new ArrayList<>();
        tentativa = kidsWithCandies(candies, extraCandies);
        System.out.println(tentativa);
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int biggestNum = 0;
        List<Boolean> finalResultList = new ArrayList<>();

        //roda a lista procurando o maior número
        for (int i = 0; i < candies.length; i++) {
            int actualNum = candies[i];
            if(biggestNum <= actualNum){
                biggestNum = actualNum;
            }
        }
        //depois de achar o maior numero deve somar todos os numeros do array ao extraCandies e verificar se actualCandieCount >= biggestNum
        for (int i = 0; i < candies.length; i++) {
            int actualCandieCount = candies[i];
                    if(actualCandieCount + extraCandies >= biggestNum)
                    {
                        finalResultList.add(true);
                    } else {
                        finalResultList.add(false);
                    }


        }

        return finalResultList;
        
    }


}
