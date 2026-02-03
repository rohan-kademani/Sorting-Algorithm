public class InsertionSort {

    public static int[] insertionSortMethod(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int j = i;
            while (j > 0 && nums[j - 1] > nums[j]) {
                int temp = nums[j - 1];
                nums[j - 1] = nums[j];
                nums[j] = temp;
                j--;
            }
        }
        return nums;
    }

    public static void printArray(int nums[]) {
        System.out.print("Printing Array :");
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nums[] = { 1, 5, 1, 2, 8, 4, 3 };
        printArray(nums);
        insertionSortMethod(nums);
        printArray(nums);
    }
}