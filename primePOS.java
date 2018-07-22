//PRINT THE PRIME NUM AT THE GIVEN POSITION
class Pp
{

public static void main(String args[])
{
int count=0;
int n=15;
int i;
int pos=5;
for(i=2;i<=n;i++)
{int  c=0;
for(int j=2;j<=i;j++)
{
if(i%j==0)
c++;
}
if(c==1)
{
count++;
if(count==pos)
System.out.println(i);
}
}
  }}
