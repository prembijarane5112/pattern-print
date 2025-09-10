
public class basicpattern  {
public static void main(String args[])
  {
    int n=4;
for(int i=0;i<=n;i++){
  for(int j=0;j<=n;j++){
    System.out.print("*");
  }
  System.out.println();
}
  }


//output of this code 
  *  *  *  * 
  *  *  *  * 
  *  *  *  *  
  *  *  *  *
  


//  print as as this number instead of npattern

int n=4;
  for(int i=1;i<=n;i++){
  for(int j=1;j<=i;j++)
    {
System.out.print("*" +" ");
    }
}


// output of this code
* 
*  *
*  *  *
*  *  *  *
