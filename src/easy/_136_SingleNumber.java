package easy;

public class _136_SingleNumber {
    public static void main(String[] args) {
    int[] nums = new int[5];
        nums[0] = 4;
        nums[1] = 1;
        nums[2] = 2;
        nums[2] = 1;
        nums[2] = 2;

        int resultado = singleNumber(nums);
        System.out.println("o resultado foi: " + resultado);

    }
    //solucao pensada por mim, apos um pouco de pesquisa, vi a solução X OR
    static int singleNumber(int[] nums) {
        //if(nums.length == 1) return nums[0];

        //rodar todos os numeros, se a bandeira nao for true, achamos

        for (int i = 0; i < nums.length; i++) {
            boolean temDuplicata = false; //bandeira
            loopExterno:
            for (int j = 0; j < nums.length; j++) {


                //se estiverem comparando o mesmo numero, ignorar
                if(i == j){
                    continue;
                }
                //se os dois numeros forem iguais, tem duplicata, passar para proximo numero
                if(nums[j] == nums[i]) {
                    temDuplicata = true;
                    continue loopExterno;
                }

            }
            if(temDuplicata == false) return nums[i];
        }
        return nums[0];
    }

}

