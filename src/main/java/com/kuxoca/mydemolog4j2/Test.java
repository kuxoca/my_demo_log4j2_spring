package com.kuxoca.mydemolog4j2;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Log4j2
@Component
public class Test {
    @PostConstruct
    void test() {
        log.trace("trace");
        log.debug("debug");
        log.info("info");
        log.info("User {} connected from {}", "Alex", "HOME");
        log.warn("warn");
        log.error("error");
    }
}
