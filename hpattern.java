public class hpattern{
public static void main(String args[])
{
int n =5;
//print row

for(int row=1; row <=n; row++)
{
//print a col
for(int col=1 ;col<=n; col++)
{

if( row == 3 || col == 1 || col ==n )
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
}
