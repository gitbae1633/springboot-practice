package ex04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;



/***
 * @SpringBootApplication 메타 어노테이션
 * 
 * +@SpringBootConfiguration: cf) ex01, ex02 
 * +@ComponentSacan : ex04 하부 패키지를 스캐닝한다.
 * +@EnableAutoConfiguration : 
 * 				1.MVC, AOP, Security, JPA 등을 자동 "default"(***미세 설정 필수***) 설정
 * 				2.발견된 Starter Depandency(Library) 기반으로 설정한다.
 * 				
 *
 */

@SpringBootConfiguration
@ComponentScan
public class MyApplication {
	public static void main(String[] args) {
		try(ConfigurableApplicationContext ac = SpringApplication.run(MyApplication.class, args)){}
	}
}
