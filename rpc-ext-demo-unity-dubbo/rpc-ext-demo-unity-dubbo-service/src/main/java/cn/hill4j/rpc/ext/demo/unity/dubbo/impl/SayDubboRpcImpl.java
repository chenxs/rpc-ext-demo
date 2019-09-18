package cn.hill4j.rpc.ext.demo.unity.dubbo.impl;
import cn.hill4j.rpc.ext.demo.unity.dubbo.api.SayDubboRpc;
import org.springframework.stereotype.Component;

/**
 * 2019/9/18 23:10<br>
 * Description: 服务测试实现
 *
 * @author hillchen
 */
@Component
public class SayDubboRpcImpl implements SayDubboRpc{

    @Override
    public String say() {
        return System.currentTimeMillis() + ":hello dubbo rpc";
    }
}
