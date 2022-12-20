package com.example.TripScheduling.Controllers;

import com.example.TripScheduling.Services.adminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.TripScheduling.Entities.Admin;

@RestController
@CrossOrigin("*")
public class adminController {
    @Autowired 
    adminService adminService;

    @PostMapping("/signup")
    public String signup_admin(
        @RequestBody Admin admin)
    {
         return adminService.sign_up(admin);
    }
 
    @PostMapping("/admin/signin")
    public void signin_admin(
        @RequestBody Admin admin)
    {
         adminService.sign_in(admin);
    }

}
