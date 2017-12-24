import java.util.*;

/**
 * 有一种有趣的字符串价值计算方式:统计字符串中每种字符出现的次数,然后求所有字符次数的平方和作为字符串的价值
 例如: 字符串"abacaba",里面包括4个'a',2个'b',1个'c',于是这个字符串的价值为4 * 4 + 2 * 2 + 1 * 1 = 21
 牛牛有一个字符串s,并且允许你从s中移除最多k个字符,你的目标是让得到的字符串的价值最小。
 输入描述:
 输入包括两行,第一行一个字符串s,字符串s的长度length(1 ≤ length ≤ 50),其中只包含小写字母('a'-'z')。
 第二行包含一个整数k(0 ≤ k ≤ length),即允许移除的字符个数。


 输出描述:
 输出一个整数,表示得到的最小价值

 输入例子1:
 aba
 1

 输出例子1:
 2
 */
public class Code22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.nextLine();
            int n = in.nextInt();
            if(n == str.length()){
                System.out.println(0);
                return;
            }
            Map<Character,Integer> map = new HashMap<>();
            for (int i = 0; i < str.length(); i++){
                map.put(str.charAt(i),(map.get(str.charAt(i)) == null )? 1 : (map.get(str.charAt(i))+1));
            }
            List<KV> kvs  = new LinkedList<>();
            Set<Character> set = map.keySet();
            for (Character character:set){
                KV kv = new KV(character,map.get(character));
                kvs.add(kv);
            }
            //排序
            Collections.sort(kvs);
            for (int i = 0; i < n; i++){
                kvs.get(0).sub();
                Collections.sort(kvs);
            }
            Long sum = 0L;
            for (KV kv : kvs) {
                sum += kv.count * kv.count;
            }
            System.out.println(sum);

        }
    }
}
class KV implements Comparable<KV>{
    char aChar;
    int count;
    public KV(char aChar,int count){
        this.aChar = aChar;
        this.count = count;
    }

    @Override
    public int compareTo(KV kv) {
        if(this.count > kv.count){
            return 1;
        }else if (this.count == kv.count){
            return 0;
        }else {
            return -1;
        }

    }
    public void sub(){
        this.count -= 1;
    }
}
