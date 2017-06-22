/**
 * Created by lh
 * on 2017/5/18.
 */
/*
题目描述
请你实现一个简单的字符串替换函数。原串中需要替换的占位符为"%s",请按照参数列表的顺序一一替换占位符。若参数列表的字符数大于占位符个数。则将剩下的参数字符添加到字符串的结尾。
给定一个字符串A，同时给定它的长度n及参数字符数组arg，请返回替换后的字符串。保证参数个数大于等于占位符个数。保证原串由大小写英文字母组成，同时长度小于等于500。
测试样例：
"A%sC%sE",7,['B','D','F']
返回："ABCDEF"
* */
public class Code14 {
    public static void main(String[] args){
        String A = "A%sC%sE";
        char[] arg = {'B','D','F'};
        int m = 7;
        System.out.println(formatString(A,arg,m));
    }
    public static String formatString(String A,char[] arg, int m) {
        // write code here
        int index = 0;
        char[] charA = A.toCharArray();
        for (int i=0;i < m-1;i++){
            if (charA[i]=='%'&&charA[i+1]=='s')
                charA[i+1]=arg[index++];
        }
        StringBuffer bufferA = new StringBuffer(String.valueOf(charA).replace("%",""));
        while (index<arg.length){
            bufferA.append(arg[index]);
            index++;
        }
        return bufferA.toString();
    }
}
