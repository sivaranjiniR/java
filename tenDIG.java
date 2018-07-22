/*
GET 10DIG NUM IF NUM BEGIN WITH EVEN ADD THE SUBSEQUENT NEMBERS UNTILL THE VALUE BECOME ODD and vice versa
THE TAKE NEXT NUM CHECK ODD OR EVEN AND ADD UNTILL EVEN IF BEGIN WITH ODD AND viceversa*/


public class Tendigit  
	{
	public static void main(String args[])
	{
	long num=7506144789L;
	String s=Long.toString(num);
	int p[]=new int[15];
	int i,k;

	for(i=0;i<s.length();i++)
	{
	p[i]=Integer.parseInt(Character.toString(s.charAt(i)));}


	for(i=0;i<10;i++)
	{
	if(p[i]%2==0)
	{
	int sum=p[i];
	
	for(k=i+1;k<10;k++)
	{

		sum=sum+p[k];


	   if(sum%2==1)
	     {
	System.out.println(sum);
	break;}
	   if(k==9)
	   {
	 	  System.out.println(sum);
	   }
	  
	   
	}
  
	i=k;
	//System.out.println(p[i]);
	}
	else if(p[i]%2==1)
	{
	int sum=p[i];
	for(k=i+1;k<10;k++)
	{
	sum=sum+p[k];


	   if(sum%2==0)
	     {
	System.out.println(sum);
	break;}
	   if(k==9)
	   {
	 	  System.out.println(sum);
	   }
	 
	}

	i=k;
	//System.out.println(p[i]);
	}

	else{
	System.out.println(p[i]);}
	}
	}}


