

/*

Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Input: 121
Output: true

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.


Coud you solve it without converting the integer to a string?



*/

import java.util.ArrayList;

public class PalindromeNumber009 {


    public static void main(String[] args){

    }

    public boolean isPalindrome(int x) {

        if(x<0){
            return false;
        }
        if(x>=0 && x<=9){
            return true;
        }
        int temp = x;
        int rev = 0;
        // 这个while循环求reverse值，算得上是很经典了
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            rev = rev * 10 + pop;
        }
        if(rev==temp){
            return true;
        }
        return false;
    }

    // 下面这个不够最优
    public boolean isPalindrome2(int x) {

        if(x<0){
            return false;
        }
        if(x>=0 && x<=9){
            return true;
        }
        ArrayList<Integer> newInt = new ArrayList<>();
        while(x>=10|| x <= -10){
            newInt.add(x%10);
            x = x/10;
        }
        newInt.add(x);
        int listLenght = newInt.size();
        for (int i = 0; i < listLenght/2 ; i++) {
            if(newInt.get(i) != newInt.get(listLenght-1-i)){
                return false;
            }
        }


        return true;
    }

}
