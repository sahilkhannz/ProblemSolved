//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    static ArrayList <String>ans;
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ans=new ArrayList<>();
        if(m[0][0]==0)return ans;
        boolean visited[][] = new boolean[n][n];
        visited[0][0] = true;
        helper(m,n,0,0,"",visited);
        return ans;
    }
    public static void helper(int[][]m,int n,int row,int col,String s,boolean[][] visited){
        if(row==n-1 && col==n-1){
            ans.add(s);
            return;
        }
        //top cell
        if(isSafe(m,visited,row-1,col,n)){
           visited[row][col]=true;
           helper(m,n,row-1,col,s+"U",visited);
           visited[row][col]=false;
        }
        //left cell
        if(isSafe(m,visited,row,col-1,n)){
           visited[row][col]=true;
           helper(m,n,row,col-1,s+"L",visited);
           visited[row][col]=false;
        }
        //right cell
        if(isSafe(m,visited,row,col+1,n)){
           visited[row][col]=true;
           helper(m,n,row,col+1,s+"R",visited);
           visited[row][col]=false;
        }
        //lower cell
        if(isSafe(m,visited,row+1,col,n)){
           visited[row][col]=true;
           helper(m,n,row+1,col,s+"D",visited);
           visited[row][col]=false;
        }
        
    
        }
        public static boolean isSafe(int [][]m,boolean[][] visited,int row,int col,int n){
            //
            if(col<0 || col>=n || row<0 || row>=n || visited[row][col] || m[row][col]==0 )return false;
            return true;
        }
    }