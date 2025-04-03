import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < n - 1; i++){
            int min = arr[i];
            for (int j = i; j < n; j++){
                if (arr[i] > arr[j]) {
                    min = arr[j];
                    arr[j] = arr[i];
                    arr[i] = min;
                }
            }
        }

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

    }
}