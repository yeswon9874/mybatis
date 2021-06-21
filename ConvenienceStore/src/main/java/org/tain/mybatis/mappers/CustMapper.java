package org.tain.mybatis.mappers;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface CustMapper {

	List<Map<String,Object>> selectAll(Map<String,Object> mapIn);
	
	@Insert("insert into "
			+ "tb_cust(id, name, code, phone_number, gender, address) "
			+ "values "
			+ "(#{id}, #{name}, #{code}, #{phoneNumber}, #{gender}, #{address})")
	int createOne(Map<String,Object> mapIn);
	
	@Update("update tb_cust set name= #{name}, code = #{code} where id = #{id}")
	int updateOne(Map<String,Object> mapIn);

	@Delete("delete from tb_cust where id = #{id}")
	int deleteOne(Map<String,Object> mapIn);
	
}
