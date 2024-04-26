class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        Set<Integer> set=new HashSet<>();
        for(int i: candyType)
            set.add(i);
        if(set.size()>(n/2))
            return n/2;
        return set.size();
        
    }
}