class bill{
public static void main(String[] args){
int Product1 = 1250;
int Product2 = 1450;
float Gst = 12.0f;
int a = Product1 + Product2;
float bill = Gst/100*a;
float total = Product1 + Product2 + bill;
System.out.println("total bill amount"+ total);
}
}
