package com.Aniket;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/MyFilter")
public class MyFilter implements Filter {
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletResponse response, FilterChain chain {
	
		System.out.println("Before filter ");
//		..........
//		..........
		chain.doFilter(request, response);
		System.out.println("After servlet");
//		..........
//		..........
	}

	public void destroy() {
		
		
	}
	

}
