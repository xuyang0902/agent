package com.practice.agent;


import java.lang.instrument.Instrumentation;


/**
 * 在main方法之前 Instrumentation 可以对class做自己想做的操作
 * <p>
 * java -javaagent:/path/to/agent.jar your.main.Clazz
 *
 * @author xu.qiang
 * @date 2018-11-07
 */
public class PreMainAgent {

    public static void premain(String args, Instrumentation instrumentation) {

        System.out.println("Hello PreMainAgent args: " + args);

        instrumentation.addTransformer(new Transformer());
    }
}