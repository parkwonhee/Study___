var util = createCommonUtil();

/*
 * Body에서 load 이벤트 발생 시 호출.
 * 앱이 최초 구성된후 최초 랜더링 직후에 발생하는 이벤트 입니다.
 */
function onBodyLoad(/* cpr.events.CEvent */ e){
	//코드조회 서브미션 호출
	util.Submit.send(app, "subOnload", null, function(pbSuccess){
		if(pbSuccess) {
			util.Control.dispatchEvent(app, "btnSearch", "click");
		}
	});
}

/*
 * "조회" 버튼에서 click 이벤트 발생 시 호출.
 * 사용자가 컨트롤을 클릭할 때 발생하는 이벤트.
 */
function onBtnSearchClick(/* cpr.events.CMouseEvent */ e){
	/** 
	 * @type cpr.controls.Button
	 */
	 //1. 데이터 변경사항 체크-그리드
	if (util.Grid.isModified(app, "grdCode", "CRM")) {
		return false;
	}
    
    //2. 조회조건 유효성 체크(필수입력 등)-검색레이아웃
	if(!util.validate(app,"grpSearch")) return;

	//3. 데이터 조회
	doList();
}

/**
 * 공공 목록 데이터를 조회한다.
 */
function doList(psStatus){
	//조회 서브미션 호출
	util.Submit.send(app, "subList", null, function(pbSuccess){
		if(pbSuccess) {
			if(psStatus == "save"){
				//갱신된 데이터가 조회되었습니다.
				util.Msg.notify(app,"INF-M005");
			}else{
				//조회되었습니다.
				util.Msg.notify(app,"INF-M001");
			}
		}
	}); 
}



/*
 * 사용자 정의 컨트롤에서 insert 이벤트 발생 시 호출.
 * 신규 클릭 이벤트
 */
function onComButtonInsert(/* cpr.event.CUIEvent */ e){
}



/*
 * 사용자 정의 컨트롤에서 delete 이벤트 발생 시 호출.
 * 삭제 클릭 이벤트
 */
function onComButtonDelete(/* cpr.event.CUIEvent */ e){
}


/*
 * 사용자 정의 컨트롤에서 save 이벤트 발생 시 호출.
 * 저장 클릭 이벤트
 */
function onComButtonSave(/* cpr.event.CUIEvent */ e){
}

