package org.tain.mybatis.mappers;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface CustProdMapper {

	List<Map<String,Object>> selectAll(Map<String,Object> mapIn);
	
	List<Map<String,Object>> selectAllJoin(Map<String,Object> mapIn);
	
	@Insert("insert into "
			+ "tb_cust_prod(id, cust_code, prod_code, count) "
			+ "values "
			+ "(#{id}, #{custCode}, #{prodCode}, #{count})")
	int createOne(Map<String,Object> mapIn);

	@Update("update tb_cust_prod set count = #{count} where id = #{id}")
	int updateOne(Map<String, Object> mapIn);

	@Delete("delete from tb_cust_prod where id = #{id} ")
	int deleteOne(Map<String, Object> mapIn);
	
}

