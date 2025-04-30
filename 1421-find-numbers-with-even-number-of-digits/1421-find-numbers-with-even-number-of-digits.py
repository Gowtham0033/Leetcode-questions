class Solution:
    def iseven(self, x):
        len = math.floor(math.log10(abs(x))) + 1
        return len%2==0
    def findNumbers(self, nums: List[int]) -> int:
        cnt=0
        for x in nums:
            if(self.iseven(x)):
             cnt+=1
        return cnt
        