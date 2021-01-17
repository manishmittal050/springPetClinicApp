package com.mmittal.springPetClinicApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mmittal.springPetClinicApp.controller.MyController;

import net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable;

@SpringBootApplication
public class SpringPetClinicAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cfac = SpringApplication.run(SpringPetClinicAppApplication.class, args);
		
		MyController myctr = (MyController) cfac.getBean("myController");
		
		System.out.println(myctr.printStr());
		
	}

}
