public class hollowrectangle 
{

public static void rectangle(int totrows,int totcols)
{

//inner loop - row 

for(int row = 1 ;row<=totrows ; row ++ )
{
//outer loop -  coloumn 

for ( int col =1 ; col<=totcols ; col ++ )
{

if( row == 1 || row ==totrows || col == 1 || col == totcols ) 

{

System.out.print("*");

}

else {

System.out.print(" ");
}

}

System.out.println();
}

}

public static void  main(String args[] ) 
{

 rectangle(4,5 );

}

}

 