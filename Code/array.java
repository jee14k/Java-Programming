import java.util.*;
class Q3
{
    private int n;
    private int m;
    private int f;
    int a[] = new int[50];
    int b[] = new int[50];
    int c[] = new int[100];
    void accept(int n1,int m1)
    {
        Scanner sc = new Scanner(System.in);
      n=n1; m=m1; int i;
     System.out.println("Enter values for your first array.");
      for(i=0;i<n;i++)
        a[i]=sc.nextInt();
     System.out.println("Enter values for your second array.");
      for(i=0;i<m;i++)
        b[i]=sc.nextInt();
   }

   void sort(int n1, int m1)
   { n=n1; m=m1;
     int i,j,t=0;
     for(i=0;i<n;i++)
        { for(j=0;j<n-1-i;j++)
             { if(a[j]>a[j+1])
                 {t=a[j];
                  a[j]=a[j+1];
                  a[j+1]=t;
                 }
             }
        }

        for(i=0;i<m;i++)
        { for(j=0;j<m-1-i;j++)
             { if(b[j]>b[j+1])
                 {t=b[j];
                  b[j]=b[j+1];
                  b[j+1]=t;
                 }
             }
        }
      System.out.println("");
      System.out.println("The Sorted Arrays are:");
      System.out.print("First Array:  ");
      for(i=0;i<n;i++)
         { System.out.print(a[i]+"  ");
          }
      System.out.println("");
      System.out.print("Second Array: ");
      for(i=0;i<m;i++)
         { System.out.print(b[i]+"  ");
          }
      System.out.println("");
      
   }
  
                  
   void merge(int n1,int m1)
   {  int i; int g;
      n=n1; m=m1; int ct=0; int cn=0,cm=0;
      while(cn<n&&cm<m)
      { if(a[cn]<b[cm])
          {c[ct]=a[cn];
           cn++;
           ct++;
          }
         if(a[cn]>b[cm])
          { c[ct]=b[cm];
            cm++;
            ct++;
           }
        if (a[cn]==b[cm])
          { c[ct]=a[cn];
            cn++;
            cm++; 
            ct++;
            f--;   
          }
       }

       if(cn<n)
         { for(i=cn;i<n;i++)
              c[ct++]=a[i];  
          }
       if(cm<m)
         { for(i=cm;i<m;i++)
              c[ct++]=b[i];  
          }
  }
    
   void display(int n1,int m1)
   { f=f+m1+n1;
     int i;
     System.out.println("");
     System.out.println("***************************************************************");
     System.out.println("The Final Array is:");
     System.out.println("");
     for(i=0;i<f;i++)
        {System.out.print(c[i]+" ");
         }
     System.out.println("");
     System.out.println("***************************************************************");
   }
}

class array
{ public static void main(String args[])
  { Q3 ob = new Q3();
    Scanner sc = new Scanner(System.in);
    System.out.println("***************************************************************");
    System.out.println("Program to Accept 2 arrays and Merge them without Redundancy.");
    System.out.println("***************************************************************");
    System.out.println("");
    System.out.println("Enter the size of first array");
    int n=sc.nextInt();
    System.out.println("");
    
    System.out.println("Enter the size of second array");
    int m=sc.nextInt();
    System.out.println("");
    
    ob.accept(n,m);
    ob.sort(n,m);
    ob.merge(n,m);
    ob.display(n,m);
  }
}  