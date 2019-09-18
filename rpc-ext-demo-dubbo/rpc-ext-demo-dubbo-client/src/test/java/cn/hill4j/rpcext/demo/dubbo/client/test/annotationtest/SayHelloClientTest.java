package cn.hill4j.rpcext.demo.dubbo.client.test.annotationtest;

import cn.hill4j.rpcext.demo.dubbo.client.annotiontest.AnnotationSayWhyClient;
import cn.hill4j.rpcext.demo.dubbo.client.annotiontest.ClientApplication;
import cn.hill4j.rpcext.demo.dubbo.client.annotiontest.AnnotationSayHelloClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

/**
 * 〈一句话功能简述〉<br>
 * Description: SayHelloClientTest
 *
 * @author hillchen
 * @create 2019/8/29 10:43
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ClientApplication.class)
public class SayHelloClientTest {
    @Autowired
    private AnnotationSayHelloClient annotationSayHelloClient;

    @Test
    public void sayHelloTest(){
        String say = annotationSayHelloClient.sayHello("hill chen");
        Assert.hasLength(say,"need say something!");
        System.out.println(say);
    }
}
