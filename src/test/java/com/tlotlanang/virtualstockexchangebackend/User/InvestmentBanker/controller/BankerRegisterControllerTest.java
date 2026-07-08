package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.controller;

import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.domain.BankerRegisterDto;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.domain.BankerRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.domain.BankerRegisterResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.entity.BankerRegisterEntity;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.mapper.BankerRegisterMapper;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.service.BankerRegisterServiceImplement;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import tools.jackson.databind.ObjectMapper;

import java.time.LocalDate;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@WebMvcTest(controllers = BankerRegisterController.class)
@AutoConfigureMockMvc(addFilters = false)
@ExtendWith(MockitoExtension.class)
class BankerRegisterControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private BankerRegisterMapper bankerRegisterMapper;

    @Autowired
    private ObjectMapper objectMapper;

    @MockitoBean
    private BankerRegisterServiceImplement bankerServiceImplement;

    @Test
    void BankerController_createUser_ReturnCreatedStatus() throws Exception {

        BankerRegisterDto bankerRegisterDto = BankerRegisterDto.builder()
                .name("Tlotlanang")
                .surName("Gabonewe")
                .dateOfBirth(LocalDate.of(2002, 9, 1))
                .phoneNumber("0787060708")
                .emailAddress("Tlotlanang@gmail.com")
                .passWord("ergdg43gr")
                .build();

        BankerRegisterResponseDto expectedResponse = BankerRegisterResponseDto.builder()
                .name("Tlotlanang")
                .surName("Gabonewe")
                .dateOfBirth(LocalDate.of(2004,9,6))
                .phoneNumber("0786959588")
                .emailAddress("fdgdg")
                .build();

        given(bankerRegisterMapper.fromDto(ArgumentMatchers.any(BankerRegisterDto.class)))
                .willReturn(new BankerRegisterRequest("Thabo", "gman",
                        LocalDate.of(2004,9,7), "0797978797",
                        "dgdgd@gmail.com", "vdsfvs"));

        given(bankerServiceImplement.createUser(ArgumentMatchers.any(BankerRegisterRequest.class)))
                .willReturn(new BankerRegisterEntity());

        given(bankerRegisterMapper.toDto(ArgumentMatchers.any(BankerRegisterEntity.class)))
                .willReturn(expectedResponse);

        ResultActions response = mockMvc.perform(post("/api/v1/stockExchange/banker/register")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(bankerRegisterDto)));

        response.andExpect(MockMvcResultMatchers.status().isCreated()).andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name",
                        org.hamcrest.CoreMatchers.is(expectedResponse.name())))
                .andExpect(MockMvcResultMatchers.jsonPath("$.surName",
                        org.hamcrest.CoreMatchers.is(expectedResponse.surName())))
                .andExpect(MockMvcResultMatchers.jsonPath("$.dateOfBirth",
                        org.hamcrest.CoreMatchers.is(expectedResponse.dateOfBirth().toString())))
                .andExpect(MockMvcResultMatchers.jsonPath("$.phoneNumber",
                        org.hamcrest.CoreMatchers.is(expectedResponse.phoneNumber())))
                .andExpect(MockMvcResultMatchers.jsonPath("$.emailAddress",
                        org.hamcrest.CoreMatchers.is(expectedResponse.emailAddress())));

    }
}