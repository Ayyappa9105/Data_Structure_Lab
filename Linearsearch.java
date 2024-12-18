import java.util.*;
public class Linearsearch{
    public void search(int a[],int key)
    {
    	int flag=0;
        for (int i = 0; i < a.length; i++)
      {
            if(key==a[i])
            {
            flag=1;
            }
       }
      if(flag==1)
      {
        System.out.println("Key is found");
      }
      else
      {
        System.out.println("key is not found");
     }
   }

  public static void main(String args[])
  {
     int n;
     Scanner sc = new Scanner(System.in);
     Linearsearch ls = new Linearsearch();
     System.out.println("enter the size of array:");
     n=sc.nextInt();
     int[] a=new int[n];
     System.out.println("enter the array elements:");
     for(int i=0;i<n;i++)
     {
        a[i]=sc.nextInt();
     }
     System.out.println("enter the key element:");
     int key=sc.nextInt();
     ls.search(a,key);
  }
}
/* OUTPUT
  enter the array size:
  5
  enter the array elements:
  10 20 7 18 93
  enter the key element:
  7
  key is found 
  */
