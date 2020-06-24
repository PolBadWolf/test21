package org.example.test21.loader;

import org.example.test21.modeles.CallBack;
import org.example.test21.modeles.CallBackObj;

public class MainClass {
    public static MainClass mainClass = null;
    public static void main(String[] args) {
        System.out.println("Hello, hard world !");
        mainClass = new MainClass();
        mainClass.start();
    }

    private void start() {
        System.out.println("this start");
        CallBack.metodCallBack(() -> myFuncton1("123"));
        CallBack.metodCallBack(() -> myFunction2(1, 5));
        TestClass1 testClass1 = new TestClass1(this::myFunction3);
        TestClass2 testClass2 = new TestClass2(this::myFunction4);
        testClass1.callBackObj("s1");
        testClass1.callBackObj("s3");
        testClass2.callBack();
    }

    private void myFuncton1(String s1) {
        System.out.print("Fn1:");
        System.out.print(s1);
        System.out.println();
    }

    private void  myFunction2(int a, int b) {
        System.out.print("Fn2:");
        System.out.print("a + b = : " + a + " + " + b + " = " + (a+b));
        System.out.println();
    }

    private void myFunction3(Object o) {
        System.out.print("Fn3:");
        System.out.print((String)o);
        System.out.println();
    }
    private void myFunction4() {
        System.out.println("Fn4 - no param");
    }
}

class TestClass1 implements CallBackObj {
    private CallBackObj callBackObj = null;

    public TestClass1(CallBackObj callBackObj) {
        this.callBackObj = callBackObj;
    }

    @Override
    public void callBackObj(Object o) {
        callBackObj.callBackObj(o);
    }

}

class TestClass2 implements CallBack {
    private CallBack callBack = null;

    public TestClass2(CallBack callBack) {
        this.callBack = callBack;
    }

    @Override
    public void callBack() {
        callBack.callBack();
    }
}
