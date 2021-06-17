package org.tain.mybatis.mappers;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface ProdMapper {

	List<Map<String,Object>> selectAll(Map<String,Object> mapIn);
	
	@Insert("insert into "
			+ "tb_prod(id, name, code, kinds, price) "
			+ "values "
			+ "(#{id}, #{name}, #{code}, #{kinds}, #{price})")
	int createOne(Map<String,Object> mapIn);
	
	@Update("update tb_prod set name = #{name} where id = #{id}")
	int updateOne(Map<String,Object> mapIn);
	
	@Delete("delete from tb_prod where id = #{id}")
	int deleteOne(Map<String,Object> mapIn);
}
