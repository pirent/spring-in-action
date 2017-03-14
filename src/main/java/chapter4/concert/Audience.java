package chapter4.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	
	@Pointcut("execution(** chapter4.concert.Performance.perform(..))")
	public void performance() {}
	
	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint jp) {
		try {
			System.out.println("Silencing cell phones");
			System.out.println("Taking seat");
			jp.proceed();
			System.out.println("CLAP CLAP CLAP!!");
		}
		catch (Throwable e) {
			System.out.println("Demanding a refund");
		}
	}
}
