package chapter3.runtimevalueinjection;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import chapter2.soundsystem.BlankDisc;

@Configuration
@PropertySource("app.properties")
@ComponentScan
public class ExpressiveConfig {

	@Autowired
	private Environment env;

	@Bean
	public BlankDisc disc() {
		return new BlankDisc(env.getProperty("disc.title"), env.getProperty("disc.artist"), new ArrayList<String>());
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
