package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

//	@Pointcut("execution(* aop.UniLibrary.*(..))")
//	private void allMethodsFromUniLibrary() {}
//
//	@Pointcut("execution (public void aop.UniLibrary.returnMagazine())")
//	private void returnMagazineFromUniLibrary() {}
//
//	@Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//	private void allMethodsExceptReturnMagazineFromUniLibrary() {}
//
//
//	@Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//	private void beforeAllMethodsExceptReturnMagazineAdvice() {
//		System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: writing Log #4");
//	}


//	@Pointcut("execution(* aop.UniLibrary.get*())")
//	private void allGetMethodsFromUniLibrary() {
//	}
//
//	@Pointcut("execution(* aop.UniLibrary.return*())")
//	private void allReturnMethodsFromUniLibrary() {
//	}
//
//	@Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//	private void allGetAndReturnMethodsFromUniLibrary() {
//	}
//
//
//	@Before("allGetMethodsFromUniLibrary()")
//	public void beforeGetLoggingAdvice() {
//		System.out.println("beforeGetLoggingAdvice: writing Log #1.");
//	}
//
//	@Before("allReturnMethodsFromUniLibrary()")
//	public void beforeReturnLoggingAdvice() {
//		System.out.println("beforeReturnLoggingAdvice: writing Log #2.");
//	}
//
//	@Before("allGetAndReturnMethodsFromUniLibrary()")
//	public void beforeGetAndReturnLoggingAdvice() {
//		System.out.println("allGetAndReturnMethodsFromUniLibrary: writing Log #3.");
//	}


	@Before("aop.aspects.MyPointcuts.allGetMethods()")   /* aop.UniLibrary.getBook() */
	public void beforeGetLoggingAdvice() {
		System.out.println("beforeGetBookAdvice: логирование попытки получить книгу или журнал.");
	}

//	@Before("execution(* returnBook())")
//	public void beforeReturnBookAdvice() {
//		System.out.println("beforeGetBookAdvice: попытка вернуть книгу или журнал.");
//	}
}