/**
 * Created by lh
 * on 2017/5/13.
 */
/*题目描述
请设计一个高效算法，再给定的字符串数组中，找到包含"Coder"的字符串(不区分大小写)，
并将其作为一个新的数组返回。结果字符串的顺序按照"Coder"出现的次数递减排列，
若两个串中"Coder"出现的次数相同，则保持他们在原数组中的位置关系。
给定一个字符串数组A和它的大小n，请返回结果数组。保证原数组大小小于等于300,
其中每个串的长度小于等于200。同时保证一定存在包含coder的字符串。
测试样例：
["i am a coder","Coder Coder","Code"],3
返回：["Coder Coder","i am a coder"]
* */
public class Code5 {
    public static void main(String[] args) {
        String[] A = {"i am a coder", "Coder Coder", "Code"};
        String[] B = findCoder(A, A.length);
        for (int i = 0; i < B.length; i++)
            System.out.println(B[i]);
    }

    public static String[] findCoder(String[] A, int n) {
        // write code here
        String s = null;
        int[] countA = new int[A.length];
        int index = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            s = A[i];
            assert s != null;
            String sLow;
            String[] x = (sLow = s.toLowerCase()).split(" ");
            if (sLow.contains("coder"))
                sum++;
            for (String str : x)
                if (str.equals("coder"))
                    countA[index]++;
        }
        String[] B = new String[sum];
        index = 0;
        for (int i = 0; i < A.length; i++) {
            if (countA[i] != 0) {
                B[index++] = A[i];
            }
        }
        return B;
    }
}
