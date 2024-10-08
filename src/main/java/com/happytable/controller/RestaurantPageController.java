package com.happytable.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.happytable.domain.Criteria;
import com.happytable.domain.PageDTO;
import com.happytable.domain.RestaurantVO;
import com.happytable.service.MenuService;
import com.happytable.service.OperationsService;
import com.happytable.service.RestaurantService;
import com.happytable.service.SalesService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequestMapping("/restaurant/*")
@AllArgsConstructor
public class RestaurantPageController { // jsp 페이지를 불러오는 경로만 정의

	private RestaurantService serviceRest;
	private OperationsService serviceOper;
	private MenuService serviceMenu;

	@GetMapping("/register") // http://localhost/restaurant/register
	public void register() {
		log.info("RestaurantController.register() 실행-------");
	}
	
	@GetMapping("/login") // http://localhost/restaurant/login
	public void login() {
		log.info("RestaurantController.login() 실행-------");
	}
	
	@GetMapping("/reginfo") // http://localhost/restaurant/reginfo
	public void reginfo() {
		log.info("RestaurantController.reginfo() 실행-------");
	}
	
	@GetMapping("regmenu") // http://localhost/restaurant/regmenu
	public void regmenu() {
		log.info("RestaurantController.regmenu() 실행-------");
	}
	
	@GetMapping("/myinfo") // http://localhost/restaurant/myinfo
	public void myinfo() {
		log.info("RestaurantController.myinfo() 실행-------");
	}
	
	@GetMapping("/myoper") // http://localhost/restaurant/myoper
	public void myoper() {
		log.info("RestaurantController.myoper() 실행-------");
	}
	
	@GetMapping("/mymenu") // http://localhost/restaurant/myoper
	public void mymenu() {
		log.info("RestaurantController.mymenu() 실행-------");
	}
	
	/*
	 * @GetMapping("/list") public void list(Model model) {
	 * model.addAttribute("list", serviceRest.getList()); log.info("list: " +
	 * model); }
	 */
	
	//회원가입
	@PostMapping("/register")
	public String regiRest(RestaurantVO rest, RedirectAttributes rttr) {
		String result = "";
		int cnt = serviceRest.register(rest);
		if(cnt == 1) { //등록성공
			result = "redirect:/restaurant/myrestaurant" ;
			rttr.addFlashAttribute("result", rest.getResNum());
		}else {
			result = "redirect:/restaurant/register";
			rttr.addFlashAttribute("error", "가입오류. 관리자에게 문의하세요.");
		}

		return result;
	}



	///////////////////////////////////////////////////////////////////////////////////////////////////

	@GetMapping("/get")
	public void get(@RequestParam("resNum") String resNum, Model model) {
		log.info(resNum);
		model.addAttribute("resVO", serviceRest.get(resNum));
		model.addAttribute("operVO", serviceOper.get(resNum));
		model.addAttribute("menuList", serviceMenu.getList(resNum));
	}

}