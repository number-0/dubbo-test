package com.kl.dubbotest.provider.export;

import com.alibaba.dubbo.common.bytecode.ClassGenerator;
import com.alibaba.dubbo.common.bytecode.NoSuchPropertyException;
import com.alibaba.dubbo.common.bytecode.Wrapper;
import java.util.Map;

public class Wrapper0 extends Wrapper implements ClassGenerator.DC {

    public static String[] pns;
    public static Map pts;
    public static String[] mns;
    public static String[] dmns;
    public static Class[] mts0;

    public String[] getPropertyNames() {
        return pns;
    }

    public boolean hasProperty(String paramString) {
        return pts.containsKey(paramString);
    }

    public Class getPropertyType(String paramString) {
        return (Class) pts.get(paramString);
    }

    public String[] getMethodNames() {
        return mns;
    }

    public String[] getDeclaredMethodNames() {
        return dmns;
    }

    public void setPropertyValue(Object paramObject1, String paramString, Object paramObject2) {
        try {
            com.kl.dubbotest.provider.export.ProviderExport localProviderExport = (com.kl.dubbotest.provider.export.ProviderExport) paramObject1;
        } catch (Throwable localThrowable) {
            throw new IllegalArgumentException(localThrowable);
        }
        throw new NoSuchPropertyException("Not found property \"" + paramString
                + "\" filed or setter method in class com.kl.dubbotest.provider.export.ProviderExport.");
    }

    public Object getPropertyValue(Object paramObject, String paramString) {
        try {
            com.kl.dubbotest.provider.export.ProviderExport localProviderExport = (com.kl.dubbotest.provider.export.ProviderExport) paramObject;
        } catch (Throwable localThrowable) {
            throw new IllegalArgumentException(localThrowable);
        }
        throw new NoSuchPropertyException("Not found property \"" + paramString
                + "\" filed or setter method in class com.kl.dubbotest.provider.export.ProviderExport.");
    }

    /**
     * 核心方法
     * @param paramObject
     * @param paramString
     * @param paramArrayOfClass
     * @param paramArrayOfObject
     * @return
     * @throws java.lang.reflect.InvocationTargetException
     */
    public Object invokeMethod(Object paramObject, String paramString, Class[] paramArrayOfClass,
            Object[] paramArrayOfObject) throws java.lang.reflect.InvocationTargetException {
        com.kl.dubbotest.provider.export.ProviderExport localProviderExport;
        try {
            //将接口实现类ProviderExportImpl对象赋值给localProviderExport
            localProviderExport = ((com.kl.dubbotest.provider.export.ProviderExport) paramObject);
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
        try {
            //根据传入的方法名paramString，方法参数，执行方法
            if ("providerExport".equals(paramString) && paramArrayOfClass.length == 1) {
                localProviderExport.providerExport((java.lang.String) paramArrayOfObject[0]);
                return "providerExport 。。。";
            }
        } catch (Throwable e) {
            throw new java.lang.reflect.InvocationTargetException(e);
        }
        throw new com.alibaba.dubbo.common.bytecode.NoSuchMethodException("Not found method \"" + paramString
                + "\" in class com.kl.dubbotest.provider.export.ProviderExport.");
    }

}