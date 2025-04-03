import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        for (int i = 1; i < n; i++){
            int j = i - 1;
            int key = nums[i];
            while (j >= 0 && nums[j] > key){
                nums[j+1] = nums[j];
                j--; 
            }
            nums[j+1] = key;
        }

        for (int i = 0; i < n; i++)
            System.out.print(nums[i]+ " ");
    }
}