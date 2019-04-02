package shuzu;

import java.util.Arrays;

public class compare {

	public static void main(String[] args) {
		/*int[] a = {1,2,3};
		int[] b = {1,2,3};
		System.out.println(Arrays.equals(a, b));*/
		int [] a = {12,1,657,3,88};
		int x;
		for (int i=0;i<a.length;i++)
		{
			for(int j=1+i;j<a.length;j++)
				if(a[i]>a[j])
				{
					x = a[i];
					a[i] = a[j];
					a[j] = x;
				}
		System.out.println(a[i]);
		}
	}

}
