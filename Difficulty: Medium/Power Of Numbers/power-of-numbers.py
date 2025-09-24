class Solution:
    def reverseexponentiation(self, n):
        RevNumber=0
        Number=n
        while n>0:
            rem=n%10
            RevNumber=RevNumber*10+rem
            n//=10
        return Number**RevNumber