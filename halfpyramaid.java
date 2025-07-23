public class halfpyramaid{

public static void pyramaid(int n )

{

//outer - row

for( int  row=1 ; row <=n ;row ++ )

{

for(  int col=1; col <=n-row ; col ++ )

{

//for inner -- space print

System.out.print(" ");

}

for(int col=1 ; col<=row; col ++ )
{

System.out.print("*");
}

System.out.println();
}
}

public static void main(String args[])
{

pyramaid(4);

}

}



