//sum of all digits in given num(+ve and -ve)

public class Sample {
public static void main(String args[])
{
int n=-18978;
int len=String.valueOf(n).length();
int sum;
do{
	sum=0;
for(int i=0;i<len;i++)
{
	int num=n%10;
	sum=sum+num;
	n=n/10;
}
len=String.valueOf(sum).length();
n=sum;
}while(sum>9 || sum<-9);
System.out.println(n);
}
}
