package org.tain.mappers;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsrMapper {
	List<Map<String,Object>> selectAllUsr();
}
