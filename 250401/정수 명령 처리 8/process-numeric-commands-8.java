import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            String s = sc.next();

            if (s.equals("push_front")){
                int a = sc.nextInt();
                ll.addFirst(a);
            } else if (s.equals("push_back")){
                int a = sc.nextInt();
                ll.addLast(a);
            } else if (s.equals("pop_front")){
                System.out.println(ll.pollFirst());
            } else if (s.equals("pop_back")){
                System.out.println(ll.pollLast());
            } else if (s.equals("size")){
                System.out.println(ll.size());
            } else if (s.equals("empty")){
                System.out.println(ll.isEmpty() == true ? 1 : 0);
            } else if (s.equals("front")){
                System.out.println(ll.peekFirst());
            } else if (s.equals("back")){
                System.out.println(ll.peekLast());
            } 
        }
    }
}