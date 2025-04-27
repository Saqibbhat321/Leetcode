
class Solution {
    public boolean containsDuplicate(int[] nums) {

            //Time complexity O(n)
        //🔥 How It Works:
        //If the number is not in the HashSet ➔ Add it.
//        If the number already exists in the HashSet ➔ Duplicate found ➔ Return true immediately.


        Set<Integer> store = new HashSet<>();
        for(int num :nums)
        {
            if(store.contains(num)){
                return true;
            }
        store.add(num);
        }
        return false;

        //Time Complexity O(n^2) Brute Force

    //     for(int i=0;i<nums.length;i++)
    //     {
    //         for(int j=0;j<i;j++)
    //         {
    //             if(nums[i]==nums[j])
    //             {

    //             return true;
    //             }
            
    //         }
        
    // }
        // return false;
}
}
