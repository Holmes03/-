package shuzu;

import java.util.Arrays;

//分治法——填坑法
public class Fenzhi {
	static void sort(int[]a,int left,int right) {
		//左指标大于等于右指标则返回
		if(left>=right)
			return;
		//p为基准点，要填的坑，这里取第一个值
		int p=a[left];
		//定义左右指标的值
		int r=right;
		int l=left;
		while(l<r) {
			//移动右指标，小于基准点则赋值给左指标
			while(a[r]>=p && l<r) {
				r--;
			}
			a[l]=a[r];
			//移动左指标，大于基准点则赋值给右指标
			while(a[l]<=p && l<r) {
				l++;
			}
			a[r]=a[l];
		}
		//当左右指标重合，将基准点的值赋给左指标
		a[l]=p;
		//完成第一次分治，递归实现接下来的分治
		sort(a,left,l-1);
		sort(a,l+1,right);
	}
	public static void main(String[] args){
		int [] a= {4,7,6,5,3,2,8,1};
		int left = 0,right = a.length-1;
		sort(a,left,right);
		System.out.println(Arrays.toString(a));
	}
}
