package cn.hill4j.rpc.ext.demo.unity.dubbo.client;

import cn.hill4j.rpc.ext.demo.unity.dubbo.api.SayDubboRpc;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 2019/9/18 23:31<br>
 * Description: 测试客户端
 *
 * @author hillchen
 */
@Component
public class SayDubboRpcClient {
    @Resource
    private SayDubboRpc sayDubboRpc;

    public String say(){
        return sayDubboRpc.say();
    }
}
