class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
      HashMap<Integer, Integer> map = new HashMap<>();
      for(int j : nums1){
        map.put(j,map.getOrDefault(j,0)+1);
      }  
      ArrayList<Integer> result =new ArrayList<>();
      for(int k : nums2){
        if(map.getOrDefault(k,0)>0){
            result.add(k);
            map.put(k,map.getOrDefault(k,0)-1);
        }
      }
      int[] rr = new int[result.size()];
      int idx = 0;
      for(Integer i : result){
        rr[idx] = i;
        idx++;
      }
      return rr;
    }
}