package aihometraining.team.diet.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import aihometraining.team.diet.mapper.DietMapper;
import aihometraining.team.diet.service.DietService;
import aihometraining.team.dto.DietBank;
import aihometraining.team.dto.DietMealLevelList;
import aihometraining.team.dto.DietNutrientList;
import aihometraining.team.dto.DietOnemealConnection;


@Controller
@RequestMapping("/admin/diet")
public class DietController {
	
	
	private static final Logger log = LoggerFactory.getLogger(DietController.class);

	
	//DI 의존성 주입
	private DietService dietService;
	private DietMapper dietMapper;
	
	public DietController(DietService dietService, DietMapper dietMapper) {
		this.dietService = dietService;
		this.dietMapper = dietMapper;
	}
	
	
	
	
	
	
	//식단 은행 관리자 페이지 조회
	@GetMapping("/dietBankListAdmin")
	public String getDietBankListAdmin(Model model) {
		
		model.addAttribute("title", "식단 은행 테스트");
		model.addAttribute("DietBankList", "식단은행 테스트페이지");
		
		
		List<DietBank> dietBankList = dietService.getDietBankListAdmin();
		
		model.addAttribute("dietBankList", dietBankList);
		
		
		
		return "diet/dietBankListAdmin";
		
	}
	
	
	/**
	 *  
	 * insertDietBankList ajax
	 * @ReuqestParam(value = "memberEmail") 
	 */
	@PostMapping("/insertDietBankList")
	@ResponseBody
	public HashMap<Integer, String> insertDietBankList(@RequestParam(value = "memberEmail") String memberEmail) {
		
		//DB에서 email에 해당하는 eClass 찾아오기 : 데이터 구현 되면 진짜로 하기
		//받아서 hashmap에 넣기
		
		
		//임시 예제(코드pk , 클래스 제목)
		HashMap<Integer, String> eClassMap = new HashMap<>();

		eClassMap.put(1, "내가 생성한 eclass 1번");
		eClassMap.put(2, "내가 생성한 eclass 2번");
		eClassMap.put(3, "내가 생성한 eclass 3번");
		
		
		
		
		return eClassMap;
	}
	
	//식단 은행 생성, 생성된 페이지(수정페이지)로 이동
	@PostMapping("/insertDietBankList2")
	public String insertDietBankList2(@RequestParam(value="connectEClass",required=false) String connectEClass
									 ,@RequestParam(value="insertEmail",required=false) String insertEmail
									 ,Model model) {
		
		String newCode = dietService.selectDietBankListNewCode("dietbank","dietBankCode");
		
		
		dietService.insertDietBankList2(connectEClass, insertEmail, newCode);
		
		
		//생성된 식단(은행) 조회
		String returnUrl = "redirect:/admin/diet/updateDietBankList?dietBankCode="+newCode;
		
		return returnUrl;
	}
	
	
	
	//식단 은행 식단 수정
	@GetMapping("/updateDietBankList")
	public String updateDietBankList(Model model
									,@RequestParam(name="dietBankCode", required = false) String dietBankCode
									){
		
		//System.out.println(session.getAttributeNames()+"세션스");
		
		//코드넘버로 불러오기
		model.addAttribute("title", "식단(은행) 수정");
		
		DietBank newDietBankInfo = dietMapper.getDietBankListAdminByC(dietBankCode);
		model.addAttribute("newDietBankInfo", newDietBankInfo);
		
		

		//select 시간, 요일 넘겨주기
		List<List<HashMap<String, Object>>> selectBankDay = dietService.selectBankDay();
		
		model.addAttribute("Banktime", selectBankDay.get(0));
		model.addAttribute("Bankday", selectBankDay.get(1));
		
		
		//select 음식 조회, 화면에 뿌려주기
		DietOnemealConnection dietOnemealConnection = new DietOnemealConnection();
		dietOnemealConnection.setDietBankCode(dietBankCode);
		
		List<HashMap<String, Object>> selectOneMealConn = dietMapper.selectDietOneMealConnectionByBankCode(dietOnemealConnection);
		model.addAttribute("selectOneMealConn", selectOneMealConn);
		
		System.out.println(selectOneMealConn+"찾아찾아");
		
		
		return "diet/updateDietBankList";
	}
	
	
	
	@GetMapping("/dietBankListEach")
	public String getDietBankListEach(Model model) {
		
		model.addAttribute("title", "식단은행 식단 상세");
		
		
		return "diet/dietBankListEach";
	}
	
	
	//식단 은행 삭제
	@GetMapping("/deleteDietBankList")
	public String deleteDietBankList(Model model
									,@RequestParam(name="dietBankCode", required = false) String dietBankCode) {
		
		dietService.deleteDietBankList(dietBankCode);
		
		
		
		return "redirect:/admin/diet/dietBankListAdmin";
	}
	
	
	//Ajax 식단 음식 대분류 조회
	@PostMapping("/selectDietMealLevelList")
	public String selectDietMealLevelList(Model model){
		
		List<DietMealLevelList> mainMealSort = dietMapper.selectDietMealLevelList();
		
		
		model.addAttribute("mainMealSort", mainMealSort);
	
		
		
		return "diet/AjaxTable/DietmainMealSortAjax";
	}
	
	
	//Ajax 음식 소분류 조회
		@PostMapping("selectDietMealListDetail")
		public String selectDietMealListDetail(Model model
											, @RequestParam(name="mainMealSort",required = false) String mainMealSort) {
			
			
			
			List<DietMealLevelList> DetailMealSort = dietMapper.selectDietMealListDetail(mainMealSort);
			
			model.addAttribute("DetailMealSort", DetailMealSort);
			
			return "diet/AjaxTable/DietmainMealSortDAjax";
		}
	
	
	//Ajax 대분류 선택 후 음식 조회
	@PostMapping("/selectDietMealList")
	public String selectDietMealList(Model model
									,@RequestParam(name="mainMealSort",required = false) String mainMealSort) {
		
		
		List<DietNutrientList> DietNutrientList = dietMapper.selectDietNutrientList(mainMealSort);
		
		
		model.addAttribute("DietNutrientList", DietNutrientList);
		
		return "diet/AjaxTable/DietMealListAjax";
	}
	
	
	//Ajax 식단은행에서 추가 버튼 insert, 내역update, 변화내용 select
	@PostMapping("/insertDietOneMealConnection")
	public String dietOneMealConnection(DietOnemealConnection dietOnemealConnection
										,Model model) {
		
		//새 코드 받아서 넣기
		String dietOneMealConnectionCode = dietService.selectDietBankListNewCode("dietonemealconnection", "dietOneMealConnectionCode");
		dietOnemealConnection.setDietOneMealConnectionCode(dietOneMealConnectionCode);
		
		//insert
		int insertResult = dietService.insertDietOnemealConnection(dietOnemealConnection);
		
		//update
		int updateResult = dietService.updateDietBank(dietOnemealConnection);
		
		
		//select
		List<HashMap<String, Object>> selectOneMealConn = dietMapper.selectDietOneMealConnectionByBankCode(dietOnemealConnection);
		
		model.addAttribute("selectOneMealConn", selectOneMealConn);
		
		
		
		
		
		return "diet/AjaxTable/DietBankConnMealListDayAjax"; 
	}
	
	//Ajax 식단은행에서 제거버튼 누를 때 delete, 내역update, 변화내용 select
	@PostMapping("/deleteDietOneMealConnection")
	public String deleteDietOneMealConnection(DietOnemealConnection dietOnemealConnection
											 ,Model model) {
		

		//delete
		String dietOneMealConnectionCode = dietOnemealConnection.getDietOneMealConnectionCode();
		int deleteResult = dietService.deleteDietOneMealConnection(dietOneMealConnectionCode);
		
		//update
		int updateResult = dietService.updateDietBank(dietOnemealConnection);
		
		
		//select
		List<HashMap<String, Object>> selectOneMealConn = dietMapper.selectDietOneMealConnectionByBankCode(dietOnemealConnection);
		
		model.addAttribute("selectOneMealConn", selectOneMealConn);
		
	
		
		
		return "diet/AjaxTable/DietBankConnMealListDayAjax";
	}
	
	
	
}
