package kr.co.itcen.hellospring.controller;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

//Controller pojo
@Controller
public class HelloController {

	//이것만 해당되는 스프링!!!!
	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}

	@RequestMapping("/useradd")
	public String useradd() {
		return "useradd";
	}

	@RequestMapping("/hello2")
	public ModelAndView hello2() {
		String data = "Hello world";

		ModelAndView mav = new ModelAndView();
		mav.addObject("data", data);
		mav.setViewName("hello");
		
		
		
		return mav;
	}

	@RequestMapping("/hello3")
	public String hello3(Model model) {
		String data = "Hello world3";

		model.addAttribute("data", data);

		return "hello";
	}

	@RequestMapping("/hello4")
	public String hello4(@RequestParam(value = "email", required = true, defaultValue = "") String email,
			@RequestParam(value = "age", required = true, defaultValue = "0") int age, Model model) {

		model.addAttribute("email", email);
		model.addAttribute("age", age);

		return "hello";
	}

	@RequestMapping("/hello5")
	public String hello5(@ModelAttribute User user, Model model) {

		System.out.println(user);

		model.addAttribute("email", user.getEmail());
		model.addAttribute("age", user.getAge());

		return "hello";
	}

	// 결코 좋은 코드가 아니다.
	// 기술침투이다.
	// Apache에 종속되는 기술침투 이다.
//	@RequestMapping("/hello6")
//	public void hello6(HttpServletRequest request,
//			HttpServletResponse response,Writer out,
//			Model model) throws ServletException, IOException {
//
//		//request.getRequestDispatcher("/WEB-INF/views/hello.jsp").forward(request, response);
//		out.write("<h1>Hello World</h1>");
//	}
	
	@ResponseBody					//enableMvc에서 자동으로 만들어 준것!!!
	@RequestMapping("/hello7")
	public String hello7() {
		return ("<h1>Hello World</h1>");
	}

}
