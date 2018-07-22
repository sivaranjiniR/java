//find first prime number(i.e,2) in the given number(i.e,12345) and add the next even number(i.e,4) 
//with that prime number(ans:2+4=6) 

class Prime
{
static int d;
public static void main(String args[])
{
int n=123456;
int p[]=new int[10];
String s=Integer.toString(n);
int i;
for(i=0;i<s.length();i++)
{
int c=0;
d=Integer.parseInt(Character.toString(s.charAt(i)));
for(int j=2;j<=d;j++)
{
if(d%j==0)
{
c++;
}
}
if(c==1)
{
System.out.println("this is prime"+d);
break;
}
}
//System.out.println(d);
int r,rr,rs,ss;
for(r=i+1;r<=s.length();r++)
{
 rr=Integer.parseInt(Character.toString(s.charAt(r)));
 rs=rr%2;
if(rs==0)
{
 ss=d+rr;
System.out.println(ss);
break;
}
}
}}
