package com.zm.aop;

import com.zm.bean.Logs;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.CodeSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 功能描述: mongodb 日志
 * @param:
 * @return:
 * @auther: 王博
 * @date: 2018/6/14 10:57
 */
@Aspect
@Component
public class AopMongdb {

    @Autowired
    private MongoTemplate mongoTemplate;

    private Long startTime;
    private Long endTime;

    @Pointcut("execution(* com.zm.service.*.*(..))args(JoinPoint joinPoint)")
    public void webLog() {
    }

    @Before("webLog()")
    public void deBefore(JoinPoint joinPoint) throws Throwable {
        // 接收到请求，记录请求内容
        // ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        //  HttpServletRequest request = attributes.getRequest();
        // 记录下请求内容
        //  url= request.getRequestURL().toString();
     /*   System.out.println("URL : " + request.getRequestURL().toString());
        System.out.println("HTTP_METHOD : " + request.getMethod());
        System.out.println("IP : " + request.getRemoteAddr());
        System.out.println("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        System.out.println("ARGS : " + Arrays.toString(joinPoint.getArgs()));*/
    /*    ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // 记录下请求内容
        System.out.println("URL : " + request.getRequestURL().toString());
        System.out.println("HTTP_METHOD : " + request.getMethod());
        System.out.println("IP : " + request.getRemoteAddr());*/


    }

    @AfterReturning(pointcut = "webLog()")
    public void doAfterReturning(JoinPoint jp) throws Throwable {
        endTime = new Date().getTime();
        System.out.println("后置调用");
        //Long time=(endTime-startTime)/1000;
        //类名
        String clazzName = null;
        try {
            clazzName = Class.forName(jp.getTarget().getClass().getName()).getSimpleName();
            //System.out.println("在类名为"+clazzName+"，方法名为"+jp.getSignature().getName()+"的方法运行时间为"+time+"秒");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //方法名
        String methodName = jp.getSignature().getName();

        Object[] paramValues = jp.getArgs();
        String[] paramNames = ((CodeSignature) jp.getSignature()).getParameterNames();
        String params = "";
        for (int i = 0; i < paramNames.length; i++) {
            params += paramNames[i] + ":" + paramValues[i] + ",";
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Logs logs = new Logs();
        logs.setParams(params);
        logs.setClazzName(clazzName);
        logs.setMethodName(methodName);
        logs.setTiem(sdf.format(new Date()));
        logs.setSetIsexception("正常");
        //System.out.println(retValue.toString());
       /*Quser q = (Quser)getRequest().getSession().getAttribute("login");
       Integer s = null;
       if(q != null){
           s = q.getHuiid();
       }
       logs.setUserid(s);*/
        mongoTemplate.insert(logs);
        System.out.println("后置通知执行.....");
    }

    @AfterThrowing(pointcut = "webLog()")
    public void throwss( JoinPoint jp) throws UnknownHostException {
        Object[] paramValues = jp.getArgs();
        String[] paramNames = ((CodeSignature) jp.getSignature()).getParameterNames();
        String params = null;
        for (int i = 0; i < paramNames.length; i++) {
            params += paramNames[i] + ":" + paramValues[i] + ",";
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Logs logs = new Logs();
        logs.setClazzName(jp.getSignature().getDeclaringTypeName());
        logs.setMethodName(jp.getSignature().getName());
        logs.setParams(params);
        logs.setTiem(sdf.format(new Date()));
        logs.setSetIsexception("异常");
        mongoTemplate.insert(logs);
        System.out.println("异常日志已储存");
        System.out.println("方法异常时执行.....");

      }

}