//{ Driver Code Starts
import java.util.Scanner;

class SquartRoot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            long a = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.floorSqrt(a));
            t--;
        }
    }
}
// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution {
    long floorSqrt(long n) {
        // Your code here
        long end=n;
        end=reduce(n,end);
        while(end*end<=n){
            if(end*end==n){
                return end;
            }
            end++;
            if(end*end>n){
                return (end-1);
            }
        }
        return 0;
    }
    
    long reduce(long n,long end){
        if(end*end>n){
            end/=2;
            return reduce(n,end);
        }
        else{
            return end;
        }
    }
}
