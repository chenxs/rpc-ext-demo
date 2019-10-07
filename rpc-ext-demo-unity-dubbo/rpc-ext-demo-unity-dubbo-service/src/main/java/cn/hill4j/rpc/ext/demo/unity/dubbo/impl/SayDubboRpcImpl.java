package cn.hill4j.rpc.ext.demo.unity.dubbo.impl;
import cn.hill4j.rpc.ext.demo.unity.dubbo.api.SayDubboRpc;
import cn.hill4j.rpc.ext.demo.unity.dubbo.api.SayHello;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * 2019/9/18 23:10<br>
 * Description: 服务测试实现
 *
 * @author hillchen
 */
@Component("sayDubboRpcImpl")
@Service
public class SayDubboRpcImpl implements SayDubboRpc, SayHello {

    @Override
    public String say() {
        return System.currentTimeMillis() + ":hello dubbo rpc";
    }

    @Override
    public String sayHello() {
        return System.currentTimeMillis() + ":hello";
    }
}
