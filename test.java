package shuzu;

import java.util.Random;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
	int i;
	String []a = {"~","@","#","$","%","^","&","*","A","B"};
	String []b = new String[100];
	for (i=0;i<100;i++) {
		b[i] = a[(int)(Math.random()*10)];
		if (i%9 == 0)
			b[i] = "*";
	}
	for (int x=0;x<100;x++) {
		System.out.print(x+" "+b[x]+"\t");
		if ((x+1)%10 == 0)
			System.out.println();
	}
	System.out.println("��������һ�����֣������������-����λ+ʮλ���������Ӧ�ķ��ţ����磺77-��7+7��=63");
	System.out.println("�鲻���أ����Ժ򡭡�");
	System.out.print("�Ƿ���ʾ�����yes/no��:");
	Scanner sc  = new Scanner(System.in);
	String result = sc.next();
	if (result.equals("yes"));
	System.out.println("������������ǲ���'*'����");
	}
}
