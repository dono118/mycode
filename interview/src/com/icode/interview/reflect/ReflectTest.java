package com.icode.interview.reflect;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author Unicorn
 * @create 2019-10-02 15:41
 */
public class ReflectTest {

    public static void main(String[] args) throws Exception {
        // 1. 加载配置文件
        // 1.1 创建 Properties 对象
        Properties pro = new Properties();
        // 1.2 加载配置文件, 转换为一个集合
        // 1.2.1 获取 class 目录下的配置文件
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("pro.properties");
        pro.load(inputStream);

        // 2. 获取配置文件中定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        // 3. 加载该类进内存
        Class clazz = Class.forName(className);
        // 4. 创建对象
        Object obj = clazz.newInstance();
        // 5. 获取方法对象
        Method method = clazz.getMethod(methodName);
        // 6. 执行方法
        method.invoke(obj);
    }

}
