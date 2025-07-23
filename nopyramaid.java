public class nopyramaid{
//print that no of the pyramaid

public static void pyramaid(int n )

{
// for row

for(int row =1 ; row <= n; row++)

{
//print the coloum by condition (n-i+1)

for(int col=1;col<=n-row+1;col++)

{

System.out.print(col + " ");

}

System.out.println();
}
}

public static void main(String args[])
{
pyramaid(5);

}
}
