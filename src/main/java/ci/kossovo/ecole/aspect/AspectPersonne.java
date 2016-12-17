package ci.kossovo.ecole.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class AspectPersonne {
	private static final Logger log = LoggerFactory.getLogger(AspectPersonne.class);
	long t1,t2;
	@Pointcut("execution (* ci.kossovo.ecole.metier.IPersonneMetier.*(..))")
	public void test1(){}
	@Before("test1()")
	public void avant(JoinPoint thisJointPoint){
		log.info("---Debut-----");
		log.info("-------------------------------");
		log.info("Methode"+thisJointPoint.getSignature().getName());
		log.info("Argument"+Arrays.toString(thisJointPoint.getArgs()));
		t1=System.currentTimeMillis();
	}
	@After("test1()")
	public void apres(){
		t2 = System.currentTimeMillis();
		log.info("Durée"+(t1-t2));
		log.info("--------FIN-------");
		
	}
}
