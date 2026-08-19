class Solution {
    void Qsort(int[] num){
        for(int i=0;i<num.length;i++){
            int j=i;
            for(int k=i+1;k<num.length;k++){
                if(num[k]<num[j]){
                    j=k;
                }
            }int temp=num[i];
            num[i]=num[j];
            num[j]=temp;
        }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1.length==m+n&&nums2.length==n&&m>=0&&n<=200&&m+n>=1&&m+n<=200){
        int j=0;
        for(int i=m;i<nums1.length;i++){
            nums1[i]=nums2[j++];
        }
        Qsort(nums1);
        }
    }
}