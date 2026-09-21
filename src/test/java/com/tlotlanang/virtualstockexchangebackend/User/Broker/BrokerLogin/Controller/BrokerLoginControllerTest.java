package com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.Controller;

import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.domain.BrokerLoginDto;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.domain.BrokerLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.entity.BrokerLoginEntity;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.mapper.BrokerLoginMapper;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.service.BrokerLoginService;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import tools.jackson.databind.ObjectMapper;

import static org.mockito.Mockito.when;

@WebMvcTest(controllers = BrokerLoginController.class)
@AutoConfigureMockMvc(addFilters = false)
@ExtendWith(MockitoExtension.class)
class BrokerLoginControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private BrokerLoginService brokerLoginService;

    @MockitoBean
    private BrokerLoginMapper brokerLoginMapper;

    @Autowired
    private ObjectMapper objectMapper;

    BrokerLoginDto brokerLoginDto = BrokerLoginDto.builder()
            .emailAddress("Tlotlanang@gmail.com")
            .passWord("wefwf68f8we8f6").build();
    BrokerLoginRequest brokerLoginRequest = BrokerLoginRequest.builder()
            .emailAddress("Tlotlanang@gmail.com")
            .passWord("wefwf68f8we8f6").build();
    BrokerLoginEntity brokerLoginEntity = BrokerLoginEntity.builder()
            .emailAddress("Tlotlanang@gmail.com")
            .passWord("wefwf68f8we8f6").build();
    @Test
    public void BrokerLoginController_loginUser_ReturnLoggedInUserDetails() throws Exception{


        when(brokerLoginService.loginUser(brokerLoginRequest)).thenReturn(brokerLoginEntity);

        ResultActions resultActions = mockMvc.perform(get("/api/v1/stockExchange/broker/login")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(brokerLoginEntity)));

        resultActions.andExpect(MockMvcResultMatchers.status().isOk())
                     .andExpect(MockMvcResultMatchers.jsonPath("$.emailAddress", CoreMatchers.is(brokerLoginDto.emailAddress())))
                     .andExpect(MockMvcResultMatchers.jsonPath("$.passWord", CoreMatchers.is(brokerLoginDto.passWord())));

    }

}