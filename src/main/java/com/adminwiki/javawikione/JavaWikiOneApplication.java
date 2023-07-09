package com.adminwiki.javawikione;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
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
