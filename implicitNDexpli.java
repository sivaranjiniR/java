class Sample 
{
public static void main(String srgs[])
{//wide
//implicit
 byte b=123;
int i=b;
System.out.println(i);//123
//explicit
float t=34.5f;
double d=(double)t;
System.out.println(d);//34.5
//narrow
//explicit
double dd=43.87;
float f=(float)dd;
System.out.println(f);//43.87
//implicit
int bb=64;
byte a;
a=bb;
System.out.println(a);//error
}
}
