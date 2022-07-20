class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0; i< nums.length; i++){
            set.add(nums[i]);
        }
        int k = set.size();
        List<Integer> list = new ArrayList<Integer>(set);
        Collections.sort(list);
        for(int i=0; i< k ; i++){
            nums[i] = list.get(i); 
        }
        return k;
    }
}