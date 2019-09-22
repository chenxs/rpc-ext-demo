package cn.hill4j.rpc.ext.demo.unity.dubbo;

import cn.hill4j.rpcext.core.rpcext.unity.dubbo.annotation.EnableRpcProvider;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ImportResource;

/**
 * 2019/9/18 23:13<br>
 * Description: 服务启动接口
 *
 * @author hillchen
 */
@SpringBootApplication
@EnableRpcProvider( "demo-unity-dubbo")
@ImportResource("classpath:/dubboConfig.xml")
public class ServiceStart implements ApplicationRunner {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ServiceStart.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        while (true){
            Thread.sleep(100000);
        }
    }
}
