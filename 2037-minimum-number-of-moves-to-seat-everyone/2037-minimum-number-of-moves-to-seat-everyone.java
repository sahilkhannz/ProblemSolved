class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int n=seats.length,ans=0;
        
        for(int i=0;i<n;i++){
            int max=Math.max(students[i],seats[i]);
            int min=Math.min(students[i],seats[i]);
            ans+=max-min;
        }
        return ans;
    }
}