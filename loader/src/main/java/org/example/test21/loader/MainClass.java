package org.example.test21.loader;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello, hard world !");
        new MainClass().start();
    }

    private void start() {
        System.out.println("this start");
        metodCallBack(() -> myFuncton1("123"));
        metodCallBack(() -> myFunction2(1, 5));
    }

    private static void metodCallBack(CallBack_Interface callBack) {
        callBack.callBack();
    }

    private void myFuncton1(String s1) {
        System.out.println("Fn1");
        System.out.println(s1);
    }

    private void  myFunction2(int a, int b) {
        System.out.println("Fn2");
        System.out.println("a + b = : " + a + " + " + b + " = " + (a+b));
    }
}
