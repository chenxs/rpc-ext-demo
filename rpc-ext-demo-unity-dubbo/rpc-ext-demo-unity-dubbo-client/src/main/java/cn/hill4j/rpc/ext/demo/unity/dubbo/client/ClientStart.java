package cn.hill4j.rpc.ext.demo.unity.dubbo.client;

import cn.hill4j.rpcext.core.rpcext.unity.dubbo.annotation.EnableRpcReferences;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * 2019/9/18 23:28<br>
 * Description: 测试启动类
 *
 * @author hillchen
 */
@SpringBootApplication
@EnableRpcReferences(basePackages = "cn.hill4j.rpc.ext.demo.unity.dubbo")
public class ClientStart {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ClientStart.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }
}
