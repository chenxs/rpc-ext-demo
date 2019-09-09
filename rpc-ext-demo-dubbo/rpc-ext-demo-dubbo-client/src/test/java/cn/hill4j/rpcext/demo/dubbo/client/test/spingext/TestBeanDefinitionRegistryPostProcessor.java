package cn.hill4j.rpcext.demo.dubbo.client.test.spingext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 〈一句话功能简述〉<br>
 * Description: TestBeanDefinitionRegistryPostProcessor
 *
 * @author hillchen
 * @create 2019/9/5 20:36
 */
public class TestBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor, ApplicationContextAware {
    private Logger logger = LoggerFactory.getLogger(TestBeanDefinitionRegistryPostProcessor.class);
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        logger.error("TestBeanDefinitionRegistryPostProcessor:自定义spring标签扫描");
        registry.registerBeanDefinition("testParam",new RootBeanDefinition(TestParam.class));
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        logger.error("TestBeanDefinitionRegistryPostProcessor:BeanDefinition信息重写");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        logger.error("TestBeanDefinitionRegistryPostProcessor:setApplicationContext");
    }
}
