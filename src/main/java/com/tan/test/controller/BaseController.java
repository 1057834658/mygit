package com.tan.test.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.tan.test.service.ManagerService;

/**  
 * @Title: BaseController.java
 * @Description:
 * @author tanxin
 * @date 2017年5月15日  上午10:03:49
 */
@Controller
@RequestMapping("/user")
public class BaseController {
	private static Log logger = LogFactory.getLog(BaseController.class);
	@Resource(name = "managerServiceImpl")
	private ManagerService appManagerService;
	
//	@RequestMapping(value = "/getnewapp/{mobileSysType}", method = RequestMethod.GET)
//	@ResponseBody
//	public Map<String, Object> getNewApp(@PathVariable("mobileSysType") Integer mobileSysType) {
//		Map<String, Object> resultMap = new HashMap<String, Object>();
//		try {
//			resultMap = appManagerService.getNewApp(mobileSysType);
//		} catch (Exception e) {
//			logger.error(e);
//			e.printStackTrace();
//		}
//		return resultMap;
//	}
	
	@RequestMapping(value = "/getnewapp", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getNewApp1() {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		try {
			resultMap = appManagerService.getNewApp(1);
		} catch (Exception e) {
			logger.error(e);
			e.printStackTrace();
		}
		return resultMap;
	}
	public static void main(String[] args) {
		System.out.println("123123213");
	}
	
	
	@RequestMapping(value = "/getnewappjsp", method = RequestMethod.GET)
	public ModelAndView   getNewApp2() {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		ModelAndView mad = new ModelAndView("/user/getnewappjsp1");
		Map<String, Object> dataMap = new HashMap<String, Object>();
		List  list=new ArrayList();
		try {
			dataMap.put("type", 2);
			list = appManagerService.getNewAppjsp(dataMap);
			//将数据存入modelMap
			String message = "这个是要传递的数据";
		      mad.addObject("message", message);
		      mad.addObject("user", list.get(0));
		      mad.addObject("users", list);
		} catch (Exception e) {
			logger.error(e);
			e.printStackTrace();
		}
	      return mad;
	}
}
