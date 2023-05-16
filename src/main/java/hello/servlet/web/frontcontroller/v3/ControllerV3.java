package hello.servlet.web.frontcontroller.v3;

import hello.servlet.web.frontcontroller.ModelView;

import java.util.Map;

/**
 * 서블릿 기술을 이용하지 않고 있다.
 *  - 테스트 코드 쉬워짐
 *  - HttpServletRequest가 제공하는 파라미터는 프론트 컨트롤러가 paramMap에 담아서 호출
 */
public interface ControllerV3 {

    ModelView process(Map<String, String> paramMap);
}
