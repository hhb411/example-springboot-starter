package com.example;

import com.example.service.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by hb on 2018/8/21.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoServiceTest {
    @Autowired
    private DemoService demoService;

    @Test
    public void wrap() throws Exception {
        System.out.println(demoService.wrap("ccc"));
    }

}
