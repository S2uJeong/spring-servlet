package hello.servlet.web.frontcontroller.v4.controller;


import hello.servlet.web.frontcontroller.v4.ControllerV4;

import java.util.Map;

/**
 * 뷰의 논리 이름만을 반환
 */
public class MemberFormControllerV4 implements ControllerV4 {

    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {
        return "new-form";
    }
}
