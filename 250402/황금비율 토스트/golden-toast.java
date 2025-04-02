import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();

        LinkedList<Character> breads = new LinkedList<>();
        for (int i = 0; i < n; i++)
            breads.add(s.charAt(i));
        

        ListIterator<Character> it = breads.listIterator(breads.size());
        
        for (int i = 0; i < m; i++){
            char com = sc.next().charAt(0);
            switch (com) {
                case 'L' :
                    if (it.hasPrevious())
                        it.previous();
                    break;
                case 'R' :
                    if (it.hasNext())
                        it.next();
                    break;
                case 'D' :
                    if (it.hasNext()){
                        it.next();
                        it.remove();
                    }
                    break;
                default :
                    char c = sc.next().charAt(0);
                    it.add(c);
                    break;
            }
        }

        it = breads.listIterator();
        while (it.hasNext())
            System.out.print(it.next());
    }
}