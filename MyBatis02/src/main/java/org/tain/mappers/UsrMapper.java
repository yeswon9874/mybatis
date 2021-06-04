package org.tain.mappers;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsrMapper {
	List<Map<String,Object>> selectAll(Map<String,Object> mapIn);
	Map<String,Object> selectOne(Map<String,Object> mapIn);
}
