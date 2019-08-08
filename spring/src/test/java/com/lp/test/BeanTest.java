package com.lp.test;

import com.lp.pojo.User;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author 000
 * @date 2019/8/8
 */
public class BeanTest {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("applicationContext.xml");
//        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext ("applicationContext.xml");
//        User user = (User) context.getBean ("user");
        XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource ("applicationContext.xml"));
        Object user = factory.getBean ("user");
        System.out.println (user);

    }
}
