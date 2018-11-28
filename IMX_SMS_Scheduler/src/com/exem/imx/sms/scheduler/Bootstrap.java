package com.exem.imx.sms.scheduler;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Bootstrap {

	public static void main(String[] args) throws Exception {

		System.out.println("[USAGE] : java -jar IMX_SMS_Scheduler.jar");
		System.out.println("[USAGE] : config file IMXScheduler.xml : DB setting, SMS USER list");
		System.out.println("[USAGE] : config file quartz2.2.1.xml : Batch Schedule Setting");
		System.out.println("----------------------");
		System.out.println("----------------------");
		// ClassPathXmlApplicationContext는 java 내부에서 정의 해줄 때
		/* new ClassPathXmlApplicationContext("quartz2.2.1.xml"); */
		// FileSystemXmlApplicationContext는 외부의 파일을 불러와서 정의 해줄 때
		new FileSystemXmlApplicationContext("quartz2.2.1.xml");

	}

}
