package cn.hill4j.rpcext.demo.dubbo.api.other;

import cn.hill4j.rpcext.core.rpcext.dubbo.annotation.RpcApi;

/**
 *  2019/8/31 17:33 <br>
 * Description: SayWhy
 *
 * @author hillchen
 */
@RpcApi
public interface SayWhat {
    /**
     *
     * @return what
     */
    String sayWhat();
}
