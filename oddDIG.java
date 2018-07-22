class Odd
{
public static void main(String args[])
{
int sum=0,t,n=1234567;
while(n!=0)
{
t=n%10;
if((t%2)!=0)
{
sum=sum+t;
}
n=n/10;}
System.out.println(sum);
}}
