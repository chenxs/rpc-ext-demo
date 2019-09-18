package cn.hill4j.rpcext.demo.dubbo.service.impl;

import cn.hill4j.rpcext.demo.dubbo.api.other.SayWhat;

/**
 * 2019/8/28 19:33 <br>
 * Description: SayHelloImpl
 *
 * @author hillchen
 */
public class SayWhatImpl implements  SayWhat {
    @Override
    public String sayWhat() {
        return System.currentTimeMillis() + ": what";
    }
}
