class Stu1
{
public static void disp1()
{
System.out.println("hi");
}
public void disp()
{System.out.println("hw r U");}
}

class Stu2 extends Stu1
{
public void disp2()
{System.out.println("Hello");
disp1();//nonstatic to static USING EXTEND
disp();//nonstatic to non static USING EXTEND
}
}

class Demo{
public static void main(String[] args)
{
Stu1 s=new Stu1();
Stu1.disp1();//STATIC TO STATIC USING CLASS NAME
s.disp();//STATIC TO NON STATIC USING OBJECT
Stu2 st=new Stu2();
st.disp2();//STATIC TO NON STATIC USING OBJECT

}
}

