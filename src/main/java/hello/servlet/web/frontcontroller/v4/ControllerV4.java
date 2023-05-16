package hello.servlet.web.frontcontroller.v4;

import java.util.Map;

/**
 * 컨트롤러가 String (viewName)을 반환한다.
 */
public interface ControllerV4 {
    String process(Map<String, String> paramMap, Map<String, Object> model);
}
