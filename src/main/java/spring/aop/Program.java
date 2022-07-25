package spring.aop;

import spring.aop.entity.Exam;
import spring.aop.entity.NewlecExam;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Program {
    public static void main(String[] args) {
        //spring 사용 않고 proxy를 이용한 AOP 구현
        Exam exam = new NewlecExam(1, 1, 1, 1);

        Exam proxy = (Exam) Proxy.newProxyInstance(NewlecExam.class.getClassLoader(), new Class[]{Exam.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                long start = System.currentTimeMillis();
                Object result = method.invoke(exam, args);
                long end = System.currentTimeMillis();
                String message = (end - start) + "ms 시간이 걸렸습니다.";
                System.out.println(message);

                return result;
            }
        });
        //prxy를 이용한 시간 측정
        System.out.printf("total is %d \n ", proxy.total());
        //기본 total 서비스
       // System.out.printf("total is %d \n", exam.total());
    }



}
