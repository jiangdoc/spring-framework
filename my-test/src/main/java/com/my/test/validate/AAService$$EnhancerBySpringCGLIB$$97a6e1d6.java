package com.my.test.validate;/*
 * Decompiled with CFR.
 * 
 * Could not load the following classes:
 *  com.example.demo.validate.AAService
 *//*

package com.example.demo.validate;

import com.example.demo.validate.AAService;
import java.lang.reflect.Method;
import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.SpringProxy;
import org.springframework.aop.TargetClassAware;
import org.springframework.aop.TargetSource;
import org.springframework.aop.framework.Advised;
import org.springframework.aop.framework.AopConfigException;
import org.springframework.cglib.core.ReflectUtils;
import org.springframework.cglib.core.Signature;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Dispatcher;
import org.springframework.cglib.proxy.Factory;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.cglib.proxy.NoOp;

public class AAService$$EnhancerBySpringCGLIB$$97a6e1d6
extends AAService
implements SpringProxy,
Advised,
Factory {
    private boolean CGLIB$BOUND;
    public static Object CGLIB$FACTORY_DATA;
    private static final ThreadLocal CGLIB$THREAD_CALLBACKS;
    private static final Callback[] CGLIB$STATIC_CALLBACKS;
    private MethodInterceptor CGLIB$CALLBACK_0;
    private MethodInterceptor CGLIB$CALLBACK_1;
    private NoOp CGLIB$CALLBACK_2;
    private NoOp CGLIB$CALLBACK_3;
    private Dispatcher CGLIB$CALLBACK_4;
    private MethodInterceptor CGLIB$CALLBACK_5;
    private MethodInterceptor CGLIB$CALLBACK_6;
    private static Object CGLIB$CALLBACK_FILTER;
    private static final Method CGLIB$printAA$0$Method;
    private static final MethodProxy CGLIB$printAA$0$Proxy;
    private static final Object[] CGLIB$emptyArgs;
    private static final Method CGLIB$equals$1$Method;
    private static final MethodProxy CGLIB$equals$1$Proxy;
    private static final Method CGLIB$toString$2$Method;
    private static final MethodProxy CGLIB$toString$2$Proxy;
    private static final Method CGLIB$hashCode$3$Method;
    private static final MethodProxy CGLIB$hashCode$3$Proxy;
    private static final Method CGLIB$clone$4$Method;
    private static final MethodProxy CGLIB$clone$4$Proxy;

    @Override
    public final boolean isProxyTargetClass() {
        Dispatcher dispatcher = this.CGLIB$CALLBACK_4;
        if (dispatcher == null) {
            AAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$BIND_CALLBACKS(this);
            dispatcher = this.CGLIB$CALLBACK_4;
        }
        return ((Advised)dispatcher.loadObject()).isProxyTargetClass();
    }

    @Override
    public final void setTargetSource(TargetSource targetSource) {
        Dispatcher dispatcher = this.CGLIB$CALLBACK_4;
        if (dispatcher == null) {
            AAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$BIND_CALLBACKS(this);
            dispatcher = this.CGLIB$CALLBACK_4;
        }
        ((Advised)dispatcher.loadObject()).setTargetSource(targetSource);
    }

    @Override
    public final TargetSource getTargetSource() {
        Dispatcher dispatcher = this.CGLIB$CALLBACK_4;
        if (dispatcher == null) {
            AAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$BIND_CALLBACKS(this);
            dispatcher = this.CGLIB$CALLBACK_4;
        }
        return ((Advised)dispatcher.loadObject()).getTargetSource();
    }

    public final Class getTargetClass() {
        Dispatcher dispatcher = this.CGLIB$CALLBACK_4;
        if (dispatcher == null) {
            AAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$BIND_CALLBACKS(this);
            dispatcher = this.CGLIB$CALLBACK_4;
        }
        return ((TargetClassAware)dispatcher.loadObject()).getTargetClass();
    }

    public final Class[] getProxiedInterfaces() {
        Dispatcher dispatcher = this.CGLIB$CALLBACK_4;
        if (dispatcher == null) {
            AAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$BIND_CALLBACKS(this);
            dispatcher = this.CGLIB$CALLBACK_4;
        }
        return ((Advised)dispatcher.loadObject()).getProxiedInterfaces();
    }

    public final boolean isInterfaceProxied(Class clazz) {
        Dispatcher dispatcher = this.CGLIB$CALLBACK_4;
        if (dispatcher == null) {
            AAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$BIND_CALLBACKS(this);
            dispatcher = this.CGLIB$CALLBACK_4;
        }
        return ((Advised)dispatcher.loadObject()).isInterfaceProxied(clazz);
    }

    @Override
    public final int getAdvisorCount() {
        Dispatcher dispatcher = this.CGLIB$CALLBACK_4;
        if (dispatcher == null) {
            AAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$BIND_CALLBACKS(this);
            dispatcher = this.CGLIB$CALLBACK_4;
        }
        return ((Advised)dispatcher.loadObject()).getAdvisorCount();
    }

    @Override
    public final Advisor[] getAdvisors() {
        Dispatcher dispatcher = this.CGLIB$CALLBACK_4;
        if (dispatcher == null) {
            AAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$BIND_CALLBACKS(this);
            dispatcher = this.CGLIB$CALLBACK_4;
        }
        return ((Advised)dispatcher.loadObject()).getAdvisors();
    }

    @Override
    public final void setExposeProxy(boolean bl) {
        Dispatcher dispatcher = this.CGLIB$CALLBACK_4;
        if (dispatcher == null) {
            AAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$BIND_CALLBACKS(this);
            dispatcher = this.CGLIB$CALLBACK_4;
        }
        ((Advised)dispatcher.loadObject()).setExposeProxy(bl);
    }

    @Override
    public final boolean isExposeProxy() {
        Dispatcher dispatcher = this.CGLIB$CALLBACK_4;
        if (dispatcher == null) {
            AAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$BIND_CALLBACKS(this);
            dispatcher = this.CGLIB$CALLBACK_4;
        }
        return ((Advised)dispatcher.loadObject()).isExposeProxy();
    }

    @Override
    public final void setPreFiltered(boolean bl) {
        Dispatcher dispatcher = this.CGLIB$CALLBACK_4;
        if (dispatcher == null) {
            AAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$BIND_CALLBACKS(this);
            dispatcher = this.CGLIB$CALLBACK_4;
        }
        ((Advised)dispatcher.loadObject()).setPreFiltered(bl);
    }

    @Override
    public final boolean isPreFiltered() {
        Dispatcher dispatcher = this.CGLIB$CALLBACK_4;
        if (dispatcher == null) {
            AAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$BIND_CALLBACKS(this);
            dispatcher = this.CGLIB$CALLBACK_4;
        }
        return ((Advised)dispatcher.loadObject()).isPreFiltered();
    }

    @Override
    public final void addAdvisor(int n, Advisor advisor) throws AopConfigException {
        Dispatcher dispatcher = this.CGLIB$CALLBACK_4;
        if (dispatcher == null) {
            AAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$BIND_CALLBACKS(this);
            dispatcher = this.CGLIB$CALLBACK_4;
        }
        ((Advised)dispatcher.loadObject()).addAdvisor(n, advisor);
    }

    @Override
    public final void addAdvisor(Advisor advisor) throws AopConfigException {
        Dispatcher dispatcher = this.CGLIB$CALLBACK_4;
        if (dispatcher == null) {
            AAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$BIND_CALLBACKS(this);
            dispatcher = this.CGLIB$CALLBACK_4;
        }
        ((Advised)dispatcher.loadObject()).addAdvisor(advisor);
    }

    @Override
    public final boolean removeAdvisor(Advisor advisor) {
        Dispatcher dispatcher = this.CGLIB$CALLBACK_4;
        if (dispatcher == null) {
            AAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$BIND_CALLBACKS(this);
            dispatcher = this.CGLIB$CALLBACK_4;
        }
        return ((Advised)dispatcher.loadObject()).removeAdvisor(advisor);
    }

    @Override
    public final void removeAdvisor(int n) throws AopConfigException {
        Dispatcher dispatcher = this.CGLIB$CALLBACK_4;
        if (dispatcher == null) {
            AAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$BIND_CALLBACKS(this);
            dispatcher = this.CGLIB$CALLBACK_4;
        }
        ((Advised)dispatcher.loadObject()).removeAdvisor(n);
    }

    @Override
    public final boolean replaceAdvisor(Advisor advisor, Advisor advisor2) throws AopConfigException {
        Dispatcher dispatcher = this.CGLIB$CALLBACK_4;
        if (dispatcher == null) {
            AAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$BIND_CALLBACKS(this);
            dispatcher = this.CGLIB$CALLBACK_4;
        }
        return ((Advised)dispatcher.loadObject()).replaceAdvisor(advisor, advisor2);
    }

    @Override
    public final void addAdvice(int n, Advice advice) throws AopConfigException {
        Dispatcher dispatcher = this.CGLIB$CALLBACK_4;
        if (dispatcher == null) {
            AAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$BIND_CALLBACKS(this);
            dispatcher = this.CGLIB$CALLBACK_4;
        }
        ((Advised)dispatcher.loadObject()).addAdvice(n, advice);
    }

    @Override
    public final void addAdvice(Advice advice) throws AopConfigException {
        Dispatcher dispatcher = this.CGLIB$CALLBACK_4;
        if (dispatcher == null) {
            AAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$BIND_CALLBACKS(this);
            dispatcher = this.CGLIB$CALLBACK_4;
        }
        ((Advised)dispatcher.loadObject()).addAdvice(advice);
    }

    @Override
    public final boolean removeAdvice(Advice advice) {
        Dispatcher dispatcher = this.CGLIB$CALLBACK_4;
        if (dispatcher == null) {
            AAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$BIND_CALLBACKS(this);
            dispatcher = this.CGLIB$CALLBACK_4;
        }
        return ((Advised)dispatcher.loadObject()).removeAdvice(advice);
    }

    @Override
    public final String toProxyConfigString() {
        Dispatcher dispatcher = this.CGLIB$CALLBACK_4;
        if (dispatcher == null) {
            AAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$BIND_CALLBACKS(this);
            dispatcher = this.CGLIB$CALLBACK_4;
        }
        return ((Advised)dispatcher.loadObject()).toProxyConfigString();
    }

    public final void printAA(String string) {
        MethodInterceptor methodInterceptor = this.CGLIB$CALLBACK_0;
        if (methodInterceptor == null) {
            AAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$BIND_CALLBACKS(this);
            methodInterceptor = this.CGLIB$CALLBACK_0;
        }
        if (methodInterceptor != null) {
            Object object = methodInterceptor.intercept(this, CGLIB$printAA$0$Method, new Object[]{string}, CGLIB$printAA$0$Proxy);
            return;
        }
        super.printAA(string);
    }

    public AAService$$EnhancerBySpringCGLIB$$97a6e1d6() {
        AAService$$EnhancerBySpringCGLIB$$97a6e1d6 aAService$$EnhancerBySpringCGLIB$$97a6e1d6 = this;
        AAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$BIND_CALLBACKS(aAService$$EnhancerBySpringCGLIB$$97a6e1d6);
    }

    static {
        AAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$STATICHOOK3();
    }

    public final boolean equals(Object object) {
        MethodInterceptor methodInterceptor = this.CGLIB$CALLBACK_5;
        if (methodInterceptor == null) {
            AAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$BIND_CALLBACKS(this);
            methodInterceptor = this.CGLIB$CALLBACK_5;
        }
        if (methodInterceptor != null) {
            Object object2 = methodInterceptor.intercept(this, CGLIB$equals$1$Method, new Object[]{object}, CGLIB$equals$1$Proxy);
            return object2 == null ? false : (Boolean)object2;
        }
        return super.equals(object);
    }

    public final String toString() {
        MethodInterceptor methodInterceptor = this.CGLIB$CALLBACK_0;
        if (methodInterceptor == null) {
            AAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$BIND_CALLBACKS(this);
            methodInterceptor = this.CGLIB$CALLBACK_0;
        }
        if (methodInterceptor != null) {
            return (String)methodInterceptor.intercept(this, CGLIB$toString$2$Method, CGLIB$emptyArgs, CGLIB$toString$2$Proxy);
        }
        return super.toString();
    }

    public final int hashCode() {
        MethodInterceptor methodInterceptor = this.CGLIB$CALLBACK_6;
        if (methodInterceptor == null) {
            AAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$BIND_CALLBACKS(this);
            methodInterceptor = this.CGLIB$CALLBACK_6;
        }
        if (methodInterceptor != null) {
            Object object = methodInterceptor.intercept(this, CGLIB$hashCode$3$Method, CGLIB$emptyArgs, CGLIB$hashCode$3$Proxy);
            return object == null ? 0 : ((Number)object).intValue();
        }
        return super.hashCode();
    }

    protected final Object clone() throws CloneNotSupportedException {
        MethodInterceptor methodInterceptor = this.CGLIB$CALLBACK_0;
        if (methodInterceptor == null) {
            AAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$BIND_CALLBACKS(this);
            methodInterceptor = this.CGLIB$CALLBACK_0;
        }
        if (methodInterceptor != null) {
            return methodInterceptor.intercept(this, CGLIB$clone$4$Method, CGLIB$emptyArgs, CGLIB$clone$4$Proxy);
        }
        return super.clone();
    }

    @Override
    public final int indexOf(Advice advice) {
        Dispatcher dispatcher = this.CGLIB$CALLBACK_4;
        if (dispatcher == null) {
            AAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$BIND_CALLBACKS(this);
            dispatcher = this.CGLIB$CALLBACK_4;
        }
        return ((Advised)dispatcher.loadObject()).indexOf(advice);
    }

    @Override
    public final int indexOf(Advisor advisor) {
        Dispatcher dispatcher = this.CGLIB$CALLBACK_4;
        if (dispatcher == null) {
            AAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$BIND_CALLBACKS(this);
            dispatcher = this.CGLIB$CALLBACK_4;
        }
        return ((Advised)dispatcher.loadObject()).indexOf(advisor);
    }

    @Override
    public Object newInstance(Callback callback) {
        throw new IllegalStateException("More than one callback object required");
    }

    @Override
    public Object newInstance(Callback[] callbackArray) {
        AAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$SET_THREAD_CALLBACKS(callbackArray);
        AAService$$EnhancerBySpringCGLIB$$97a6e1d6 aAService$$EnhancerBySpringCGLIB$$97a6e1d6 = new AAService$$EnhancerBySpringCGLIB$$97a6e1d6();
        AAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$SET_THREAD_CALLBACKS(null);
        return aAService$$EnhancerBySpringCGLIB$$97a6e1d6;
    }

    @Override
    public Object newInstance(Class[] classArray, Object[] objectArray, Callback[] callbackArray) {
        AAService$$EnhancerBySpringCGLIB$$97a6e1d6 aAService$$EnhancerBySpringCGLIB$$97a6e1d6;
        AAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$SET_THREAD_CALLBACKS(callbackArray);
        Class[] classArray2 = classArray;
        switch (classArray.length) {
            case 0: {
                aAService$$EnhancerBySpringCGLIB$$97a6e1d6 = new AAService$$EnhancerBySpringCGLIB$$97a6e1d6();
                break;
            }
            default: {
                throw new IllegalArgumentException("Constructor not found");
            }
        }
        AAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$SET_THREAD_CALLBACKS(null);
        return aAService$$EnhancerBySpringCGLIB$$97a6e1d6;
    }

    @Override
    public final boolean isFrozen() {
        Dispatcher dispatcher = this.CGLIB$CALLBACK_4;
        if (dispatcher == null) {
            AAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$BIND_CALLBACKS(this);
            dispatcher = this.CGLIB$CALLBACK_4;
        }
        return ((Advised)dispatcher.loadObject()).isFrozen();
    }

    @Override
    public void setCallback(int n, Callback callback) {
        switch (n) {
            case 0: {
                this.CGLIB$CALLBACK_0 = (MethodInterceptor)callback;
                break;
            }
            case 1: {
                this.CGLIB$CALLBACK_1 = (MethodInterceptor)callback;
                break;
            }
            case 2: {
                this.CGLIB$CALLBACK_2 = (NoOp)callback;
                break;
            }
            case 3: {
                this.CGLIB$CALLBACK_3 = (NoOp)callback;
                break;
            }
            case 4: {
                this.CGLIB$CALLBACK_4 = (Dispatcher)callback;
                break;
            }
            case 5: {
                this.CGLIB$CALLBACK_5 = (MethodInterceptor)callback;
                break;
            }
            case 6: {
                this.CGLIB$CALLBACK_6 = (MethodInterceptor)callback;
                break;
            }
        }
    }

    @Override
    public void setCallbacks(Callback[] callbackArray) {
        this.CGLIB$CALLBACK_0 = (MethodInterceptor)callbackArray[0];
        this.CGLIB$CALLBACK_1 = (MethodInterceptor)callbackArray[1];
        this.CGLIB$CALLBACK_2 = (NoOp)callbackArray[2];
        this.CGLIB$CALLBACK_3 = (NoOp)callbackArray[3];
        this.CGLIB$CALLBACK_4 = (Dispatcher)callbackArray[4];
        this.CGLIB$CALLBACK_5 = (MethodInterceptor)callbackArray[5];
        Callback[] callbackArray2 = callbackArray;
        AAService$$EnhancerBySpringCGLIB$$97a6e1d6 aAService$$EnhancerBySpringCGLIB$$97a6e1d6 = this;
        this.CGLIB$CALLBACK_6 = (MethodInterceptor)callbackArray[6];
    }

    public static void CGLIB$SET_STATIC_CALLBACKS(Callback[] callbackArray) {
        CGLIB$STATIC_CALLBACKS = callbackArray;
    }

    public static void CGLIB$SET_THREAD_CALLBACKS(Callback[] callbackArray) {
        CGLIB$THREAD_CALLBACKS.set(callbackArray);
    }

    static void CGLIB$STATICHOOK3() {
        CGLIB$THREAD_CALLBACKS = new ThreadLocal();
        CGLIB$emptyArgs = new Object[0];
        Class<?> clazz = Class.forName("com.example.demo.validate.AAService$$EnhancerBySpringCGLIB$$97a6e1d6");
        Class<?> clazz2 = Class.forName("java.lang.Object");
        Method[] methodArray = ReflectUtils.findMethods(new String[]{"equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "clone", "()Ljava/lang/Object;"}, clazz2.getDeclaredMethods());
        CGLIB$equals$1$Method = methodArray[0];
        CGLIB$equals$1$Proxy = MethodProxy.create(clazz2, clazz, "(Ljava/lang/Object;)Z", "equals", "CGLIB$equals$1");
        CGLIB$toString$2$Method = methodArray[1];
        CGLIB$toString$2$Proxy = MethodProxy.create(clazz2, clazz, "()Ljava/lang/String;", "toString", "CGLIB$toString$2");
        CGLIB$hashCode$3$Method = methodArray[2];
        CGLIB$hashCode$3$Proxy = MethodProxy.create(clazz2, clazz, "()I", "hashCode", "CGLIB$hashCode$3");
        CGLIB$clone$4$Method = methodArray[3];
        CGLIB$clone$4$Proxy = MethodProxy.create(clazz2, clazz, "()Ljava/lang/Object;", "clone", "CGLIB$clone$4");
        clazz2 = Class.forName("com.example.demo.validate.AAService");
        CGLIB$printAA$0$Method = ReflectUtils.findMethods(new String[]{"printAA", "(Ljava/lang/String;)V"}, clazz2.getDeclaredMethods())[0];
        CGLIB$printAA$0$Proxy = MethodProxy.create(clazz2, clazz, "(Ljava/lang/String;)V", "printAA", "CGLIB$printAA$0");
    }

    final void CGLIB$printAA$0(String string) {
        super.printAA(string);
    }

    final boolean CGLIB$equals$1(Object object) {
        return super.equals(object);
    }

    final String CGLIB$toString$2() {
        return super.toString();
    }

    final int CGLIB$hashCode$3() {
        return super.hashCode();
    }

    final Object CGLIB$clone$4() throws CloneNotSupportedException {
        return super.clone();
    }

    public static MethodProxy CGLIB$findMethodProxy(Signature signature) {
        String string = ((Object)signature).toString();
        switch (string.hashCode()) {
            case -508378822: {
                if (!string.equals("clone()Ljava/lang/Object;")) break;
                return CGLIB$clone$4$Proxy;
            }
            case 1250269330: {
                if (!string.equals("printAA(Ljava/lang/String;)V")) break;
                return CGLIB$printAA$0$Proxy;
            }
            case 1826985398: {
                if (!string.equals("equals(Ljava/lang/Object;)Z")) break;
                return CGLIB$equals$1$Proxy;
            }
            case 1913648695: {
                if (!string.equals("toString()Ljava/lang/String;")) break;
                return CGLIB$toString$2$Proxy;
            }
            case 1984935277: {
                if (!string.equals("hashCode()I")) break;
                return CGLIB$hashCode$3$Proxy;
            }
        }
        return null;
    }

    private static final void CGLIB$BIND_CALLBACKS(Object object) {
        block2: {
            Object object2;
            AAService$$EnhancerBySpringCGLIB$$97a6e1d6 aAService$$EnhancerBySpringCGLIB$$97a6e1d6;
            block3: {
                aAService$$EnhancerBySpringCGLIB$$97a6e1d6 = (AAService$$EnhancerBySpringCGLIB$$97a6e1d6)object;
                if (aAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$BOUND) break block2;
                aAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$BOUND = true;
                object2 = CGLIB$THREAD_CALLBACKS.get();
                if (object2 != null) break block3;
                object2 = CGLIB$STATIC_CALLBACKS;
                if (CGLIB$STATIC_CALLBACKS == null) break block2;
            }
            Callback[] callbackArray = (Callback[])object2;
            AAService$$EnhancerBySpringCGLIB$$97a6e1d6 aAService$$EnhancerBySpringCGLIB$$97a6e1d62 = aAService$$EnhancerBySpringCGLIB$$97a6e1d6;
            aAService$$EnhancerBySpringCGLIB$$97a6e1d62.CGLIB$CALLBACK_6 = (MethodInterceptor)callbackArray[6];
            aAService$$EnhancerBySpringCGLIB$$97a6e1d62.CGLIB$CALLBACK_5 = (MethodInterceptor)callbackArray[5];
            aAService$$EnhancerBySpringCGLIB$$97a6e1d62.CGLIB$CALLBACK_4 = (Dispatcher)callbackArray[4];
            aAService$$EnhancerBySpringCGLIB$$97a6e1d62.CGLIB$CALLBACK_3 = (NoOp)callbackArray[3];
            aAService$$EnhancerBySpringCGLIB$$97a6e1d62.CGLIB$CALLBACK_2 = (NoOp)callbackArray[2];
            aAService$$EnhancerBySpringCGLIB$$97a6e1d62.CGLIB$CALLBACK_1 = (MethodInterceptor)callbackArray[1];
            aAService$$EnhancerBySpringCGLIB$$97a6e1d62.CGLIB$CALLBACK_0 = (MethodInterceptor)callbackArray[0];
        }
    }

    @Override
    public Callback getCallback(int n) {
        Callback callback;
        AAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$BIND_CALLBACKS(this);
        AAService$$EnhancerBySpringCGLIB$$97a6e1d6 aAService$$EnhancerBySpringCGLIB$$97a6e1d6 = this;
        switch (n) {
            case 0: {
                callback = aAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$CALLBACK_0;
                break;
            }
            case 1: {
                callback = aAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$CALLBACK_1;
                break;
            }
            case 2: {
                callback = aAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$CALLBACK_2;
                break;
            }
            case 3: {
                callback = aAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$CALLBACK_3;
                break;
            }
            case 4: {
                callback = aAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$CALLBACK_4;
                break;
            }
            case 5: {
                callback = aAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$CALLBACK_5;
                break;
            }
            case 6: {
                callback = aAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$CALLBACK_6;
                break;
            }
            default: {
                callback = null;
            }
        }
        return callback;
    }

    @Override
    public Callback[] getCallbacks() {
        AAService$$EnhancerBySpringCGLIB$$97a6e1d6.CGLIB$BIND_CALLBACKS(this);
        AAService$$EnhancerBySpringCGLIB$$97a6e1d6 aAService$$EnhancerBySpringCGLIB$$97a6e1d6 = this;
        return new Callback[]{this.CGLIB$CALLBACK_0, this.CGLIB$CALLBACK_1, this.CGLIB$CALLBACK_2, this.CGLIB$CALLBACK_3, this.CGLIB$CALLBACK_4, this.CGLIB$CALLBACK_5, this.CGLIB$CALLBACK_6};
    }
}
*/
