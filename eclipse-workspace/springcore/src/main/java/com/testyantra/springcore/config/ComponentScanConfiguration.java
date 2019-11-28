package com.testyantra.springcore.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.testyantra.springcore.di")
public class ComponentScanConfiguration {

}
//this class just acts as a bean class as we write '@ComponentScan' and '@Configuration''