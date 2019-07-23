
var util = createCommonUtil();
//create new Appkit

/*
 * Body에서 load 이벤트
 */
function onBodyLoad(/* cpr.events.CEvent */ e){
	util.Submit.send(app, "subOnload", null, function(pbSuccess){
		if(pbSuccess){		doList();		}
	});
}

/*
 * "조회" 버튼에서 click 이벤트
 */
function onBtnSearchClick(/* cpr.events.CMouseEvent */ e){
		doList();
}

/**
 * 공공 목록 데이터를 조회
 */
function doList(psStatus){
	//조회 서브미션 호출
	util.Submit.send(app, "subList", null, function(pbSuccess){if(pbSuccess) {}});
}
