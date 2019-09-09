package cn.hill4j.rpcext.demo.dubbo.client.test.spingext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 〈一句话功能简述〉<br>
 * Description: 测试beanFactoryPostProcessor
 *
 * @author hillchen
 * @create 2019/9/5 16:06
 */
public class TestBeanFactoryPostProcessor implements BeanFactoryPostProcessor, ApplicationContextAware {
    private Logger logger = LoggerFactory.getLogger(TestBeanFactoryPostProcessor.class);
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        logger.error("TestBeanFactoryPostProcessor:BeanDefinition信息重写");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        logger.error("TestBeanFactoryPostProcessor:setApplicationContext");
    }
}
