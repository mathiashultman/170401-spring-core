package biz.mathias.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import biz.mathias.config.MainConfig;
import biz.mathias.domain.BraveKnight;
import biz.mathias.domain.Knight;
import biz.mathias.domain.Quest;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MainConfig.class)
public class BraveKnightTest {
	@Autowired
	private Knight braveKnight;

	@Test
	public void knightAutowired() {
		assertNotNull(braveKnight);
	}

	@Test
	public void knightShouldEmbarkOnQuest() {
		Quest mockQuest = mock(Quest.class);
		BraveKnight knight = new BraveKnight(mockQuest);
		knight.embarkOnQuest();
		verify(mockQuest, times(1)).embark();
	}
}
