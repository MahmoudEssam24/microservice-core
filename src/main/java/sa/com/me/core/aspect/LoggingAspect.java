// package sa.com.me.core.aspect;

// import org.aspectj.lang.JoinPoint;
// import org.aspectj.lang.annotation.AfterReturning;
// import org.aspectj.lang.annotation.AfterThrowing;
// import org.aspectj.lang.annotation.Aspect;
// import org.aspectj.lang.annotation.Before;
// import org.springframework.stereotype.Component;

// import lombok.extern.slf4j.Slf4j;

// @Aspect
// @Slf4j
// @Component
// public class LoggingAspect {

//     @Before("sa.com.me.core.aspect.dataLayerExecution()")
//     public void trace(JoinPoint joinPoint){
//         log.debug("Method called: {}", joinPoint.getStaticPart().getSignature().toString());
//     }

//     @AfterThrowing(pointcut = "sa.com.me.core.aspect.businessLayerExecution()", throwing = "e")
//     public void logException(RuntimeException e){
//         log.error("Exception Thrown: {}", e);
//     }

//     @AfterReturning(pointcut ="sa.com.me.core.aspect.dataLayerExecution()", returning = "result")
//     public void logResult(JoinPoint joinPoint, Object result){
//         log.debug("Method {} returned: {}", joinPoint.getStaticPart().getSignature().toString() ,result);
//     }
// }