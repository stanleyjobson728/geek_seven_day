package com.demo.design.proxy;

import java.lang.reflect.Proxy;

/**
 * @Auther: ghost
 * @Date: 2019/11/20 19:18
 * @Description:
 */
public class Customer {

    public static void main(String[] args) {
        SubjectProxy subjectProxy = new SubjectProxy();
        subjectProxy.request();

    }


}
