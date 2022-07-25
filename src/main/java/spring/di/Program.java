package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.di.config.NewlecAppConfig;
import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;

import java.util.Iterator;
import java.util.List;

public class Program {

    public static void main(String[] args) {
		
        ApplicationContext context = new AnnotationConfigApplicationContext(NewlecAppConfig.class);
        ExamConsole console = context.getBean(ExamConsole.class);
        console.print();



    }

}
