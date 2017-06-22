/**
 * Created by lh
 * on 2017/5/13.
 */
/*风口之下，猪都能飞。当今中国股市牛市，真可谓“错过等七年”。
给你一个回顾历史的机会，已知一支股票连续n天的价格走势，
以长度为n的整数数组表示，数组中第i个元素（prices[i]）
代表该股票第i天的股价。 假设你一开始没有股票，但有至多
两次买入1股而后卖出1股的机会，并且买入前一定要先保证手
上没有股票。若两次交易机会都放弃，收益为0。 设计算法，
计算你能获得的最大收益。 输入数值范围：
2<=n<=100,0<=prices[i]<=100
输入例子:
3,8,5,1,7,8

输出例子:
12
* */
public class Code3 {
    public static void main(String[] args) {
        int[] x = {1, 10, 2, 12};
        System.out.print(calculateMax(x));
    }

    public static int calculateMax(int[] prices) {
        int max = 0;
        int temp;
        for (int i = 0; i < prices.length; i++)
            if ((temp = maxTemp(prices, i)) > max)
                max = temp;
        return max;
    }

    public static int maxTemp(int[] temp, int leftEnd) {
        int maxLeft = 0;
        int maxRight = 0;
        for (int i = 0; i < leftEnd; i++)
            for (int j = i; j < leftEnd; j++)
                if ((temp[j] - temp[i]) > maxLeft)
                    maxLeft = temp[j] - temp[i];
        for (int i = leftEnd; i < temp.length; i++)
            for (int j = i; j < temp.length; j++)
                if ((temp[j] - temp[i]) > maxRight)
                    maxRight = temp[j] - temp[i];
        if (maxLeft < 0 && maxRight < 0)
            return 0;
        else if (maxLeft >= 0 && maxRight >= 0)
            return maxLeft + maxRight;
        else if (maxLeft > maxRight)
            return maxLeft;
        else
            return maxRight;
    }
}
