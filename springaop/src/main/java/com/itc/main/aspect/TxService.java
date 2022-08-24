package com.itc.main.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TxService {

	@Pointcut("execution(public * com.itc.main.ProductBL.*())")
	 public void p1() {}
	
	@Before("p1()")//JointPoint
	public void beginTx() {
		System.out.println("start tx....");
	}
	 
	@After("p1()")
	public void commitTx() {
		System.out.println("commit tx....");
	}
}
