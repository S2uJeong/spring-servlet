package hello.servlet.web.frontcontroller.v4.controller;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import hello.servlet.web.frontcontroller.ModelView;
import hello.servlet.web.frontcontroller.v4.ControllerV4;

import java.util.Map;

public class MemberSaveControllerV4 implements ControllerV4 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {

        String username = paramMap.get("username");
        int age = Integer.parseInt(paramMap.get("age"));

        Member member = new Member(username, age);
        memberRepository.save(member);

        /**
         * model 을 파라미터로 받아오고 있기 때문에,
         * modelView를 생성해주지 않아도 바로 model 객체를 사용가능
         */
        // ModelView mv = new ModelView("save-result");
        // mv.getModel().put("member", member);

        model.put("member", member);

        return "save-result";
    }
}


