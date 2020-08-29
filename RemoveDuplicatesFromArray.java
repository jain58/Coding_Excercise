public class RemoveDuplicatesFromArray {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        int[] temp = new int [length];

        int j =0;
        for (int i=0; i<nums.length-1; i++){
            if(nums[i]!=nums[i+1]){
                temp[j++]=nums[i];
            }
        }
        // last element
        temp[j++] = nums[length-1];

        for (int i =0; i<j; i++){
            nums[i] = temp [i];
        }
        return j;
    }

    public static void main(String[] args){
        RemoveDuplicatesFromArray removeDuplicatesFromArray = new RemoveDuplicatesFromArray();
        int[] nums = {1,1, 2,2,3,4,5,6,7,7};
        System.out.println(removeDuplicatesFromArray.removeDuplicates(nums));
        for (int i =0; i<nums.length; i++) {
            System.out.print(nums[i]+", ");
        }
    }
}
