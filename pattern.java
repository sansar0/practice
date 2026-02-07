
public class pattern {
	public static void main(String[]args) {
		int n = 5;
int x = n/2;
int y = n/2;
for (int i = 1; i<=n;i++)
{
for (int j = 1; j<=n;j++)
{
if((i&j)==(x&y)){
System.out.print("X");
if(i==x||j==y)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();}}}}

