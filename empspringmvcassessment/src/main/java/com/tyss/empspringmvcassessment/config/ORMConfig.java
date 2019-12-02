package com.tyss.empspringmvcassessment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class ORMConfig {



		@Bean
		public LocalEntityManagerFactoryBean getBean() {//we are using this class to create entitymanagerfactory instead of 
			//we creating it we are telling spring to create it,this method is present in spring orm package
		
			LocalEntityManagerFactoryBean bean = new LocalEntityManagerFactoryBean();
			bean.setPersistenceUnitName("order-unit");
			return bean;
		}
	}


