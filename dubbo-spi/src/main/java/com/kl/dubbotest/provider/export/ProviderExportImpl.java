package com.kl.dubbotest.provider.export;

/**
 * @author songhengliang
 * @date 2019/7/4
 */
public class ProviderExportImpl implements ProviderExport {

    @Override
    public String providerExport(String name) {
        System.out.println("providerExport 。。。");
        return "providerExport 。。。";
    }
}
