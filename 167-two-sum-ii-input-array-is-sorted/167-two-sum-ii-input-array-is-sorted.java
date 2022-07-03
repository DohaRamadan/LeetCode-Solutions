class Solution {
     public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> differences = new HashMap<>();
        int result[] = new int[2];
        for(int i=0; i < numbers.length; i++){
            if(differences.containsKey(numbers[i])){
                result[0] = differences.get(numbers[i]);
                result[1] = i+1;
                break;
            }else{
                int diff = target - numbers[i];
                differences.put(diff, i+1);
            }
        }
        return result;
    }
}