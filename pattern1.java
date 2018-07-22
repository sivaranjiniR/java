public class pattern {

       public static void main(String args[])

       {

              int n=5,s=1,t=1;

              int m=n;

              for(int i=0;i<m;i++)

              {

                     for(int j=0;j<n;j++)

                     {

                           System.out.print(" ");

                    

                     }

                     n=n-1;

                     for(int k=0;k<t;k++)

                     {

                     System.out.print(s);

                     }

                     s=s+1;

                     t=t+2;

                     System.out.println("");

              }

       }

 

}

 

 

 

OUTPUT:

     1

    222

   33333

  4444444

 555555555

 
