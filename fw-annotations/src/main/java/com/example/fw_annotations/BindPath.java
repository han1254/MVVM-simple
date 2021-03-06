package com.example.fw_annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author YangZhaoxin.
 * @since 2020/1/18 16:51.
 * email yangzhaoxin@hrsoft.net.
 */

@Target(ElementType.TYPE)   // 作用范围：放在类上
@Retention(RetentionPolicy.CLASS)   // 生命周期：编译时
public @interface BindPath {
    // 存入ARouter容器中的Activity类对象的key
    String value();
}

