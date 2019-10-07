package cn.hill4j.rpc.ext.demo.unity.dubbo.api;

import cn.hill4j.rpcext.core.rpcext.dubbo.annotation.RpcApi;

/**
 * 2019/9/18 23:08 <br>
 * Description: 服务测试接口
 *
 * @author hillchen
 */
@RpcApi(timeout = 1000,retries = 3)
public interface SayHello {
    String sayHello();
}
