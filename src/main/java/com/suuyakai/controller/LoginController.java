package com.suuyakai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/* クラス */
// @～をアノテーション
@Controller
public class LoginController {
	
	/* メソッド */
	@GetMapping("login")
	public String init() {
		/* ここに処理を書く（サービスの呼出しとか） */
		
		// return(戻り値・返り値)で遷移先のHTML名(.以降を省く)を指定する
		return "login";
	}
}
