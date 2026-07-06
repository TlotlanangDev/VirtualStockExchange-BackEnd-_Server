package com.tlotlanang.virtualstockexchangebackend.userRegister.controller;

import com.tlotlanang.virtualstockexchangebackend.userRegister.domain.UserRegisterDto;
import com.tlotlanang.virtualstockexchangebackend.userRegister.domain.UserRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.userRegister.domain.UserRegisterResponseDto;
import com.tlotlanang.virtualstockexchangebackend.userRegister.entity.UserRegisterEntity;
import com.tlotlanang.virtualstockexchangebackend.userRegister.mapper.UserRegisterMapper;
import com.tlotlanang.virtualstockexchangebackend.userRegister.service.UserRegisterServiceImplement;

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

@WebMvcTest(controllers = UserRegisterController.class)
@AutoConfigureMockMvc(addFilters = false)
@ExtendWith(MockitoExtension.class)
class UserRegisterControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private UserRegisterMapper userRegisterMapper;

    @Autowired
    private ObjectMapper objectMapper;

    @MockitoBean
    private UserRegisterServiceImplement userRegisterService;

    @Test
    void UserRegisterController_createUser_ReturnCreatedStatus() throws Exception {

        UserRegisterDto userRegisterDto = UserRegisterDto.builder()
                .name("Tlotlanang")
                .surName("Gabonewe")
                .dateOfBirth(LocalDate.of(2002, 9, 1))
                .phoneNumber("0787060708")
                .emailAddress("Tlotlanang@gmail.com")
                .passWord("ergdg43gr")
                .build();

        UserRegisterResponseDto expectedResponse = UserRegisterResponseDto.builder()
                .name("Tlotlanang")
                .surName("Gabonewe")
                .dateOfBirth(LocalDate.of(2004,9,6))
                .phoneNumber("0786959588")
                .emailAddress("fdgdg")
                .build();

        given(userRegisterMapper.fromDto(ArgumentMatchers.any(UserRegisterDto.class)))
                .willReturn(new UserRegisterRequest("Thabo", "gman",
                        LocalDate.of(2004,9,7), "0797978797",
                        "dgdgd@gmail.com", "vdsfvs"));

        given(userRegisterService.createUser(ArgumentMatchers.any(UserRegisterRequest.class)))
                .willReturn(new UserRegisterEntity());

        given(userRegisterMapper.toDto(ArgumentMatchers.any(UserRegisterEntity.class)))
                .willReturn(expectedResponse);

        ResultActions response = mockMvc.perform(post("/api/v1/stockExchange/userRegister")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(userRegisterDto)));

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
                        org.hamcrest.CoreMatchers.is(expectedResponse.emailAddress())))
        ;

    }




}