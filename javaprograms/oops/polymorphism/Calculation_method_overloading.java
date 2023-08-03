package oops.polymorphism;
public class Calculation_method_overloading{
  public void add(int a ,int b){
    int i =a+b;
    System.out.println(i);
  }
  public void add(double a,double b,double c){
    System.out.println(a+b+c);
  }
  public static void main(String[] args) {
    Calculation_method_overloading sc= new Calculation_method_overloading();
    sc.add(1,3);
    sc.add(2,3,4);
    System.out.println();
  }
}