class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int []a=new int[n];
        //every children getting atleast one candy
        Arrays.fill(a,1);
        // forward pass
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1])
                a[i]=a[i-1]+1;
        }
        //backward pass
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1])
                a[i]=Math.max(a[i],a[i+1]+1);
        }
        int sum=0;
        for(int i: a)
            sum+=i;
        return sum;
    }
}