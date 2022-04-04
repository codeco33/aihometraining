package aihometraining.team.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import aihometraining.team.dto.Report;
import aihometraining.team.dto.ReportStandard;


@Mapper
public interface ReportMapper {
	
	// 신고 목록 조회
	public List<Report> getReportList();
	
	// 신고 기준 목록 조회
	public List<ReportStandard> getReportStandardList();
	
}
