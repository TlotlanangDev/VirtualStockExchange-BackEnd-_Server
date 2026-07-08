package com.tlotlanang.virtualstockexchangebackend.User.Investor.controller;

import com.tlotlanang.virtualstockexchangebackend.User.Investor.domain.InvestorDto;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.domain.InvestorRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.domain.InvestorResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.entity.InvestorEntity;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.mapper.InvestorMapper;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.service.InvestorServiceImplement;
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

@WebMvcTest(controllers = InvestorController.class)
@AutoConfigureMockMvc(addFilters = false)
@ExtendWith(MockitoExtension.class)
class InvestorControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private InvestorMapper investorMapper;

    @Autowired
    private ObjectMapper objectMapper;

    @MockitoBean
    private InvestorServiceImplement investorServiceImplement;

    @Test
    void InvestorController_createUser_ReturnCreatedStatus() throws Exception {

        InvestorDto investorDto = InvestorDto.builder()
                .name("Tlotlanang")
                .surName("Gabonewe")
                .dateOfBirth(LocalDate.of(2002, 9, 1))
                .phoneNumber("0787060708")
                .emailAddress("Tlotlanang@gmail.com")
                .passWord("ergdg43gr")
                .build();

        InvestorResponseDto expectedResponse = InvestorResponseDto.builder()
                .name("Tlotlanang")
                .surName("Gabonewe")
                .dateOfBirth(LocalDate.of(2004,9,6))
                .phoneNumber("0786959588")
                .emailAddress("fdgdg")
                .build();

        given(investorMapper.fromDto(ArgumentMatchers.any(InvestorDto.class)))
                .willReturn(new InvestorRequest("Thabo", "gman",
                        LocalDate.of(2004,9,7), "0797978797",
                        "dgdgd@gmail.com", "vdsfvs"));

        given(investorServiceImplement.createUser(ArgumentMatchers.any(InvestorRequest.class)))
                .willReturn(new InvestorEntity());

        given(investorMapper.toDto(ArgumentMatchers.any(InvestorEntity.class)))
                .willReturn(expectedResponse);

        ResultActions response = mockMvc.perform(post("/api/v1/stockExchange/investor/register")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(investorDto)));

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