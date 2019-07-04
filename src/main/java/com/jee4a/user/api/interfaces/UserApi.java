package com.jee4a.user.api.interfaces;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jee4a.user.api.model.UserModel;

/**
 * <p></p> 
 * @author tpeng 2018年1月29日
 * @email 398222836@qq.com
 */
public interface UserApi {
	
	@RequestMapping(value = "api/user" ,method = RequestMethod.GET)
	String queryUserById(@RequestParam("id")  Integer id) ;
	
	@RequestMapping(value = "api/user-1" ,method = RequestMethod.GET)
	UserModel queryUserById1(@RequestParam("id")   Integer id) ;
	
}
