import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
class comp
{
        public static int toasc(int c)
        {
             int k=48;
             switch(c)
             {
                 case 1: k=49;
                            break;
                 case 2: k=50;
                            break;
                 case 3: k=51;
                            break;
                 case 4: k=52;
                            break;
                 case 5: k=53;
                            break;
                 case 6: k=54;
                            break;
                 case 7: k=55;
                            break;
                 case 8: k=56;
                            break;
                 case 9: k=57;
                            break;
             }
             return k;
         }
            public static void main(String args[])
            {
                   File inf=new File("abc.txt");
                   File outf=new File("xyz.txt");
                   FileReader ins=null;
                   FileWriter outs=null;
                   int result[]=new int[5000];
                   int compfile[]=new int[5000];
                   int count=0,c=1,k=0;
                   try
                   {
                       ins=new FileReader(inf);
                       outs=new FileWriter(outf);
                       int ch;
                       while((ch=ins.read())!=-1)
                       {
                                result[count++]=ch;
                       }
                    }
                    catch(IOException e)
                    {}
                    for(int i=0;i<count-1;i++)
                    {
                         if(result[i]==result[i+1])
                         {
                             c++;
                             if(c>9)
                             {
                                 k=k+2;
                                 c=1;
                             }
                             compfile[k]=toasc(c);
                             compfile[k+1]=result[i];
                             continue;
                         }
                         else
                          {
                              if(c==1)
                              {
                                   compfile[k]=result[i];
                                    k++;
                              }
                              else
                              {
                                    k=k+2;
                              }
                              c=1;
                           }              
                        }
                       /* if(c==1)
                        {
                             compfile[k]=result[count-1];
                             k++;
                        } 
                        else
                            k=k+2; */
                        try
                         {
                                for(int i=0;i<k;i++) 
                                {
                                     outs.write(compfile[i]);
                                      outs.flush();
                                }
                          }
                          catch(IOException e)
                          {}
            }
         }