package shuzu;

import java.util.Arrays;

public class MergeSort {
	
	public static void chai(int[]arr,int first,int last,int[] newarr) {
		if(first < last) {
			int mid = (first+last)/2;
			chai(arr, first, mid, newarr);
			chai(arr, mid+1, last, newarr);
			merge(arr, first, mid, last, newarr);
		}
	}
	public static void merge(int[] arr,int first,int mid,int last,int[] newarr) {
		//两个数据集的始终下标和新数组起始下标
		int m=first,x=mid,n=mid+1,y=last,index=0;
		while(m<=x && n<=y) {
			if(arr[m]<=arr[n]) {
				newarr[index++]=arr[m++];
			}else {
				newarr[index++]=arr[n++];
			}
		}
		while(m<=x) {
			newarr[index++]=arr[m++];
		}
		while(n<=y) {
			newarr[index++]=arr[n++];
		}
		for(int i=0;i<index;i++) {
			arr[first+i]=newarr[i];
		}
	}
	public static void main(String[]args) {
		int[] arr= {2,3,1,2,4,2,3,1};
		int[] newarr=new int[arr.length];
		chai(arr, 0, arr.length-1, newarr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newarr));
	}
}
