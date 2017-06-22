import java.util.*;

/**
 * Created by lh
 * on 2017/5/18.
 */
/*
写一段代码，判断一个包括'{','[','(',')',']','}'的表达式是否合法(注意看样例的合法规则。)
给定一个表达式A,请返回一个bool值，代表它是否合法。
测试样例：
"[a+b*(5-4)]*{x+b+b*(({1+2)}}"
返回：true
* */
public class Code13 {
    public static void main(String[] args){
        String s = "[a+b*(5-4)]*{x+b+b*{(1+2)}}";
        System.out.println(chkLegal(s));

    }
    public static boolean chkLegal(String A) {
        // write code here
        Set<Character> operatorLeft = new HashSet<Character>(Arrays.asList('{','[','('));
        Set<Character> operatorRight = new HashSet<Character>(Arrays.asList(')',']','}'));
        Map<Character,Character> operatorMap = new HashMap<>();
        operatorMap.put('{','}');
        operatorMap.put('[',']');
        operatorMap.put('(',')');
        //System.out.println(operatorLeft+" "+operatorRight);
        Stack<Character> exp = new Stack<Character>();
        char[] xepC = A.toCharArray();
        //System.out.println(xepC);
        for (char c:xepC){
            if (operatorLeft.contains(c))
                exp.push(c);
            else if (operatorRight.contains(c)){
                char tempC = exp.pop();
                if (!(operatorMap.get(tempC).equals(c)))
                    return false;
            }
        }
        return true;
    }
}
