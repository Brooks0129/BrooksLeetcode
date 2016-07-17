package com.brooks;
/**
 * @author: 李松达
 * @date: 2016/7/17.
 */
public class LC_Problem_374{
    /* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */
    public int guessNumber(int n){
        int i=1;
        int j=n;
        while(i<=j){
            int mid=i+(j-i)/2;
            switch(guess(mid)){
                case 1:
                    i=mid+1;
                    break;
                case -1:
                    j=mid-1;
                    break;
                default:
                    return mid;
            }
        }
        return i;
    }
    private int guess(int mid){
        return 0;
    }
}
