package com.roncoo.education.bean;

import com.roncoo.education.annotations.NeedTest;
import com.roncoo.education.aop.NaviUser;
import org.junit.Test;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

import java.lang.reflect.Method;

public class UserTest {
    @Test
    public void testAnnotations() {
        Class<User> userClass = User.class;
        Method[] methods = userClass.getMethods();

        for (Method method :
                methods) {
            NeedTest annotation = method.getAnnotation(NeedTest.class);
            if(annotation != null) {
                if(annotation.value()) {
                    System.out.println(method + "need test");
                } else {
                    System.out.println(method + "no need test");
                }
            }
        }
    }

    @Test
    public void testAop() {
        NaviUser target = new NaviUser();
        AspectJProxyFactory proxyFactory = new AspectJProxyFactory();

        proxyFactory.setTarget(target);
        proxyFactory.addAspect(User.class);
        NaviUser proxy = proxyFactory.getProxy();
        proxy.greetTo();
        proxy.serveTo();

    }
}
