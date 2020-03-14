package springexamples;

import org.springframework.beans.factory.BeanFactory; 

import org.springframework.beans.factory.xml.XmlBeanFactory; 

import org.springframework.core.io.*; 

 

public class Test { 

    public static void main(String[] args) { 

         

        Resource r=new ClassPathResource("dep.xml"); 

        BeanFactory factory=new XmlBeanFactory(r); 

         

        Emp s=(Emp)factory.getBean("e"); 

        s.Display(); 

         

    } 

} 