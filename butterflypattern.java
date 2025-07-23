public class butterflypattern
{

public static void butter_pattern( int n )

{

//1 st half
for(int row = 1 ; row <= n; row++ )

{

//for star =i;
for(int col=1 ; col <=row; col ++ )

{
System.out.print("*");

}

//for spaces - 2*(n-i)

for(int col =1 ;col <= 2*(n-row) ; col++ )

{

System.out.print(" ");

}

//for star - i
for(int col = 1; col<= row ; col++ ) 
{
System.out.print("*");
}

System.out.println();

}

 //for second half print 

for ( int row = n ;row >=1 ; row-- ) 

{

for(int col=1 ; col <=row; col ++ )

{
System.out.print("*");

}

//for spaces - 2*(n-i)

for(int col =1 ;col <= 2*(n-row) ; col++ )

{

System.out.print(" ");

}

//for star - i
for(int col = 1; col<= row ; col++ ) 

{

System.out.print("*");
}

System.out.println();
}


}

public static void main(String args[] ) 
{
butter_pattern(4);

}
}
