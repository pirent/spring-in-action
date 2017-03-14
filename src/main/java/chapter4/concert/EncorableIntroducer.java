package chapter4.concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EncorableIntroducer {

	@DeclareParents(value = "chapter4.concert.Performance+", defaultImpl = DefaultEncorable.class)
	public static Encorable encorable;
}
