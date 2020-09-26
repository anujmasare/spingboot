package com.home.intercepter;

import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
@Component
public class MyCounterInterceptor extends HandlerInterceptorAdapter {
  private AtomicInteger counter = new AtomicInteger(0);

  @Override
  public boolean preHandle (HttpServletRequest request,
                            HttpServletResponse response,
                            Object handler) throws Exception {
	  System.out.println("ssssssssssssssssssssssss");

      request.setAttribute("visitorCounter", counter.incrementAndGet());
      return true;
  }
}