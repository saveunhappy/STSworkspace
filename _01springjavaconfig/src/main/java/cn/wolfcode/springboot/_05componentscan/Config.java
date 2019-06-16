package cn.wolfcode.springboot._05componentscan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ComponentScan 自动的完成spring组件的扫描（默认情况下，@ComponentScan扫描被标注的类的对应的包及其子包中的所有类）
 * 
 *                推荐结构：作为主配置对象的类，一般把他放在代码的根目录下面（cn.wolfcode.springboot）
 * @author stef
 *
 */
@Configuration
@ComponentScan
public class Config {

}
