package chapter2.soundsystem.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
//@Import({CdPlayerConfig.class})
@ImportResource("classpath:cd-config.xml")
public class SoundSystemConfig {

}
