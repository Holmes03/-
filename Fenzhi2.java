package shuzu;

import java.util.Arrays;

//分治法——指针交换法
public class Fenzhi2 {
	static void sort(int[]a,int left,int right) {
		//左指标大于等于右指标则返回
		if(left >= right)
			return;
		//设置p为基准点
		int p = a[left];
		//设置左右指标
		int l = left;
		int r = right;
		int temp;
		//找到小于基准点的右指标和大于基准点的左指标，交换，循环
		while(l < r) {
			while(a[r] >= p && l < r)
				r --;
			while(a[l] <= p && l < r)
				l ++;
			temp = a[r];
			a[r] = a[l];
			a[l] = temp;
		}
		//当左右指标重合，将重合的数与基准点交换
		//因为一开始是从右向左，所以重合的数会小于基准点
		temp = a[r];
		a[r] = p;
		p = temp;
		sort(a,left,r-1);
		sort(a,r+1,right);
	}
	public static void main(String[] args) {
		int [] a= {4,7,6,5,3,2,8,1};
		int left = 0,right = a.length-1;
		sort(a,left,right);
		System.out.println(Arrays.toString(a));
	}
}
