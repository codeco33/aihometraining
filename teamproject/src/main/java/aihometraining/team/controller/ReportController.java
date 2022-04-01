package aihometraining.team.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aihometraining.team.dto.ReportStandard;
import aihometraining.team.mapper.ReportMapper;
import aihometraining.team.service.ReportService;


@Controller
@RequestMapping("/report")
public class ReportController {
	
	
	//DI 의존성 주입 생성자 메소드 주입 방식
	private ReportService reportService;
	
	public ReportController(ReportService reportService, ReportMapper reportMapper) {
		this.reportService = reportService;
	}
	
	
	@GetMapping("/reportList")
	public String reportList(Model model) {
		
		model.addAttribute("leftMenuList", "신고");
		model.addAttribute("title", "신고 관리자 페이지");
		
		return "report/reportList";
	}
	@GetMapping("/reportStandardList")
	public String reportStandardList(Model model) {
		
		List<ReportStandard> reportStandardList = reportService.getReportStandardList();
		
		model.addAttribute("leftMenuList", "신고");
		model.addAttribute("title", "신고 기준 목록 조회");
		model.addAttribute("reportStandardList", reportStandardList);
		
		return "report/reportStandardList";
		
	}
}
