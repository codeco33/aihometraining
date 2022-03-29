package aihometraining.team.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import aihometraining.team.dto.EClassCategoryLarge;
import aihometraining.team.dto.EClassCategoryMedium;
import aihometraining.team.dto.EClassCategorySmall;
import aihometraining.team.mapper.EClassCategoryMapper;
import aihometraining.team.service.EClassCategoryService;

@Controller
@RequestMapping("/eClass/eClassConfig")
public class EClassCategoryController {
	
	
	private static final Logger log = LoggerFactory.getLogger(EClassCategoryController.class);

	
	
	//DI 의존성 주입 생성자 메소드 주입방식
	private EClassCategoryService eClassCategoryService;
	private EClassCategoryMapper eClassCategoryMapper;
	
	public EClassCategoryController(EClassCategoryService eClassCategoryService, EClassCategoryMapper eClassCategoryMapper) {
		this.eClassCategoryService = eClassCategoryService;
		this.eClassCategoryMapper = eClassCategoryMapper;
	}
	
	@GetMapping("/eClassCategoryList")
	public String eClassCategoryList(Model model
							   ,@RequestParam(value="searchKey", required = false) String searchKey
							   ,@RequestParam(value="searchValue", required = false) String searchValue) {
		
		
		log.info("운동 클래스 카테고리 목록 요청");
		log.info("searchValue:{}", searchValue);
		
		if(searchKey != null) {
			if("eClassCategoryLargeCode".equals(searchKey)) {
				searchKey = "eClassCategoryLargeCode";
			}else if("eClassCategoryLargeName".equals(searchKey)) {
				searchKey = "eClassCategoryLargeName";
			}
		}
		if(searchKey != null) {
			if("eClassCategoryMediumCode".equals(searchKey)) {
				searchKey = "eClassCategoryMediumCode";
			}else if("eClassCategoryMediumName".equals(searchKey)) {
				searchKey = "eClassCategoryMediumName";
			}
		}
		if(searchKey != null) {
			if("eClassCategoryLargeCode".equals(searchKey)) {
				searchKey = "eClassCategorySmallCode";
			}else if("eClassCategorySmallName".equals(searchKey)) {
				searchKey = "eClassCategorySmallName";
			}
		}
		
		List<EClassCategoryLarge> eClassCategoryLargeList = eClassCategoryService.getEClassCategoryLargeList(searchKey, searchValue);
		List<EClassCategoryMedium> eClassCategoryMediumList = eClassCategoryService.getEClassCategoryMediumList(searchKey, searchValue);
		List<EClassCategorySmall> eClassCategorySmallList = eClassCategoryService.getEClassCategorySmallList(searchKey, searchValue);

		model.addAttribute("leftMenuList", "운동 클래스");
		model.addAttribute("title", "운동 클래스 카테고리 관리");
		model.addAttribute("eClassCategoryLargeList", eClassCategoryLargeList);
		model.addAttribute("eClassCategoryMediumList", eClassCategoryMediumList);
		model.addAttribute("eClassCategorySmallList", eClassCategorySmallList);
		
		return "eClass/eClassConfig/eClassCategoryList";
	}
	
	
	
	
		

}
