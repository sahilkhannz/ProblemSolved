class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boat=0,n=people.length;
        int l=0,r=n-1;
        Arrays.sort(people);
        while(l<=r){
            if(people[l]+people[r]<=limit){
                l++;
            }
            r--;
            boat++;
        }
     return boat;   
    }
}