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
		
		/*Exam exam = (Exam) new NewlecExam();
		//ExamConsole console = new InlineExamConsole(exam); // DI
		ExamConsole console = (ExamConsole) new GridExamConsole(exam);
		*/
        ApplicationContext context = new AnnotationConfigApplicationContext(NewlecAppConfig.class);
        //ExamConsole console = (ExamConsole) context.getBean("console");
        ExamConsole console = context.getBean(ExamConsole.class);
        console.print();

        //List<Exam> exams = (List<Exam>) context.getBean("exams");

        /*for (Iterator<Exam> iterator = exams.iterator(); iterator.hasNext(); ) {
            Exam exam = iterator.next();
            System.out.println(exam);
        }*/
    }

}
