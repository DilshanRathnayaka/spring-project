package com.epic.admin.Mapper;

import com.epic.admin.DTO.adminDTO;
import com.epic.admin.Entity.admin;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface adminMapper {

    admin adminDtoToAdmin(adminDTO adminDto);

    @IterableMapping(qualifiedByName = "adminToAdminDto")
    List<adminDTO> adminDtoToAdminList(List<admin> admin);

    @Named("adminToAdminDto")
    adminDTO adminToAdminDto(admin admin);
}
