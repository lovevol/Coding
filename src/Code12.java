import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by lh
 * on 2017/5/13.
 */
public class Code12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.next();
            Set set = new HashSet();
            char[] c = s.toCharArray();
            for (char ch : c) {
                if (!set.contains(ch)) {
                    set.add(ch);
                    System.out.print(ch);
                }
            }
            System.out.println();
        }
    }
}
