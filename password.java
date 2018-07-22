public class Password {
public static void main(String args[])
{
 char symbol[]={'@','!','#','%','$','&','*'};
 String name=new String("ranjini");
int n1=0;
 int sum=0;
 long regno=921315104146L;
 
 for(int i=0;i<3;i++)
 {	 
long n=regno%10;
sum=sum+(int)n;
regno=regno/10;
     if(sum>=10)
      {
          n1=sum%10;
          n1+=sum/10;
    }
 
 }
if(n1>0)
 sum=n1;
 
String s=name.substring(0,sum);

char[] ch=s.toCharArray();

	

for(int i=0;i<ch.length-2;i++)
{
	if(!Character.isLowerCase(ch[i]))
	{
		ch[i]=Character.toLowerCase(ch[i]);
	}
	}
ch[sum-1]=Character.toUpperCase(ch[sum-1]);
for(int j=0;j<ch.length;j++)
{
System.out.print(ch[j]);
}
System.out.print(symbol[sum-1]);
System.out.print(sum);
}
}
