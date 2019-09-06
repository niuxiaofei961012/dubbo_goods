package com.nxf.start;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
	public static void main(String[] args) throws IOException {
		System.out.println("准备启动商品生产者");
		@SuppressWarnings({ "unused", "resource" })
		ClassPathXmlApplicationContext ca = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("商品生产者启动成功");
		System.in.read();
	}
}
