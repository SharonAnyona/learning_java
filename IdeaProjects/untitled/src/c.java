
class A {
    A(){
        System.out.println("This is the constructor for class A");
    }
}
class B extends A
{
    B(){
        System.out.println("This is the constructor for class B");
    }
}
class c extends B
{
    c(){

        System.out.println("This is the constructor for class c");
    }
   public static void main(String[]args){

        c objc1=new c();
   }
}