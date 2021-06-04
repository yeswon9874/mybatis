package org.tain.mappers;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsrMapper {
	List<Map<String,Object>> selectAll(Map<String,Object> mapIn);
	Map<String,Object> selectOne(Map<String,Object> mapIn);
	
	@Insert("insert into "
			+ "tb_usr(id, user_id, pass_wd, desc) "
			+ "values "
			+ "(#{id}, #{userId}, #{passWd}, #{desc})")
	void createOne(Map<String,Object> mapIn);

	
	///////////////////////////////////////////////////////
	@Delete("delete from tb_usr where id = #{id}") 
	void deleteOne(Map<String,Object> mapIn);
}
