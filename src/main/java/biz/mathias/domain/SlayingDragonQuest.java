package biz.mathias.domain;

import org.springframework.stereotype.Component;

@Component
public class SlayingDragonQuest implements Quest{

	public void embark() {
		System.out.println("slaying a dragon-quest");
	}

}
