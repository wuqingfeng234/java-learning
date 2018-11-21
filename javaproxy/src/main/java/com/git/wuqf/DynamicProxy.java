package com.git.wuqf;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author wuqf
 * @date 2018/11/21
 */
public class DynamicProxy implements InvocationHandler {

    private Object object;

    public DynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(object,args);
        return invoke;
    }
}
