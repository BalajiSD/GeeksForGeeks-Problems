#User function Template for python3

class Solution:
    def evenlyDivides(self, n):
        div=n
        count=0
        while(div>0):
            rem=div%10
            if rem!=0 and n%rem==0:
                count+=1
            div//=10
        return count