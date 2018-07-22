class Num
{
public static void main(String args[])
{
//NUMBER 1
int n=789,max=0,min=0;
int p[]=new int[10];
String s=Integer.toString(n);
int i;
for(i=0;i<3;i++)
{
p[i]=Integer.parseInt(Character.toString(s.charAt(i)));
if((p[0]>p[1])&&(p[0]>p[2]))
max=p[0];
else if(p[1]>p[2])
max=p[1];
else
max=p[2];

if((p[0]<p[1])&&(p[0]<p[2]))
min=p[0];
else if(p[1]<p[2])
min=p[1];
else
min=p[2];

}
System.out.println(max);
System.out.println(min);

//NUMBER2

int n1=342,max1=0,min1=0;
int p1[]=new int[10];
String s1=Integer.toString(n1);
for(i=0;i<3;i++)
{
p1[i]=Integer.parseInt(Character.toString(s1.charAt(i)));
if((p1[0]>p1[1])&&(p1[0]>p1[2]))
max1=p1[0];
else if(p1[1]>p1[2])
max1=p1[1];
else
max1=p1[2];

if((p1[0]<p1[1])&&(p1[0]<p1[2]))
min1=p1[0];
else if(p1[1]<p1[2])
min1=p1[1];
else
min1=p1[2];

}
System.out.println(max1);
System.out.println(min1);

//NUMBER3

int n2=208,max2=0,min2=0;
int p2[]=new int[10];
String s2=Integer.toString(n2);
for(i=0;i<3;i++)
{
p2[i]=Integer.parseInt(Character.toString(s2.charAt(i)));
if((p2[0]>p2[1])&&(p2[0]>p2[2]))
max2=p2[0];
else if(p2[1]>p2[2])
max2=p2[1];
else
max2=p2[2];

if((p2[0]<p2[1])&&(p2[0]<p2[2]))
min2=p2[0];
else if(p2[1]<p2[2])
min2=p2[1];
else
min2=p2[2];

}
System.out.println(max2);
System.out.println(min2);
//FACT N1
int fact=1;
for(i=1;i<=max;i++)
{
fact=fact*i;}
System.out.println("fact of n1 max "+fact);

//FACT N2
int fact1=1;
for(i=1;i<=max1;i++)
{
fact1=fact1*i;}
System.out.println("fact of n2 max "+fact1);

//FACT N3
int fact2=1;
for(i=1;i<=max2;i++)
{
fact2=fact2*i;}
System.out.println("fact of n3 max "+fact2);

//ADDING N1 FACT WITH N1 MIN

int add=fact+min;
int add1=fact1+min1;
int add2=fact2+min2;

System.out.println("ADDING N1 FACT WITH N1 MIN "+add);
System.out.println("ADDING N2 FACT WITH N2 MIN "+add1);
System.out.println("ADDING N3 FACT WITH N3 MIN "+add2);

//LARGEST AMONG ALL

if((add>add1)&&(add>add2))
System.out.println("largest num is "+add);
else if(add1>add2)
System.out.println("largest num is "+add1);
else
System.out.println("largest num is "+add2);

}
}
