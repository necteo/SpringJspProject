package com.sist.web.vo;

import lombok.Data;

/*
 *    프로젝트 구조
 *    ----------
 *    static
 *    	|
 *    	-- js
 *    		|
 *    		stores : pinia store
 *    		app : 
 *    	   axios.js
 *    
 *    webapp
 *      |
 *    WEB-INF
 *      |
 *    views => jsp
 *    	| main
 *    	| food
 *    	| recipe
 *    index
 *    
 *    =============
 *    com.sist.web => 실행파일
 *    com.sist.web.vo
 *    com.sist.web.mapper
 *    com.sist.web.service
 *    com.sist.web.controller
 *    com.sist.web.restcontroller
 *    com.sist.web.commons
 *    com.sist.web.aop
 *    ----------------------------- 입문 과정 (MVC)
 *    com.sist.web.interceptor : 자동 로그인
 *    com.sist.web.security : 인가/인증 => 권한부여
 *    com.sist.web.task : batch => 실시간 처리
 *    com.sist.web.manager : websocket / kafka
 *    -------------------------------------------
 *    => 기본
 */
@Data
public class MemberVO {
	
	private String id, pwd, name, sex, address, msg;

}
