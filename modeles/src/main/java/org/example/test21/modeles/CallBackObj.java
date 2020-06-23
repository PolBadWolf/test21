package org.example.test21.modeles;

public interface CallBackObj {
    void callBackObj(Object o);
    static void metodCallBack(CallBackObj callBackObj, Object o) {
        callBackObj.callBackObj(o);
    }
}
