class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len=0;
        if(nums1.length>nums2.length){
            len=nums1.length;
        }
        else
        len= nums1.length;
        if(len== nums1.length){
            for(int i=0;i<nums2.length;i++){
                for(int j=0;j<len;j++){
                    if(nums1[j]==0){
                        nums1[j]=nums2[i];
                        break;
                    }
                }
            }
        }
        Arrays.sort(nums1);
        
    }
}