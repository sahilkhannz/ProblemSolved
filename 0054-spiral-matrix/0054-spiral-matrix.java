class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List <Integer>ans=new ArrayList<>();
        int minr=0,maxr=matrix.length-1,minc=0,maxc=matrix[0].length-1;
        while(minr<=maxr && minc<=maxc){
        //top wall
        for(int i=minc;i<=maxc;i++)
            ans.add(matrix[minr][i]);
        minr++;
        //right wall
        for(int i=minr;i<=maxr;i++)
            ans.add(matrix[i][maxc]);
        maxc--;
        //bottom wall
        if(minr<=maxr){
        for(int i=maxc;i>=minc;i--)
            ans.add(matrix[maxr][i]);
        maxr--;
        }
        //left wall
        if(minc<=maxc){
        for(int i=maxr;i>=minr;i--)
            ans.add(matrix[i][minc]);
        minc++;
        }
                    
        }
    return ans;
    }
}