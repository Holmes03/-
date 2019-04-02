package shuzu;

import java.util.Arrays;

//���η�������ӷ�
public class Fenzhi {
	static void sort(int[]a,int left,int right) {
		//��ָ����ڵ�����ָ���򷵻�
		if(left>=right)
			return;
		//pΪ��׼�㣬Ҫ��Ŀӣ�����ȡ��һ��ֵ
		int p=a[left];
		//��������ָ���ֵ
		int r=right;
		int l=left;
		while(l<r) {
			//�ƶ���ָ�꣬С�ڻ�׼����ֵ����ָ��
			while(a[r]>=p && l<r) {
				r--;
			}
			a[l]=a[r];
			//�ƶ���ָ�꣬���ڻ�׼����ֵ����ָ��
			while(a[l]<=p && l<r) {
				l++;
			}
			a[r]=a[l];
		}
		//������ָ���غϣ�����׼���ֵ������ָ��
		a[l]=p;
		//��ɵ�һ�η��Σ��ݹ�ʵ�ֽ������ķ���
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
