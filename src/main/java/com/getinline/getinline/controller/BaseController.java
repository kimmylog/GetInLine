package com.getinline.getinline.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class BaseController implements ErrorController {

   @GetMapping("/")
    public String root() {
        // application.properties 에서
        // spring.mvc.view.suffix=.html

        // project structure 에서 module -> Web resource directory 에 webapp 경로 추가해야
        // index.html 인식할 수 있음

        // 타임리프 추가 하면 기본 경로 resource/templates 로 바뀜
        // 타임리프의 오토 컨피그레이션 기능만 사용하기 위한 것
        // 이게 걍 속 편한 방법이라고 함..
        return "index";
    }

    @RequestMapping("/error")
    public String error() {
       // 에러에 대한 컨트롤을 완전히 가져오려면 implements ErrorController 해줘야함
       return "error";
    }

}
