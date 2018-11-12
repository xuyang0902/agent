package com.practice.agent;


import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;


/**
 * jdk6新特性
 * <p>
 * 在 Java SE 5 的基础上，Java SE 6 针对这种状况做出了改进，开发者可以在 main 函数开始执行以后，
 * 再启动自己的 Instrumentation 程序。
 * java -javaagent:/path/to/agent.jar your.main.Clazz
 *
 * @author xu.qiang
 * @date 2018-11-07
 */
public class MainAgent {

    public static void agentmain(String args, Instrumentation instrumentation) throws UnmodifiableClassException {

        System.out.println("Hello MainAgent args: " + args);

    }
}