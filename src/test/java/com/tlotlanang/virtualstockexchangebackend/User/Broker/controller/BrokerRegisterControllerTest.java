package com.tlotlanang.virtualstockexchangebackend.User.Broker.controller;


import com.tlotlanang.virtualstockexchangebackend.User.Broker.domain.BrokerRegisterDto;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.domain.BrokerRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.domain.BrokerregisterResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.entity.BrokerRegisterEntity;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.mapper.BrokerRegisterMapper;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.service.BrokerRegisterServiceImpl;

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

@WebMvcTest(controllers = BrokerRegisterController.class)
@AutoConfigureMockMvc(addFilters = false)
@ExtendWith(MockitoExtension.class)
class BrokerRegisterControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private BrokerRegisterMapper brokerRegisterMapper;

    @Autowired
    private ObjectMapper objectMapper;

    @MockitoBean
    private BrokerRegisterServiceImpl brokerServiceImplement;

    @Test
    void BrokerController_createUser_ReturnCreatedStatus() throws Exception {

        BrokerRegisterDto brokerRegisterDto = BrokerRegisterDto.builder()
                .name("Tlotlanang")
                .surName("Gabonewe")
                .dateOfBirth(LocalDate.of(2002, 9, 1))
                .phoneNumber("0787060708")
                .emailAddress("Tlotlanang@gmail.com")
                .passWord("ergdg43gr")
                .build();

        BrokerregisterResponseDto expectedResponse = BrokerregisterResponseDto.builder()
                .name("Tlotlanang")
                .surName("Gabonewe")
                .dateOfBirth(LocalDate.of(2004,9,6))
                .phoneNumber("0786959588")
                .emailAddress("fdgdg")
                .build();

        given(brokerRegisterMapper.fromDto(ArgumentMatchers.any(BrokerRegisterDto.class)))
                .willReturn(new BrokerRegisterRequest("Thabo", "gman",
                        LocalDate.of(2004,9,7), "0797978797",
                        "dgdgd@gmail.com", "vdsfvs"));

        given(brokerServiceImplement.createUser(ArgumentMatchers.any(BrokerRegisterRequest.class)))
                .willReturn(new BrokerRegisterEntity());

        given(brokerRegisterMapper.toDto(ArgumentMatchers.any(BrokerRegisterEntity.class)))
                .willReturn(expectedResponse);

        ResultActions response = mockMvc.perform(post("/api/v1/stockExchange/broker/register")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(brokerRegisterDto)));

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