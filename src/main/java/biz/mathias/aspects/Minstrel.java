package biz.mathias.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Minstrel {

	@Before("execution(** biz.mathias.domain.BraveKnight.embarkOnQuest(..))")
	public void f() {
		System.out.println("h");
	}

	// @Pointcut("execution(** biz.mathias.domain.Knight.embarkOnQuest(..))")
	// public void embarkOnQuest1(){}
	//
	// @Before("embarkOnQuest1()")
	// public void beforeEmbarkOnQuest(){
	// System.out.println("before embarkOnQuest");
	// }
}
