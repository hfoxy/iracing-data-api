package me.hfox.iracing.data.api.service.member;

import me.hfox.iracing.data.api.IRacingDataApiConfiguration;
import me.hfox.iracing.data.api.service.TestAuthService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Set;

@SpringBootTest(classes = IRacingDataApiConfiguration.class)
class MemberServiceImplTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MemberServiceImplTest.class);

    @Autowired
    TestAuthService authService;

    @Autowired
    MemberService memberService;

    @BeforeEach
    void setUp() {
        authService.login();
    }

    @Test
    void getMembersById() {
        LOGGER.info("members: {}", memberService.getMembers(Set.of(595593L, 603422L)));
    }

    @Test
    void getMembersByIdIncludeLicenses() {
        LOGGER.info("members w/licenses: {}", memberService.getMembers(Set.of(595593L, 603422L), true));
    }

}