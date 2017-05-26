package com.tan.test.common;

import java.util.Map;

import net.sf.json.JSONObject;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyLog {
	private static Logger logger = LoggerFactory.getLogger(MyLog.class);
	public void before(JoinPoint joinPoint){  
		System.out.println("前   %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
        //没有参数  
        if (joinPoint.getArgs() == null) {  
            return;  
        }  
        Object[] os = joinPoint.getArgs();  
        //获取类名  
        String className = joinPoint.getTarget().getClass().getSimpleName();  
        //获取方法名  
        String methodName = joinPoint.getSignature().getName();  
        String param = className + "." + methodName + ":";  
        for (int i = 0; i < os.length; i++) {  
            param += "参数[" + i + "]:" + os[i].toString();  
        }
        logger.info(param); 
        
	}  
	public void after(JoinPoint joinPoint){  
        //没有参数  
        if (joinPoint.getArgs() == null) {  
            return;  
        }  
        Object[] os = joinPoint.getArgs();  
        //获取类名  
        String className = joinPoint.getTarget().getClass().getSimpleName();  
        //获取方法名  
        String methodName = joinPoint.getSignature().getName();  
        String param = className + "." + methodName + ":";  
        for (int i = 0; i < os.length; i++) {  
            param += "参数[" + i + "]:" + os[i].toString();  
        }
        logger.info(param); 
        
	} 
    /**
     * 环绕通知 【即 被切函数执行前后执行该函数】
     * @param pjp
     * @return
     * @throws Throwable
     */
    public Object aroundMethod(ProceedingJoinPoint joinPoint) throws Throwable {
    	System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    	//没有参数  
        Object[] os = joinPoint.getArgs();  
        //获取类名  
        String className = joinPoint.getTarget().getClass().getSimpleName();  
        //获取方法名  
        String methodName = joinPoint.getSignature().getName();  
        String param = className + "." + methodName + ":";  
        if(os!=null){
        	for (int i = 0; i < os.length; i++) {  
                param += "参数[" + i + "]:" + os[i].toString();  
            }
        }
        logger.info(param); 
        
        Object object = joinPoint.proceed(); //获取被切函数的 返回值
        if("java.util.HashMap".equals(object.getClass().getName())){
        	Map map=(Map)object;
        	JSONObject jsonObj = JSONObject.fromObject(map); 
        	logger.info(jsonObj.toString()); 
        }
        
        return object;
    }
}
