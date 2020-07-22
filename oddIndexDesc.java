import java.util.*;
public class oddIndexDesc{
	public static void main(String args[]){
		int a[]={13,2,4,15,12,10,5};
		int odd[]=new int[10];
		int even[]=new int[10];
		int k=0,m=0,temp=0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				odd[k++]=a[i];
			}
			else
			{
				even[m++]=a[i];
			}
		}
		for(int i=0;i<k;i++)
		{
			for(int j=i+1;j<k;j++)
			{
				if(odd[i]<odd[i])
				{
					temp=odd[i];
					odd[i]=odd[j];
					odd[j]=temp;
				}
			}
		}
		k=0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				a[k++]=odd[i];
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
		
		