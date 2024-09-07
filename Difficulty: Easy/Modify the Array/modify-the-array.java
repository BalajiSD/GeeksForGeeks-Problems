//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            ArrayList<Integer> v = new ArrayList<Integer>();
            int[] arr = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr[idx++] = i;

            v = new Solution().modifyAndRearrangeArr(arr);

            for (int i = 0; i < v.size(); i++) System.out.print(v.get(i) + " ");

            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
        // Complete the function
        ArrayList<Integer> arr1=new ArrayList<>();
        moveZero(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                arr[i-1]=2*arr[i-1];
                arr[i]=0;
            }
        }
        moveZero(arr);
        for(int i=0;i<arr.length;i++){
            arr1.add(arr[i]);
        }
        return arr1;
    }
    
    static int[] moveZero(int[] arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
               arr[j++]=arr[i]; 
            }
            if(i==arr.length-1){
                for(i=j;i<arr.length;i++){
                    arr[j++]=0;
                }
            }
        }
        return arr;
    }
}
