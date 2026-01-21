public class BubbleSort {


    public static int[] BubbleSortMethod(int nums[]){
        for(int i=0;i<nums.length;i++){
            boolean isSwapped = false;
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]= temp;
                    isSwapped=true;
                }
            }
            if(!isSwapped)
                break;
        }
        return nums;
    }

    public static void printArray(int nums[]){
        System.out.print("Printing Array :");
        for(int i : nums){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums1[]={3,1,2,5,1,7,2};
        printArray(nums1);
        BubbleSortMethod(nums1);
        printArray(nums1);
    }
}