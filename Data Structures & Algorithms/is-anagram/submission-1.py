class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False
        else:
            D={}
            J={}
            for i in s:
                if i in D:
                    D[i]+=1
                else:
                    D[i]=1
            for i in t:
                if i not in D:
                    return False
                if i in J:
                    J[i]+=1
                else:
                    J[i]=1    
        for i in D:
            if D[i]!=J[i]:
                return False
        return True 