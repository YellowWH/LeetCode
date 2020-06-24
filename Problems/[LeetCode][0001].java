class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        int[] res=new int[2];
        for (int i = 0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                res[0]=i;
                res[1]=map.get(target-nums[i]);
                break;
            }
            map.put(nums[i],i);
        }
        return res;
    }
}

原本是两个for循环，合成为一个
