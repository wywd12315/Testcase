package Stack;

public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ret= new int[nums1.length];
        int k=-1;
        int t=-1;
        for(int i=0;i<nums1.length;i++) {
        	for(int j=0;j<nums2.length;j++) {
        		if(nums2[j]==nums1[i]) {k=j;
        		for(t=k; t<nums2.length;t++) {
        			if(nums2[t]>nums1[i]) {ret[i]=nums2[t]; break;}
        			}
        		if(t==nums2.length) {ret[i]=-1;}
        		}
        	}
        }
        return ret;
    }
}
