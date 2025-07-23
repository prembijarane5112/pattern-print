public class diamondpattern {

public static void Diamondshape(int n)

{
// outer  -- row


//1 st half
for(int i=1 ;i<=n ;i++ )

{

// inner -- space 

for(int j=1; j<=n-i;j++ )

{

System.out.print(" ");

}

//for star 

for(int j=1;j<=(2*i)-1;j++)

{

System.out.print("*");

}
System.out.println();

}


// 2 nd half

for(int i=n; i>=1;i-- )

{

for(int j=1;j<=n-i;j++)

{

System.out.print(" ");

}

//star-print 

for(int j=1;j<=(2*i)-1;j++)

{

System.out.print("*");

}
System.out.println();
}
}



public static void main(String args[])
{
Diamondshape(4);
}
}





