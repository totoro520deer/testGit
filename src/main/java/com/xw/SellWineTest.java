package com.xw;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class SellWineTest {
    public static void main(String[] args) {
        MaotaiJiu maotaiJiu = new MaotaiJiu();
        InvocationHandler riemann = new GuitaiA(maotaiJiu);
        SellWine dynamicProxy = (SellWine) Proxy.newProxyInstance(MaotaiJiu.class.getClassLoader(),
                MaotaiJiu.class.getInterfaces(), riemann);
        dynamicProxy.maiJiu();
    }
}
