public class SelectionSorting {

    public static void main(String[] args) {
        int nums[] = { 1, 7, 5, 2, 3, 9 };
        System.out.println("Selection Sort in Action");
        for(int i:nums)
            System.out.print(i+" ");
        System.out.println();

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
        
        
        for(int i:nums)
            System.out.print(i+" ");
        System.out.println();
    }
}