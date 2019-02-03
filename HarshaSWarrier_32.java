import java.io.*;
public class PrintPattern
{
 public static void main(String [] args)throws IOException
   {
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader (read);
    int p;
    System.out.print("Enter the number of lines required: ");
    System.out.println();
    p=Integer.parseInt(in.readLine());
    for(int i = p/2; i >= 1; i--)
     {
      for(int j = 1; j <= p; j++)
       {
        if(j == i || (p - i) == j)
            {
            System.out.print("1");  
            }
        else 
           {
            System.out.print(' ');
           }
        }
     System.out.println();
    }
    for(int i =2; i <= p/2; i++)
     {
      for(int j = 1; j <= p; j++)
       {
        if(j == i || (p - i) == j)
         {
            System.out.print("1");   
         }
        else
         {
            System.out.print(' ');
         }
        }
     System.out.println();
    } 
 }
} 