import java.util.*;
class mirror
{  public static void main(String args[])
  { int i; int j; int a[]= new int[100]; int ctr=0;
    int n; int b[] = new int[100]; int lc;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    n = sc.nextInt();
    System.out.println("Enter the values to your array");
    ctr=n-1; int ln =1;
    String s=""; String s1="";
      int ctr1=0; int k;

    for(i=0;i<n;i++)
    { a[i]=sc.nextInt();
      b[ctr]=a[i];
      ctr--;
      
    }

   for(i=2;i<=n;i++)
      {  ctr1=i;
         for(j=0;j<n-i+1;j++)
           {  lc=j;s="";
              while(ctr1>0)
              { s+=Integer.toString(a[lc]);
                ctr1--;
                lc++;
               }
           
            for(k=0;k<n-i+1;k++)
               { ctr1=i;
                 lc=k;
                 while(ctr1>0)
                 { s1=s1+Integer.toString(b[lc]);
                   ctr1--;
                   lc++;
                 }
                
                if(s.equals(s1))
                  ln=i;
                  s1="";
                  System.out.println(s);
                }
             }
        }
   System.out.println("The largest mirror = " +ln);
}
}
                 