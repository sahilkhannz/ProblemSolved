class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++)
            min=Math.min(min,Math.abs(arr[i-1]-arr[i]));
        for(int i=1;i<arr.length;i++){
            if(Math.abs(arr[i-1]-arr[i])==min){
                ans.add(new ArrayList(Arrays.asList(new Integer[]{arr[i-1],arr[i]})));
            }
        }
        
    return ans;
    }
}