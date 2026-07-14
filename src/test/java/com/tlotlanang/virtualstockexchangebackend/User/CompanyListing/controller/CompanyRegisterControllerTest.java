package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.controller;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain.CompanyRegisterDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain.CompanyRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain.CompanyRegisterResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.entity.CompanyRegisterEntity;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.mapper.CompanyRegisterMapper;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.service.CompanyRegisterServiceImplement;
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

@WebMvcTest(controllers = CompanyRegisterController.class)
@AutoConfigureMockMvc(addFilters = false)
@ExtendWith(MockitoExtension.class)
class CompanyRegisterControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private CompanyRegisterMapper companyRegisterMapper;

    @Autowired
    private ObjectMapper objectMapper;

    @MockitoBean
    private CompanyRegisterServiceImplement companyServiceImplement;

    @Test
    void CompanyController_createUser_ReturnCreatedStatus() throws Exception {

        CompanyRegisterDto companyRegisterDto = CompanyRegisterDto.builder()
                .companyName("Tlotlanang")
                .registrationNumber("Gabonewe")
                .registrationDate(LocalDate.of(2002, 9, 1))
                .telePhone("0787060708")
                .emailAddress("Tlotlanang@gmail.com")
                .passWord("ergdg43gr")
                .build();

        CompanyRegisterResponseDto expectedResponse = CompanyRegisterResponseDto.builder()
                .companyName("Tlotlanang")
                .registrationNumber("Gabonewe")
                .registrationDate(LocalDate.of(2004,9,6))
                .telePhone("0786959588")
                .emailAddress("fdgdg")
                .build();

        given(companyRegisterMapper.fromDto(ArgumentMatchers.any(CompanyRegisterDto.class)))
                .willReturn(new CompanyRegisterRequest(null,"Thabo", "gman",
                        LocalDate.of(2004,9,7), "0797978797",
                        "dgdgd@gmail.com", "vdsfvs"));

        given(companyServiceImplement.createUser(ArgumentMatchers.any(CompanyRegisterRequest.class)))
                .willReturn(new CompanyRegisterEntity());

        given(companyRegisterMapper.toDto(ArgumentMatchers.any(CompanyRegisterEntity.class)))
                .willReturn(expectedResponse);

        ResultActions response = mockMvc.perform(post("/api/v1/stockExchange/company/register")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(companyRegisterDto)));

        response.andExpect(MockMvcResultMatchers.status().isCreated()).andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.jsonPath("$.companyName",
                        org.hamcrest.CoreMatchers.is(expectedResponse.companyName())))
                .andExpect(MockMvcResultMatchers.jsonPath("$.registrationNumber",
                        org.hamcrest.CoreMatchers.is(expectedResponse.registrationNumber())))
                .andExpect(MockMvcResultMatchers.jsonPath("$.registrationDate",
                        org.hamcrest.CoreMatchers.is(expectedResponse.registrationDate().toString())))
                .andExpect(MockMvcResultMatchers.jsonPath("$.telePhone",
                        org.hamcrest.CoreMatchers.is(expectedResponse.telePhone())))
                .andExpect(MockMvcResultMatchers.jsonPath("$.emailAddress",
                        org.hamcrest.CoreMatchers.is(expectedResponse.emailAddress())));

    }

}