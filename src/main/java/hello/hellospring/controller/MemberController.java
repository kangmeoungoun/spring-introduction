package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController{
    //@Autowired
    private MemberService memberService;

    //조립시점에만 완성하고 그 이후에 는 못바꿔야되는데 중간에도 바꿀수 있게 노출된다.
    //생성하는 시점에만 하고 그이후에느 변경 못하도록.
    //권장하는 스타일은 생성자를 통한 주입
    @Autowired
    public void setMemberService(MemberService memberService){
        this.memberService = memberService;
    }

    //    @Autowired
//    public MemberController(MemberService memberService){
//        this.memberService = memberService;
//    }

}
