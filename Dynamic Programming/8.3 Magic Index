/**
 * A magic line in an array A[0...n-1] is defined to be an index such that A[i] = i. Given a sorted
 * array of distinct integers, write a method to find a magic index, if one exists, in array A.
 * FOLLOW UP:
 * What if the values are not distinct.
 */

// use binary search
import java.util.*;

public class magicIndex{
    
    public int findMagicIndex(int[] arr){
        return findMagicIndex(arr,0,arr.length-1);
    }

    public int findMagicIndex(int[] arr, int start, int end){
        if(end < start) return -1;
        int midIndex = (start+end)/2;

        if(arr[midIndex] < midIndex) return findMagicIndex(arr, midIndex+1, end);
        else if(arr[midIndex] > midIndex) return findMagicIndex(arr, start, midIndex-1); 
        else  return midIndex;
           
        
    }

    public static void main(String[] args) {
        magicIndex m = new magicIndex();
        int[] arr = new int[]{-40,-20,-1,1,2,3,5,8,9,12,13};
        System.out.println(m.findMagicIndex(arr));
    }


}
