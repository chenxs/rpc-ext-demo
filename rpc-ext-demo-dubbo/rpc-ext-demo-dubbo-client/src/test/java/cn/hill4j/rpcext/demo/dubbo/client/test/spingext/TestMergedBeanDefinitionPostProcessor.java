package cn.hill4j.rpcext.demo.dubbo.client.test.spingext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Objects;

/**
 * 〈一句话功能简述〉<br>
 * Description: testMergedBeanDefinitionPostProcessor
 *
 * @author hillchen
 * @create 2019/9/5 16:11
 */
public class TestMergedBeanDefinitionPostProcessor implements MergedBeanDefinitionPostProcessor, ApplicationContextAware {

    private Logger logger = LoggerFactory.getLogger(TestMergedBeanDefinitionPostProcessor.class);
    @Override
    public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
        if (Objects.equals(beanType,TestBean.class) ||  Objects.equals(beanType,TestBean2.class) ) {
            logger.error("beanName:" + beanName + ":TestMergedBeanDefinitionPostProcessor.实例化时加载扩展BeanDefinition并合并到spring上下文");
        }
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof TestBean ||  bean instanceof TestBean2) {
            logger.error("beanName:" + beanName + ":TestMergedBeanDefinitionPostProcessor.bean初始化前置操作");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof TestBean ||  bean instanceof TestBean2) {
            logger.error("beanName:" + beanName + ":TestMergedBeanDefinitionPostProcessor.bean初始化后置操作");
        }
        return bean;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        logger.error("TestMergedBeanDefinitionPostProcessor.setApplicationContext");
    }
}
