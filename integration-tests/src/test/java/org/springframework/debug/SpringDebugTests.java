package org.springframework.debug;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.debug.service.AService;

/**
 * @Author: zsy 2022/2/14 10:09 上午
 * @Description:
 */
public class SpringDebugTests {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(DebugConfig.class);
		ctx.refresh();
		AService bean = ctx.getBean(AService.class);
		bean.print();
	}
}
