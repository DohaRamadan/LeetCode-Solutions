class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i< nums.length; i++){
            set.add(nums[i]);
        }
        int k = set.size();
        int dup = nums.length - k, count=0;

        int i =0;
        while(i < nums.length){
            int curr = nums[i];
            int index = i;
            if(count == dup)
                break;
            if(map.containsKey(curr)){
                for(int j=index; j< nums.length - 1; j++){
                    nums[j] = nums[j+1];
                }
                nums[nums.length - 1] = curr;
                count++;
            }else{
                map.put(nums[i], 1);
                i++;
            }
        }
        return k;
    }
}