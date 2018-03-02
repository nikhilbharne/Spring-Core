package com.nt.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.WishMsgGenerator;

public class SetterInjectionTest {

    public static void main(String[] args){
    	ApplicationContext ctx=null;
        Object obj=null;
        WishMsgGenerator generator = null;
      //Resource res=null;
      //BeanFactory factory=null;
     
      //locate SpringBean cfgs file 
     // res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
      //create IOC container(BeanFacory)
     // factory=new XmlBeanFactory(res);
      //get Bean(Main Bean)
      //obj=factory.getBean("wish");
      //ApplicationContext IOC container
      ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
      
      //get container
      obj=ctx.getBean("wish");
      
      //type casting
      generator=(WishMsgGenerator)obj;
      //invoke b method
      System.out.println("Message:::"+generator.generateWishMsg("Nikhil"));
     
  }
    
}
