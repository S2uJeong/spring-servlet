package hello.servlet.web.frontcontroller.v2;

import hello.servlet.web.frontcontroller.MyView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * void 타입이였던 이전 타입과 달리 MyView(뷰)를 반환한다.
 */

public interface ControllerV2 {
    MyView process(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException;

}
