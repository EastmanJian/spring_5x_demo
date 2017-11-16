package ej.spring.orm.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.log4j.Logger;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("BeansSpringOrmHibernate.xml");

        EventDAO eventDAO = (EventDAO) context.getBean("eventDataObj");
        eventDAO.writeReadRecords();
    }
}