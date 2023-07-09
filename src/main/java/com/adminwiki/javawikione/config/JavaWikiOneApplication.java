package com.adminwiki.javawikione.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

//@ComponentScan({"com.adminwiki", "com.testPackage"}) // 添加多个指定的包，皆可扫描
@ComponentScan("com.adminwiki") // 只扫描指定文件夹下的类
@SpringBootApplication // 里面有个包 ComponentScan 会扫描子类
public class JavaWikiOneApplication {

    private static final Logger LOG = LoggerFactory.getLogger(JavaWikiOneApplication.class);

    public static void main(String[] args) {
//        SpringApplication.run(JavaWikiOneApplication.class, args);

        SpringApplication app = new SpringApplication(JavaWikiOneApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("start success！！");
        LOG.info("地址: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
    }

}
