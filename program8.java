class program8{ 
public static void main(String[]args){
int a = 10;
int b = 20;
int c  = a+b++;
int d = a++ - b++ + ++c;
System.out.print(a+","+b+","+c+","+d);
}
}