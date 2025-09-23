class Solution:
    def checkStatus(self, a, b, flag):
        # code here
        if((a>=0) ^ (b>=0) and not flag):
            return True
        elif(a<0 and b<0 and flag):
            return True
        else:
            return False