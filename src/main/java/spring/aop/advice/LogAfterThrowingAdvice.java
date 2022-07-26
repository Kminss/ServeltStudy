package spring.aop.advice;

import org.springframework.aop.ThrowsAdvice;

public class LogAfterThrowingAdvice implements ThrowsAdvice {
    public void afterThrowing(IllegalArgumentException e) throws Throwable {
        System.out.println("예외 발생함 ㅋㅋ");
    }
    
}
