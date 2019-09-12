package cn.hill4j.rpcext.demo.dubbo.api;

import cn.hill4j.rpcext.core.rpcext.dubbo.annotation.RpcApi;

/**
 * 2019/8/28 19:31 <br>
 * Description: SayHello
 *
 * @author hillchen
 */
@RpcApi
public interface SayHello {
    /**
     * 测试方法
     * @return 返回测试内容
     */
    String sayHello();
}
