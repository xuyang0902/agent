package com.practice.agent;

import java.lang.instrument.Instrumentation;


/**
 * System.out.println("Hello from agent!");
 * System.out.println(" java -javaagent:/path/to/agent.jar your.main.Clazz");
 *
 * @author xu.qiang
 * @date 2018-11-07
 */
public class Agent {

    public static void premain(String args, Instrumentation instrumentation) {

        System.out.println("hello My java agent args: " + args);


        ClassInfoList classInfoList = new ClassInfoList();
        instrumentation.addTransformer(classInfoList);

    }
}