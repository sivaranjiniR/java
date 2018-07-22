//print the prime number within the range
class Pp
{
public static void main(String args[])
{
int n=8;
int i;
for(i=2;i<=n;i++)
{int  c=0;
for(int j=2;j<=i;j++)
{
if(i%j==0)
c++;
}
if(c==1)
System.out.println(i);
}
  }}
