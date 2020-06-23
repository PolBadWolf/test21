package org.example.test21.modeles;

public interface CallBack {
    void callBack();
    static void metodCallBack(CallBack callBack) {
        callBack.callBack();
    }
}
