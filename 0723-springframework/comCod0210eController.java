package org.tmt.iis.cmn.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;
import org.tmt.iis.cmn.service.comCod0210eService;

@Controller
@RequestMapping("/comCod0210e")
public class comCod0210eController {
	
	@Autowired
	private comCod0210eService comCod0210eService;
	//update

	/**
	 * 메소드명	: onLoad	
	 * 설	 명	: 공통코드 및 화면초기화에 필요한 데이터 반환
	 */
	
	//리스트 조회
	@RequestMapping("/onLoad.do")
	public View onLoad(HttpServletRequest request, HttpServletResponse response, RequestData requestData) throws Exception {
		String strLocale = requestData.getAppLocale();
		//단위시스템 코드
		requestData.setResponse("dslist", comCod0210eService.selectComCombo("", strLocale));
		
		return requestData.getDefaultView();
	}
	
	@RequestMapping("/list.do")
	public View subonLoad(HttpServletRequest request, HttpServletResponse response, RequestData requestData) throws Exception {
		String strLocale = requestData.getAppLocale();
		
		//조회용
		requestData.setResponse("dscomCodList", comCod0210eService.selectComCodeList("", strLocale));		
		return requestData.getDefaultView();
	}
	
//
}
