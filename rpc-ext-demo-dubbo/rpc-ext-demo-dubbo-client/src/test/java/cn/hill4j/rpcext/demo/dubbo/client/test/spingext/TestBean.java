package cn.hill4j.rpcext.demo.dubbo.client.test.spingext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 〈一句话功能简述〉<br>
 * Description: TestBean
 *
 * @author hillchen
 * @create 2019/9/5 18:33
 */
public class TestBean implements InitializingBean {
    private Logger logger = LoggerFactory.getLogger(TestBeanDefinitionRegistryPostProcessor.class);
    @Autowired
    private TestParam testParam;
    public String say(){
        return testParam.say();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.error( ":InitializingBean.属性注入后初始化操作");
    }
}
