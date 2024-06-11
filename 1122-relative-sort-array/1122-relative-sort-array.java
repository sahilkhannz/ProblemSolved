class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            if(map.containsKey(arr1[i])){
                map.put(arr1[i],map.get(arr1[i])+1);
            }
            else{
                map.put(arr1[i],1);
            }
        }
        int k=0;
        int arr[]=new int[arr1.length];
        for(int i=0;i<arr2.length;i++){
            int n=map.get(arr2[i]);
                for(int j=0;j<n;j++){
                    arr[k]=arr2[i];
                    k++;
                }
            
            map.remove(arr2[i]);
        }
        int size=map.size();
       ArrayList<Integer> list=new ArrayList<>();
       
        for( Map.Entry<Integer,Integer> e: map.entrySet()){
                for(int i=0;i<e.getValue();i++){
                    list.add(e.getKey());
                    
                }
        }
        Collections.sort(list);
        int j=0;
        while(k<arr1.length && j<list.size()){
            arr[k]=list.get(j);
            k++;
            j++;
        }
      
        return arr;
        
    }
}