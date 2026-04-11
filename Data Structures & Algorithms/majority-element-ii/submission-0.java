class Solution {
    public List<Integer> majorityElement(int[] n) {
        
        int candidate1=0;
        int candidate2=0;
        int count1=0;
        int count2=0;

        int size=n.length;
        List<Integer>list=new ArrayList <> ();
        for(int i=0;i<n.length;i++)
        {
            if(n[i]==candidate1)
            {
                count1++;
            }
            else if(n[i]==candidate2)
            {
                count2++;
            }
            else if(count1==0)
            {
                candidate1=n[i];
                count1=1;
            }
            else if(count2==0)
            {
                candidate2=n[i];
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;

        for(int value:n)
        {
            if(value==candidate1)
            {
                count1++;
            }
            else if(value==candidate2)
            {
                count2++;
            }
        }

        if(count1>size/3)
        {
            list.add(candidate1);
        }
        if(count2 >size/3)
        {
            list.add(candidate2);
        }
        return list;
    }
}