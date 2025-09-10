//this is the  star rectangle pattern 
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


  //replace star by the number like 1 2 3 4 

int n=4;
  for(int i=1;i<=n;i++)//this is row used
  {
    for(int j=1;j<=n;j++)
      {
        //print a star
        System.out.print(j + " ");
      }
    System.out.println();
  }

//output of this code
1  2  3  4
1  2  3  4 
1  2  3  4
1  2  3  4

  
    



  //print the no output by smae number like 1 1 1 1
  int n=4;
for(int i=1;i<=n;i++)
  {
for(int j=1;j<=n;j++)
  {
System.out.print(i +" ");
  }
  }


//output of this code 

1  1  1  1
2  2  2  2
3  3  3  3
4  4  4  4


  
