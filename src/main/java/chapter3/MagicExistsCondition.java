package chapter3;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MagicExistsCondition implements Condition {

	private static final String TRUE = "true";

	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		Environment env = context.getEnvironment();
		String magicalEnv = env.getProperty("magicalEnv");
		return magicalEnv != null && TRUE.equals(magicalEnv);
	}

}
