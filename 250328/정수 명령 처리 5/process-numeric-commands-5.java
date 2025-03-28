import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> intArr = new ArrayList();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            String command = sc.next();

            if (command.equals("push_back")){
                int a = sc.nextInt();
                intArr.add(a);
            } 
            else if (command.equals("pop_back")){
                intArr.remove(intArr.size() - 1);
            } 
            else if (command.equals("size")){
                System.out.println(intArr.size());
            } 
            else {
                int k = sc.nextInt();
                System.out.println(intArr.get(k - 1));
            }
        }
    }
}