package com.epic.admin.Service;

import com.epic.admin.DTO.adminDTO;
import com.epic.admin.Entity.admin;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.epic.admin.Repo.adminRepo;
import com.epic.admin.Mapper.adminMapper;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class adminService {
    private final adminRepo adminRepo;
    private final adminMapper adminMapper;


    public adminDTO saveAdmin(adminDTO admin){
       return adminMapper.adminToAdminDto(adminRepo.save(adminMapper.adminDtoToAdmin(admin)));
    }

    public List<adminDTO> getAdmin(){
        return adminMapper.adminDtoToAdminList(adminRepo.findAll());
    }
}
