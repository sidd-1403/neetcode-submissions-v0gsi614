class Solution {
    public boolean hasDuplicate(int[] n) {
     HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n.length; i++) {

            if (map.containsKey(n[i])) {
                map.put(n[i], map.get(n[i]) + 1);
            } else {
                map.put(n[i], 1);
            }
        }
        for(int value:map.values())
        {
            if(value>=2)
            {
                return true;
            }
        }
        return false;    
    }
}