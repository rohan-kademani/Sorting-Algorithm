public class SelectionSort {

    public static int[] selectionSortMethod(int nums[]){
        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
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
        int nums[] = { 1, 7, 5, 2, 3, 9 };
        printArray(nums);
        selectionSortMethod(nums);
        printArray(nums);
        
    }
}