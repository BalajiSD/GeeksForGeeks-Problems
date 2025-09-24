#User function Template for python3

class Solution:
	def reverseDigits(self, n):
		RevNumber=0
		while(n>0):
		    Rem=n%10
		    RevNumber=RevNumber*10+Rem
		    n//=10
		return RevNumber