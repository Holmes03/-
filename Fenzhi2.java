package shuzu;

import java.util.Arrays;

//���η�����ָ�뽻����
public class Fenzhi2 {
	static void sort(int[]a,int left,int right) {
		//��ָ����ڵ�����ָ���򷵻�
		if(left >= right)
			return;
		//����pΪ��׼��
		int p = a[left];
		//��������ָ��
		int l = left;
		int r = right;
		int temp;
		//�ҵ�С�ڻ�׼�����ָ��ʹ��ڻ�׼�����ָ�꣬������ѭ��
		while(l < r) {
			while(a[r] >= p && l < r)
				r --;
			while(a[l] <= p && l < r)
				l ++;
			temp = a[r];
			a[r] = a[l];
			a[l] = temp;
		}
		//������ָ���غϣ����غϵ������׼�㽻��
		//��Ϊһ��ʼ�Ǵ������������غϵ�����С�ڻ�׼��
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
