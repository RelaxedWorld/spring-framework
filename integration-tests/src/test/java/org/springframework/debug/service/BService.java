package org.springframework.debug.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: zsy 2022/2/14 10:47 上午
 * @Description:
 */
@Service
@Lazy
public class BService implements BaseService {
	@Resource
	private AService aService;

	@Override
	public void print() {
		System.out.println("BService print");
	}

	public BService() {
		System.out.println("BService construct");
	}
}
