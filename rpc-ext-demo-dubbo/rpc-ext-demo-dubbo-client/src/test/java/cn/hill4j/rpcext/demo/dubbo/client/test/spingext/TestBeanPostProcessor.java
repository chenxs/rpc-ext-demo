package cn.hill4j.rpcext.demo.dubbo.client.test.spingext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 〈一句话功能简述〉<br>
 * Description: TestSmartInstantiationAwareBeanPostProcessor
 *
 * @author hillchen
 * @create 2019/9/5 16:18
 */
public class TestBeanPostProcessor implements BeanPostProcessor, ApplicationContextAware {
    private Logger logger = LoggerFactory.getLogger(TestBeanPostProcessor.class);

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof TestBean || bean instanceof TestBean2){
            logger.error("beanName:" + beanName + ":TestBeanPostProcessor.初始化前置操作");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof TestBean || bean instanceof TestBean2) {
            logger.error("beanName:" + beanName + ":TestBeanPostProcessor.初始化后置操作");
        }
        return bean;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        logger.error("TestBeanPostProcessor.setApplicationContext");
    }
}
