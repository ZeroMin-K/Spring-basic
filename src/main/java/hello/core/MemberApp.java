package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class MemberApp {
    // 직접 호출
//    public static void main(String[] args) {
//        MemberService memberService = new MemberServiceImpl();
//
//        Member member = new Member(1L, "memberA", Grade.VIP);
//        memberService.join(member);
//
//        Member findMember = memberService.findMember(1L);
//        System.out.println("findMember = " + findMember.getName());
//        System.out.println("member = " + member.getName());
//
//    }

    // AppConfig를 이용한 의존성 주입
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();

        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find member = " + findMember.getName());

    }

}
