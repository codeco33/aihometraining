package aihometraining.team.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommonMapper {
	public String getNewCode(String codePattern, String tableName);
}
