package com.sist.web.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.sist.web.vo.MemberVO;

@Mapper
public interface MemberMapper {
	
	@Select("SELECT COUNT(*) FROM member_3 WHERE id = #{id}")
	public int memberIdCheck(String id);
	
	@Select("SELECT id, name, pwd FROM member_3 "
		  + "WHERE id = #{id}")
	public MemberVO memberInfoData(String id);

}
