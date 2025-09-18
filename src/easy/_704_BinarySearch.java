package easy;

public class _704_BinarySearch {
    public static void main(String[] args) {

    int[] nums = new int[2];
    nums[0] = 2;
    nums[1] = 5;


    int target = 2;

    //[-1,0,3,5,9,12]
    System.out.println(search(nums, target));
    }


    public static int search(int[] nums, int target) {
        //if(nums[0] == target) return 0;
        int midNumber = nums.length/2;
        int midNumberValue = nums[midNumber];
        if(midNumberValue > target ){
            for (int i = midNumber; i >= 0; i--) {
                if(nums[i] == target){
                    return i;
                }
            }
        }
        else {
            for(int i = midNumber; i < nums.length; i++){
                //logica para procurar o numero
                if(nums[i] == target){
                    return i;
                }
            }
        }
        return -1;
    }
}
