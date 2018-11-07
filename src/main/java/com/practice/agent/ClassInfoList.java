package com.practice.agent;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;


/**
 * @author xu.qiang
 * @date 2018-11-07
 */
public class ClassInfoList implements ClassFileTransformer {
    @Override
    public byte[] transform(//region other parameters
                            ClassLoader loader,
                            String className,
                            Class<?> classBeingRedefined,
                            ProtectionDomain protectionDomain,
                            //endregion
                            byte[] classfileBuffer) throws IllegalClassFormatException {


        return classfileBuffer;
    }
}