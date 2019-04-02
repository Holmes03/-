package shuzu;

public class paixu {

	public static void main(String[] args) {
		int [] a = {12,1,657,3,88};
		int x;
		for (int j=1;j<a.length - 1;j++) {
			for (int i=0;i<a.length - j;i++) {
				if (a[i]<a[i+1]){
					x = a[i];
					a[i] = a[i+1];
					a[i+1] = x;
				}
			}
		}
		for(int px : a) {
			System.out.println(px);
		}
	}
}
