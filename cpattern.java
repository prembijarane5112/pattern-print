public class cpattern {
  //they have print a pattern to c type
  public static void main(String args[])
  {

    int n = 5 ;
    //print a row 

    for(int row =1 ;row <=n; row ++)
    {
      for(int col =1; col<=n; col++)
{
if(row == 1 || col == 1 || row == n)
{
  System.out.print("*" + " ");
}
else {
  System.out.print(" ");
}

}
System.out.println();
    }
  }
}
