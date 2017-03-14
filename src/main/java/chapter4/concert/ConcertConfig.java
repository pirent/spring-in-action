package chapter4.concert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class ConcertConfig {

	@Bean
	public Audience audience() {
		return new Audience();
	}
	
	@Bean
	public Opera opera() {
		return new Opera();
	}
	
	@Bean
	public EncorableIntroducer encorableIntroducer() {
		return new EncorableIntroducer();
	}
}
