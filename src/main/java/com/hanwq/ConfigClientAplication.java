package com.hanwq;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Description: ddconfigclient
 * Created by hanwq on 2019/5/17 15:02
 */
@SpringBootApplication
public class ConfigClientAplication {
    public static void main(String[] args){
        new SpringApplicationBuilder(ConfigClientAplication.class).web(true).run(args);
    }
}
