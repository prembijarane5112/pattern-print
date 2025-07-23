public class solidRhombus {

public static void star(int n)
{

// outer for I

for( int i=1;i<=n; i++) 

{
//inner loop- print space 

for(int j=1;j<=n-i; j++ ) 

{
System.out.print(" ") ;

}

// print star

 for(int j=1; j<=n ; j++ ) 

{

System.out.print("*");

}

System.out.println();
}
}

public static void main(String args[] )

{

star(5) ;

}
}