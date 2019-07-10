package com.kl.dubbotest.dubbospi;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.rpc.Protocol;
import com.alibaba.fastjson.JSON;
import java.io.IOException;
import java.net.URL;
import org.junit.Test;

/**
 * @author songhengliang
 * @date 2019/6/27
 */
public class SpiTest {
    public static void main(String[] args) throws IOException {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo.xml");

        ExtensionLoader<Protocol> extensionLoader = ExtensionLoader.getExtensionLoader(Protocol.class);
        Protocol protoco1 = extensionLoader.getExtension("myprotocol");

        System.out.println(protoco1.getDefaultPort());

    }


    @Test
    public void animalSpi() {
        ExtensionLoader<Animal> extensionLoader = ExtensionLoader.getExtensionLoader(Animal.class);
        Animal animal = extensionLoader.getExtension("cat");
        animal.say();

        animal = extensionLoader.getExtension("dog");
        animal.say();

    }


    @Test
    public void load() {
        ClassLoader classLoader = SpiTest.class.getClassLoader();
        String filename = "META-INF/dubbo/com.alibaba.dubbo.rpc.Protocol";
        URL url = classLoader.getResource(filename);
        System.out.println(JSON.toJSONString(url));

    }

}
