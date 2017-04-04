package biz.mathias.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import biz.mathias.domain.BraveKnight;
import biz.mathias.domain.Knight;

public class Main {

	// run with mvn exec:java
	public static void main(String[] args) {
		new Main().go();
	}

	public void go() {
		ApplicationContext context = new AnnotationConfigApplicationContext(biz.mathias.config.MainConfig.class);
		BraveKnight braveKnight = context.getBean(BraveKnight.class);
		braveKnight.embarkOnQuest();
		((ConfigurableApplicationContext) context).close();
	}
}
