package com.tlotlanang.virtualstockexchangebackend.userRegister;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegisterService {
    @Autowired
    private userRegisterRepository userregisterrepository;
    @Transactional
    public UsersDto dtoConverter(UsersDto usersDto){

        UserRegisterEntity userRegisterEntity = new UserRegisterEntity();
        userRegisterEntity.setUuid(usersDto.Id());
        userRegisterEntity.setName(usersDto.name());
        userRegisterEntity.setSurName(usersDto.surName());
        userRegisterEntity.setDateOfBirth(usersDto.dateOfBirth());
        userRegisterEntity.setPhoneNumber(usersDto.phoneNumber());
        userRegisterEntity.setEmailAddress(usersDto.emailAddress());
        userRegisterEntity.setPassWord(usersDto.passWord());
        userRegisterEntity.setPhysicalAddress(usersDto.physicalAddress());

        UserRegisterEntity savedToEntity = userregisterrepository.save(userRegisterEntity);

        return new UsersDto(savedToEntity.getUuid(), savedToEntity.getName(), savedToEntity.getSurName(),
                savedToEntity.getDateOfBirth(), savedToEntity.getPhoneNumber(), savedToEntity.getEmailAddress(),
                savedToEntity.getPassWord(), savedToEntity.getPhysicalAddress());
    }

    


}
