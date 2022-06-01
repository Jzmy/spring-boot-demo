package com.duing.util;

import org.jasypt.util.text.BasicTextEncryptor;

public class JasyptUtil {

    public static void main(String[] args) {
        BasicTextEncryptor basicTextEncryptor = new BasicTextEncryptor();
        basicTextEncryptor.setPassword("123456!@#");
       String username =  basicTextEncryptor.encrypt("root");
       String password = basicTextEncryptor.encrypt("root123");
        System.out.println(username);
        System.out.println(password);
    }
}
