package com.Nghiem.tgu;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;

import com.Nghiem.tgu.Repository.KhaoSatRepository;

@SpringBootApplication
public class NghiemKSspringApplication {

	private static BeanFactory context;

	public static void main(String[] args) {
		SpringApplication.run(NghiemKSspringApplication.class, args);
		

	}

}
