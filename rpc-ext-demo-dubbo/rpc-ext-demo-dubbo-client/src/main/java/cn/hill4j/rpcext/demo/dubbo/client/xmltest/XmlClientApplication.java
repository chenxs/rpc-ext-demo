package cn.hill4j.rpcext.demo.dubbo.client.xmltest;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

/**
 * 2019/8/28 19:23 <br>
 * Description: SerApplication
 *
 * @author hillchen
 */
@SpringBootApplication
@ImportResource({ "classpath*:referenceConfig.xml"})
public class XmlClientApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(XmlClientApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }
}
