import java.util.Scanner;

/**
 * Created by lh
 * on 2017/5/13.
 */
public class Code10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        while ((str = scanner.nextLine()) != null && (!str.equals(""))) {
            String strTemp = null;
            boolean flag = false;
            for (int i = 0; i <= str.length(); i++) {
                strTemp = str.substring(0, i) + "#" + str.substring(i, str.length());
                if (is(strTemp)) {
                    System.out.println("YES");
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.println("NO");
        }

    }

    public static boolean is(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) == '#' || s.charAt(right) == '#' || s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}
