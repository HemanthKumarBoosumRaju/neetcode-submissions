class Solution {
    public int longestConsecutive(int[] nums) {
        
        
Set<Integer> sortedset = new TreeSet<>();

    for (int num : nums) {
        sortedset.add(num);
    }       
    List<Integer> list = new ArrayList<>(sortedset);
int n=list.size();
        if(n==0) return 0;
         int max=1;
        int count=1;
        for(int i=0;i<n-1;i++){
            if(list.get(i+1)-list.get(i)==1){
                count++;
            }
            else{
                max=Math.max(max,count);
                count=1;
            }
        }
        return Math.max(max,count);
    }
}
