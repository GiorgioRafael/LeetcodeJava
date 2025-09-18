package easy;
import java.util.ArrayList;
import java.util.List;

public class _283_MoveZeroes {

    public static void main(String[] args) {
        System.out.println("Hello!");

        // 1. Crie um array com valores de teste.
        int[] nums = {0, 1, 0, 3, 12};

        // 2. Chame sua função.
        moveZeroes(nums);

        // 3. Imprima o array para ver o resultado.
        System.out.println("Array após a execução da função:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    //ARRAY 2,5,7,12,2,3
    //QUANTIDADE DE ZEROS ENCONTRADOS: 3
    //2,5,7,12,2,3,0,0,0
    //array é um tipo de dado. ele armazena varias casa
    //BAU: [0][2][2][3][2][2]

    public static void moveZeroes(int[] nums) {
        //criar um array/lista vazio
        List<Integer> listaFinal = new ArrayList<>();
        int contadorDeZeros = 0;

        //rodar a lista verificando se n == 0
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                contadorDeZeros++;
            }
            else {
                listaFinal.add(nums[i]);
            }
        }
        if(contadorDeZeros >= 1) {
            for (int i = 0; i< contadorDeZeros; i++) {
                listaFinal.add(0);
            }
        }
        // 2. Loop through the list and copy each element to the new array.
        for (int i = 0; i < listaFinal.size(); i++) {
            nums[i] = listaFinal.get(i);
        }

        //no final adicionar a quantidade de zeros do contadorDeZeros no final do array
    }
}
