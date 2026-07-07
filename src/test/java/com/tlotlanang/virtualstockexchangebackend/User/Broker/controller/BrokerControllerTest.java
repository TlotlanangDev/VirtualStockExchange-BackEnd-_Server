package com.tlotlanang.virtualstockexchangebackend.User.Broker.controller;


import com.tlotlanang.virtualstockexchangebackend.User.Broker.domain.BrokerDto;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.domain.BrokerRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.domain.BrokerResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.entity.BrokerEntity;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.mapper.BrokerMapper;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.service.BrokerServiceImplement;

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

@WebMvcTest(controllers = BrokerController.class)
@AutoConfigureMockMvc(addFilters = false)
@ExtendWith(MockitoExtension.class)
class BrokerControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private BrokerMapper brokerMapper;

    @Autowired
    private ObjectMapper objectMapper;

    @MockitoBean
    private BrokerServiceImplement brokerServiceImplement;

    @Test
    void BrokerController_createUser_ReturnCreatedStatus() throws Exception {

        BrokerDto userDto = BrokerDto.builder()
                .name("Tlotlanang")
                .surName("Gabonewe")
                .dateOfBirth(LocalDate.of(2002, 9, 1))
                .phoneNumber("0787060708")
                .emailAddress("Tlotlanang@gmail.com")
                .passWord("ergdg43gr")
                .build();

        BrokerResponseDto expectedResponse = BrokerResponseDto.builder()
                .name("Tlotlanang")
                .surName("Gabonewe")
                .dateOfBirth(LocalDate.of(2004,9,6))
                .phoneNumber("0786959588")
                .emailAddress("fdgdg")
                .build();

        given(brokerMapper.fromDto(ArgumentMatchers.any(BrokerDto.class)))
                .willReturn(new BrokerRequest("Thabo", "gman",
                        LocalDate.of(2004,9,7), "0797978797",
                        "dgdgd@gmail.com", "vdsfvs"));

        given(brokerServiceImplement.createUser(ArgumentMatchers.any(BrokerRequest.class)))
                .willReturn(new BrokerEntity());

        given(brokerMapper.toDto(ArgumentMatchers.any(BrokerEntity.class)))
                .willReturn(expectedResponse);

        ResultActions response = mockMvc.perform(post("/api/v1/stockExchange/broker/register")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(userDto)));

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