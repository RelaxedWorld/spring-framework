package org.springframework.debug.service;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @Author: zsy 2022/2/14 10:45 上午
 * @Description:
 */
public class AService implements BaseService, BeanNameAware, InitializingBean {
	@Resource
	private BService bService;

	@Override
	public void print() {
		System.out.println("AService print");
	}

	public void init() {
		System.out.println("AService init");
	}

	public AService() {
		System.out.println("AService construct");
	}

	@PostConstruct
	private void postConstruct() {
		System.out.println("AService postConstruct");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("AService BeanNameAware");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("AService afterPropertiesSet");
	}
}
