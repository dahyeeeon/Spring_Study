package com.gura.spring01;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home") //.do 생략 가능
	public String gura(HttpServletRequest request) {
		//view 페이지에 전달할 Model
		List<String> news=new ArrayList<>();
		news.add("안녕하세요");
		news.add("오늘 Spring Framework 시작입니다.");
		news.add("어쩌구...");
		
		request.setAttribute("news", news);
		/*view page의 정보를 문자열로 리턴하기
		 * 
		 * prefix: /WEB-INF/views/
		 * 
		 * suffix:.jsp
		 * 
		 * "WEB-INF/views/"+"home"+".jsp"
		 * 
		 * 따라서 "/WEB-INF/views/home.jsp"로 사용되어진다.
		 * 
		 * actionforward가 필요없음
		 * */
		return "home";
	}
	
}
