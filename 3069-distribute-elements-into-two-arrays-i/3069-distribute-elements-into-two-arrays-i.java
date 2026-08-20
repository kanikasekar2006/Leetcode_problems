class Solution {
    public int[] resultArray(int[] nums) {

        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        arr1.add(nums[0]);
        arr2.add(nums[1]);

        for(int i = 2; i < nums.length; i++) {

            int n1 = arr1.size();
            int n2 = arr2.size();

            if(arr1.get(n1 - 1) > arr2.get(n2 - 1)) {
                arr1.add(nums[i]);
            }
            else {
                arr2.add(nums[i]);
            }
        }

        arr1.addAll(arr2);

        int[] result = new int[arr1.size()];

        for(int i = 0; i < result.length; i++) {
            result[i] = arr1.get(i);
        }

        return result;
    }
}