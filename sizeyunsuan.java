package 四则运算;

import java.util.Scanner;
public class sizeyunsuan
{
	static void main(String[] args) 
	{
		// TODO 自动生成的方法存根
		Scanner input=new Scanner(System.in);
		//定义一个空字符串
		int a[]=new int[60];
		int b[]=new int[60];
		String c[]=new String[60];
		for(int i=0;i<60;i++)
		{
				//生成一个1～10000的int型的整数
			int first=(int) (Math.random()*100);
			a[i]=first;
			//生成一个1～10000的int型的整数
			int second=(int) (Math.random()*100);
			b[i]=second;
			//生成一个1～10000的int型的整数
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
