class program8{ 
public static void main(String[]args){
int a = 20;
System.out.println(a);

int b = -10;
System.out.println(b);

int c  = a+b++;
System.out.println(a);
System.out.println(b);
System.out.println(c);

int d = a++ - b++ + ++c;
System.out.println(a+","+b+","+c+","+d);
}
}