package org.example.leetCode75Exercises.findTheHighestAltitude;

public class Main {
    //There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes.
    // The biker starts his trip on point 0 with altitude equal 0.

    //Unclear description but a quite simple question. Let me translate!
    //gain[i]=altitude[i+1]-altitude[i]
    //Find max({altitude[i]})
    public static void main(String[] args) {

        int[] arr = {-5,1,5,0,-7};
        int i = largestAltitude(arr);
    }
    public static int largestAltitude(int[] gain) {
        int max=0;
        int temp=0;

        for(int i=0;i<gain.length;i++){
            temp+=gain[i];
            max=Math.max(max,temp);
        }
        return max;
    }
}
