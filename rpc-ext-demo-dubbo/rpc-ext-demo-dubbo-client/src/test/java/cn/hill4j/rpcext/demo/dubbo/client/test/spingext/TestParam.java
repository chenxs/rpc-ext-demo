package cn.hill4j.rpcext.demo.dubbo.client.test.spingext;

import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br>
 * Description: TestBean
 *
 * @author hillchen
 * @create 2019/9/5 18:33
 */
@Component
public class TestParam {
    public String say(){
        return "hello";
    }
}
