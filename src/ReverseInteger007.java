import java.util.ArrayList;

/*
Given a 32-bit signed integer, reverse digits of an integer.
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range:
[−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0
when the reversed integer overflows.

Input: 123
Output: 321

Input: -123
Output: -321

Input: 120
Output: 21

 */
public class ReverseInteger007 {



    public static void main(String[] args){

//        System.out.println(reverse(1230011));
//        System.out.println(reverse(-123));
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x){


        if((x<10 && x>=0)|| (x >-10 && x<=0)){
            return x;
        }
        ArrayList<Integer> newInt = new ArrayList<>();
        while(x>=10|| x <= -10){
            newInt.add(x%10);
            x = x/10;
        }
        newInt.add(x);
        double temp = 0;
        for (int i = 0  ; i < newInt.size() ; i++) {
            temp = temp + newInt.get(i)*Math.pow(10,newInt.size()-1-i);
        }
        if(temp>Math.pow(2,31)-1 || temp<-Math.pow(2,31)){
            return 0;
        }


        return (int)temp;

    }

    public int reverseOfLeetCode(int x) {
        int rev = 0;
        while (x != 0) {
            // 先求余，再取整
            int pop = x % 10;
            x /= 10;
            // 第二个是处理如果是相等的情况下，要考虑最后一位的值是否超过
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;

            // 这一点我没有想到，非常棒
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
