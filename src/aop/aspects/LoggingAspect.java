package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	@Before("execution(public void getBook(aop.Book))")   /* aop.UniLibrary.getBook() */
	public void beforeGetBookAdvice() {
		System.out.println("beforeGetBookAdvice: попытка получить книгу или журнал.");
	}

	@Before("execution(* returnBook())")
	public void beforeReturnBookAdvice() {
		System.out.println("beforeGetBookAdvice: попытка вернуть книгу или журнал.");
	}
}