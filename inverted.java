import java.util.*;
public class inverted{
//they have print inverted half pyramaid 

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.print("enter a number:");

int n=sc.nextInt();

// for print a row

for(int row = 1; row <= n ;   row ++ ) 
{

// print the space 

for(int col = 1 ; col <= n-row ; col ++) {

System.out.print(" ");
}

for(int col = 1; col <=row ; col ++ ) 
{
System.out.print("*" );

}
System.out.println();
}
}
}

