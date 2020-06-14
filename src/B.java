package mypack;

import pack.*;

//class B{
//default
//    public static void main(String args[]){
//
//        A obj = new A();//Compile Time Error
//
//        obj.msg();//Compile Time Error
//
//    }
//
//}
//Protected
//class B extends A{
//
//    public static void main(String args[]){
//
//        B obj = new B();
//
//        obj.msg();
//
//    }
//
//}
//public
class B{

    public static void main(String args[]){

        A obj = new A();

        obj.msg();

    }

}