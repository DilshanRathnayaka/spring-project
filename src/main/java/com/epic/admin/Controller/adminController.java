package com.epic.admin.Controller;

import com.epic.admin.DTO.adminDTO;
import com.epic.admin.Service.adminService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/admin")
public class adminController {
    private adminService adminService;

    public adminController(adminService adminService) {
        this.adminService = adminService;
    }
    @PostMapping("/save")
    public adminDTO saveAdmin(@RequestBody adminDTO admin){
        return adminService.saveAdmin(admin);
    }

    @GetMapping("/all")
    public List<adminDTO> getAdmin(){
        return adminService.getAdmin();
    }
}
