package ��������;

import java.util.Scanner;
public class sizeyunsuan
{
	static void main(String[] args) 
	{
		// TODO �Զ����ɵķ������
		Scanner input=new Scanner(System.in);
		//����һ�����ַ���
		int a[]=new int[60];
		int b[]=new int[60];
		String c[]=new String[60];
		for(int i=0;i<60;i++)
		{
				//����һ��1��10000��int�͵�����
			int first=(int) (Math.random()*100);
			a[i]=first;
			//����һ��1��10000��int�͵�����
			int second=(int) (Math.random()*100);
			b[i]=second;
			//����һ��1��10000��int�͵�����
			int result=(int)(Math.random()*100);
			result=result%4;
			if(result==0)
			{
				c[i]="+";
			}
			else if(result==1)
			{
				c[i]="-";
			}
			else if(result==2)
			{
				c[i]="*";
			}
			else 
			{
				c[i]="/";
			}
		}
		for(int i=0;i<60;i++)
		{
			System.out.println(a[i]+c[i]+b[i]+"=");
		}
	}

}
