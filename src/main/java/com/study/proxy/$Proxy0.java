package com.study.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;
//代理类反编译
public final class $Proxy0 extends Proxy implements Subject {
    private static Method m1;
    private static Method m0;
    private static Method m3;
    private static Method m2;

    static {
        try {
            m1 = Class.forName("java.lang.Object").getMethod("equals",
                    new Class[] { Class.forName("java.lang.Object") });

            m0 = Class.forName("java.lang.Object").getMethod("hashCode",
                    new Class[0]);

            m3 = Class.forName("***.RealSubject").getMethod("request",
                    new Class[0]);

            m2 = Class.forName("java.lang.Object").getMethod("toString",
                    new Class[0]);

        } catch (NoSuchMethodException nosuchmethodexception) {
            throw new NoSuchMethodError(nosuchmethodexception.getMessage());
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    } //static

    public $Proxy0(InvocationHandler invocationhandler) {
        super(invocationhandler);
    }
/**
 *@Description:
 *
 * @param obj
 * @return boolean
 * @throws
 * @author XiongWei
 * @date 2021/4/23 15:44
*/
    @Override
    public final boolean equals(Object obj) {
        try {
            return ((Boolean) super.h.invoke(this, m1, new Object[] { obj })) .booleanValue();
        } catch (Throwable throwable) {
            throw new UndeclaredThrowableException(throwable);
        }
    }

    @Override
    public final int hashCode() {
        try {
            return ((Integer) super.h.invoke(this, m0, null)).intValue();
        } catch (Throwable throwable) {
            throw new UndeclaredThrowableException(throwable);
        }
    }

    public final void request() {
        try {
            super.h.invoke(this, m3, null);
            return;
        } catch (Error e) {
        } catch (Throwable throwable) {
            throw new UndeclaredThrowableException(throwable);
        }
    }

    @Override
    public final String toString() {
        try {
            return (String) super.h.invoke(this, m2, null);
        } catch (Throwable throwable) {
            throw new UndeclaredThrowableException(throwable);
        }
    }
}
