package org.springframework.debug;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.debug.service.AService;

/**
 * @Author: zsy 2022/2/14 10:40 上午
 * @Description:
 */
@Configurable
@ComponentScan("org.springframework.debug")
public class DebugConfig {
	@Bean(initMethod = "init")
	public AService aService() {
		return new AService();
	}
}
