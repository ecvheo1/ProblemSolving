package PROGRAMMERS;

public class 도둑질 {
    public int solution(int[] money) {
        int length = money.length;

        int[] dp1 = new int[length - 1];
        int[] dp2 = new int[length];

        dp1[0] = money[0];
        dp1[1] = money[0];

        dp2[0] = 0;
        dp2[1] = money[1];

        for(int i = 2; i < length - 1; i++)
            dp1[i] = Math.max(dp1[i-2] + money[i], dp1[i-1]);

        for(int i = 2; i < length; i++)
            dp2[i] = Math.max(dp2[i-2] + money[i], dp2[i-1]);

        return Math.max(dp1[length-2], dp2[length-1]);
    }
}
