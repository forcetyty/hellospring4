package kr.co.itcen.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@EnableAutoConfiguration	//Scan 시작 // 자기 밑에 있는 Configuration을 검색 // @Configuration을 찾아온다
@ComponentScan("kr.co.itcen.hellospring.controller")	// 설정작업
public class BootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}
	
}
