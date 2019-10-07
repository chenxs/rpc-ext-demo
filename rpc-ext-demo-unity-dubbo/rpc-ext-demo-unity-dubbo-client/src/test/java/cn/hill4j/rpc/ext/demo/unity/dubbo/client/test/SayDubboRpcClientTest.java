package cn.hill4j.rpc.ext.demo.unity.dubbo.client.test;

import cn.hill4j.rpc.ext.demo.unity.dubbo.client.ClientStart;
import cn.hill4j.rpc.ext.demo.unity.dubbo.client.SayDubboRpcClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 2019/9/18 23:33<br>
 * Description: 单元测试
 *
 * @author hillchen
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ClientStart.class)
public class SayDubboRpcClientTest {
    @Autowired
    private SayDubboRpcClient sayDubboRpcClient;

    @Test
    public void sayTest(){
        String say = sayDubboRpcClient.say();
        System.out.println(say);
    }
    @Test
    public void sayHelloTest(){
        String say = sayDubboRpcClient.sayHello();
        System.out.println(say);
    }
}
