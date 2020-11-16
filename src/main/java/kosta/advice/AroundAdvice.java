package kosta.advice;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 사전, 사후 처리 담당
 * */
public class AroundAdvice {
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("around의 사전 처리 중입니다....\n");
		//연결해주는 느낌..
		Object obj = joinPoint.proceed();
		
		System.out.println("around의 사후 처리 중입니다....\n");
		return obj;
	}
}
