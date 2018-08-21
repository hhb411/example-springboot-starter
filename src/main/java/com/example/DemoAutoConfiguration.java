package com.example;

import com.example.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by hb on 2018/8/21.
 */
@Configuration
@ConditionalOnClass(DemoService.class)
@EnableConfigurationProperties(DemoProperties.class)
public class DemoAutoConfiguration {
    private DemoProperties demoProperties;

    @Autowired
    public DemoAutoConfiguration(DemoProperties demoProperties) {
        this.demoProperties = demoProperties;
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "demo", value="enabled", havingValue = "true")
    public DemoService demoService() {
        return new DemoService(demoProperties.getPrefix(), demoProperties.getSuffix());
    }
}
