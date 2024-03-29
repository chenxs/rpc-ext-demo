package cn.hill4j.rpcext.demo.dubbo.client.test.spingext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 〈一句话功能简述〉<br>
 * Description: SayHelloClientTest
 *
 * @author hillchen
 * @create 2019/8/29 10:43
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringApplicationTest.class)
public class SpringContextTest {
    @Resource
    private TestBean testBean;
    @Test
    public void sayHelloTest(){

        System.out.println("testBean.say");
    }
}
