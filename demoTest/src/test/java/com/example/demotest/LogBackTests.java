package com.example.demotest;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author QianChao
 * @user 19205
 * @date 2024/2/21
 */
@SpringBootTest
@Slf4j
public class LogBackTests {
    static Logger logger = (Logger) LoggerFactory.getLogger(LogBackTests.class);
    @Test
    void conetxtLoads(){
        logger.info("logback testing");
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);
    }
    @Test
    void logTest(){
        System.out.println(System.getProperty("user.home"));
        log.info("logging Test");
    }
}
