class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans=0;
        int merge[]=new int[nums1.length + nums2.length];
        int c=0;
        for(int i=0;i<nums1.length;i++){
            merge[c++]=nums1[i];

        }
        for(int i=0;i<nums2.length;i++){
            merge[c++]=nums2[i];
        }
        Arrays.sort(merge);
        if(merge.length %2!=0){
            ans=(double)merge[merge.length/2];
        return ans;
        }
        if(merge.length %2==0){
            int len=merge.length/2;
            ans=((double)(merge[len]+merge[len-1])/2);
        }
        return ans;
    }
}