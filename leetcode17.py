from typing import List,Tuple
class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        mapping_dict = {"2":("a","b","c"),"3":("d","e","f"),"4":("g","h","i"),"5":("j","k","l"),"6":("m","n","o"),"7":{"p","q","r","s"},"8":("t","u","v"),"9":("w","x","y","z")}
        list_of_strings = []
        for digit in digits:
            list_of_strings.append(mapping_dict[digit])
        if len(digits) == 0:
            return ""
        elif len(digits) == 1:
            return list(mapping_dict[digits])
        else:
            list_of_strings = list(mapping_dict[digits[0]])
            for i in range(len(digits)-1):
                list_of_strings = self.get_combs(list_of_strings,list(mapping_dict[digits[i+1]]))
            return list_of_strings

        


    def get_combs(self,list1: List, list2: List):
        list_of_combs =[]
        for string1 in list1:
            for string2 in list2:
               comb_str = string1 + string2
               list_of_combs.append(comb_str)
        return list_of_combs


        
sol = Solution()
print(sol.letterCombinations("23"))