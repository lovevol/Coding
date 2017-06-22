import java.util.HashSet;
import java.util.Set;

/**
 * Created by lh
 * on 2017/5/13.
 */
/*题目描述
对于一个字符串，请设计一个高效算法，找到第一次重复出现的字符。
给定一个字符串(不一定全为字母)A及它的长度n。请返回第一个重复出现的字符。保证字符串中有重复字符，字符串的长度小于等于500。
测试样例：
"qywyer23tdd",11
返回：y
* */
public class Code4 {
    public static void main(String[] args) {
        String s = "qywyer23tdd";
        int n = s.length();
        System.out.println(findFirstRepeat(s,n));
    }

    public static char findFirstRepeat(String A, int n) {
        Set set = new HashSet();
        char[] X = A.toCharArray();
        for (char c : X){
            if (set.contains(c))
                return c;
            else
                set.add(c);
        }
        return 0;
    }
}
