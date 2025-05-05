package com;


import org.apache.catalina.startup.Tomcat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class WebApplicationServer {

    private static final Logger log = LoggerFactory.getLogger(WebApplicationServer.class);
    public static void main(String[] args) throws Exception {
        String webappDirLocation = "webapps/";  // 루트 디렉터리 선정
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);                   // 포트 설정

        tomcat.addWebapp("/", new File(webappDirLocation).getAbsolutePath());
        log.info("configured app with basedir: {}", new File("./" + webappDirLocation).getAbsolutePath());

        tomcat.start();
        tomcat.getServer().await();
    }
}