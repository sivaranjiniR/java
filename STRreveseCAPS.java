//REVERSE the string and make first letter CAPS
public class Revcaps {
public static void main(String args[])
{
 String s=new String("Wipro Technologies");
 String[] ar=s.split(" ");
 StringBuilder d=new StringBuilder(ar[0]);
 StringBuilder d1=new StringBuilder(ar[1]);
String s1=d.reverse().toString();
String s2=d1.reverse().toString();
char[] a=s1.toCharArray();
char[] b=s2.toCharArray();
a[0]=Character.toUpperCase(a[0]);
a[a.length-1]=Character.toLowerCase(a[a.length-1]);
b[0]=Character.toUpperCase(b[0]);
b[b.length-1]=Character.toLowerCase(b[b.length-1]);
String r1=String.valueOf(a);
String r2=String.valueOf(b);
System.out.println(r1+" "+r2);

}}

