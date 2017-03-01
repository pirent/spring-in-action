package chapter1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import chapter1.knights.BraveKnight;
import chapter1.knights.Knight;
import chapter1.quests.Quest;
import chapter1.quests.SlayDragonQuest;

@Configuration
public class KnightConfig {
	
	@Bean
	public Knight knight() {
		return new BraveKnight(quest());
	}

	@Bean
	public Quest quest() {
		return new SlayDragonQuest(System.out);
	}
}
