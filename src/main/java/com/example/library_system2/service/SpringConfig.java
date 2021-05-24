package com.example.library_system2.service;

import com.example.library_system2.repository.JdbcTemplateMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {
    private DataSource dataSource;
    //spring이 자체적으로 bean객체도 만들지만,
    // 스프링부트가 data소스를 설정파일을 보고 자체적으로 만들어준다. 그러면 아래에서 그냥 쓰기만 하면 됨.

    @Autowired
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public JdbcTemplateMemberRepository memberRepository(){
        return new JdbcTemplateMemberRepository(dataSource);
    }

}
