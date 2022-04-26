class Record
{
 int a,b,c;
 void getData(int x)
 {
  a=x;
  b=x;
  c=x;
 }
 void getData()
 {
  a=0;
  b=0;
  c=0;
 }
 void getData(int x,int y,int z)
 {
  a=x;
  b=y;
  c=z;
 }
 void display()
 {
  System.out.println("a="+a);
  System.out.println("b="+b);
  System.out.println("c="+c);
 }
}
class MethodOverloading
{
 public static void main(String arg[])
 {
  Record m=new Record();
  Record n=new Record();
  Record p=new Record();
  m.getData();
  n.getData(5);
  p.getData(4,3,2);
  m.display();
  n.display();
  p.display();
 }
}