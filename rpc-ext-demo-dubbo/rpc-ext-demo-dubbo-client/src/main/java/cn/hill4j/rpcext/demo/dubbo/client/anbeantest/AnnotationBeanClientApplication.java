package cn.hill4j.rpcext.demo.dubbo.client.anbeantest;

import cn.hill4j.rpcext.core.rpcext.unity.dubbo.annotation.EnableRpcReferences;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * 2019/8/28 19:23 <br>
 * Description: SerApplication
 *
 * @author hillchen
 */
@SpringBootApplication
@ImportResource({ "classpath:/dubboConfig.xml"})
@EnableRpcReferences(orgBasePackages = {"cn.hill4j.rpcext.demo.dubbo"},referenceAppNames = {"api-test"})
public class AnnotationBeanClientApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(AnnotationBeanClientApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }
}
