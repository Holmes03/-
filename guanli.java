package shuzu;

import java.util.Scanner;

public class guanli {

	public static void main(String[] args) {
		int [] num = new int[100];
		String [] name = new String[100];
		int [] score = new int[100];
		int x = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\tѧԱ�ɼ�����");
		System.out.println("--------------------------------------------");
		System.out.println("1.��ӣ� 2.�޸ģ� 3.ɾ���� 4.��ѯ�� 5.����������ͳ�ƣ� 6.�˳�");
		System.out.println("--------------------------------------------");
		do {
			System.out.print("--����ѡ��");
			x = sc.nextInt();
			switch (x) {
			case 1:
				System.out.print("--¼���ţ�");
				int nu = sc.nextInt();
				System.out.print("--¼�����֣�");
				String na = sc.next();
				System.out.print("--¼��ɼ���");
				int sco = sc.nextInt();
				int i = 0;
				while (num[i] != 0)
					i++;
				num[i] = nu;
				name[i] = na;
				score[i] = sco;
				break;
			case 2:
				System.out.print("����Ҫ�޸ĵı�ţ�");
				int rnu = sc.nextInt();
				i = 0;
				while (num[i] != rnu) {
					i++;
				}
				System.out.print("--¼���µĳɼ���");
				int rsc = sc.nextInt();
				score[i] = rsc;
				break;
			case 3:
				System.out.print("--����Ҫɾ���ı�ţ�");
				int dnu = sc.nextInt();
				i = 0;
				while (num[i] != dnu) {
					i++;
				}
				for(int j = i;j<num.length-2;j++) {
					num[j] = num[j+1];
					name[j] = name[j+1];
					score[j] = score[j+1];
					if(num[j] == 0)
						break;
				}
				break;
			case 4:
				int n = 0;
				if(num[0] ==0)
					System.out.println("��ѧԱ��Ϣ��");
				else {
					System.out.println("ѧԱ���\tѧԱ����\tѧԱ�ɼ�");
					while (num[n] !=0) {
					System.out.println(num[n]+"\t"+name[n]+"\t"+score[n]);
					n++;
					}
				}
				break;
			case 5:
				i = 0;
				int sum = 0;
				System.out.println("******������ѧԱ����*****");
				System.out.println("ѧԱ���\tѧԱ����\tѧԱ�ɼ�");
				while (num[i] != 0)
					i++;
				for(int j=0;j<i;j++) {
					if(score[j]<60) {
						System.out.println(num[j]+"\t"+name[j]+"\t"+score[j]);
						sum+=1;
					}
				}
				System.out.println("����������Ϊ"+sum+"��");	
				break;
			case 6:
				sc.close();
			}
		}
		while(x != 6);
	}
}