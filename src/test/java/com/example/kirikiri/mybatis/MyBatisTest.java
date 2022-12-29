package com.example.kirikiri.mybatis;

import com.example.kirikiri.mapper.TimeMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class MyBatisTest {
    @Autowired
    private TimeMapper timeMapper;

    @Test
    public void getTimeTest(){
        log.info(timeMapper.getTime());
    }
}
