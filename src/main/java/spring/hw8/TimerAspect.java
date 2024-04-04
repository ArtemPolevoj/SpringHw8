package spring.hw8;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimerAspect {
    @Around("execution(* spring.hw8.MyTimer.*(..))")
    public Object measureMethodExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long time = (System.currentTimeMillis() - start) / 1000;
        System.out.println("Метод " + joinPoint.getSignature().getName() +
                " из класса " + joinPoint.getSignature().getDeclaringTypeName() +
                " выполнился за " + time +
                " секунд.");
        return result;
    }
}