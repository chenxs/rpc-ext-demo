package cn.hill4j.rpcext.demo.dubbo.service.impl;

import cn.hill4j.rpcext.demo.dubbo.api.other.SayWhat;
import cn.hill4j.rpcext.demo.dubbo.api.other.SayWhy;
import cn.hill4j.rpcext.demo.dubbo.api.SayHello;
import org.springframework.stereotype.Service;

/**
 * 2019/8/28 19:33 <br>
 * Description: SayHelloImpl
 *
 * @author hillchen
 */
@Service
public class SayHelloImpl extends SayWhatImpl implements SayHello, SayWhy{

    @Override
    public String sayHello() {
        return  System.currentTimeMillis() + ": hello";
    }

    @Override
    public String sayWhy() {
        return   System.currentTimeMillis() + ": why";
    }

    @Override
    public String sayWhat() {
        return System.currentTimeMillis() + ": what";
    }
}
