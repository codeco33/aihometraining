package aihometraining.team.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import aihometraining.team.dto.ReportStandard;
import aihometraining.team.mapper.ReportMapper;


@Service
@Transactional
public class ReportService {
	
	//DI 의존성 주입 생성자 메서드 주입 방식
	private ReportMapper reportMapper; 
	
	@Autowired
	public ReportService(ReportMapper reportMapper) {
		this.reportMapper = reportMapper;
	}
	
	/**
	 * 신고 기준 목록 조회
	 */
	public List<ReportStandard> getReportStandardList(){
		
		List<ReportStandard> reportStandardList = reportMapper.getReportStandardList();
		
		return reportStandardList;
	}
	
}
