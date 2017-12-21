package cn.nvinfo.action;


import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.nvinfo.service.TestService;

import com.opensymphony.xwork2.ActionSupport;
/**
 * ≤‚ ‘øÚº‹
 * @author yangli
 *
 */
@Controller
@Scope("prototype")
public class TestAction extends ActionSupport{

	@Resource
	private TestService testService;
	
	public String test(){
		System.out.println("TestAction.test()");
		testService.saveTwoUser();
		return "test";
	}
}
