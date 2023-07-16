package com.karakalpak.lingo.service.impl;

import com.karakalpak.lingo.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
//@Service
public class TestServiceImpl implements TestService {

    @Override
    public void doNothing() {
        log.info("Doing nothing.");
    }
}
