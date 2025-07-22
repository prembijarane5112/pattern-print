public class hollowrectangle {
public static void main(String args[])
{

int n=5;

//print row

for(int row=1 ; row<=n;  row++){

//print col 

for(int col=1; col <=n; col++)
{

if( row ==1 || col==1 || row==n || col== n ) 
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

