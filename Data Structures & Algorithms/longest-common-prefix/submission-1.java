class Solution {
    public String longestCommonPrefix(String[] strs) {
     
     for(int i=0;i<strs[0].length();i++)
     {
        for(int j=1;j<strs.length;j++)
        { 
            //check for outofbound exception or mismatch character 
            if(i>=strs[j].length() || strs[0].charAt(i)!=strs[j].charAt(i))
            {
              return strs[0].substring(0,i);
            }
        }
     }
     return strs[0];
    }
}