package com.example.TripScheduling.Services;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TripScheduling.Entities.Admin;
import com.example.TripScheduling.Repositories.adminRepository;

@Service
public class adminService {
    @Autowired
    adminRepository adminRepo;

    public String sign_up (Admin admin)
    {
         for(Admin a : adminRepo.findAll())
         {
            if(a.getUsername().equals(admin.getUsername()))
            {
                return"account already exist";
            }
            
        }
        adminRepo.save(admin);
        return"Account successfully saved";
    }

    public Admin sign_in (Admin admin)
    {
        for(Admin a : adminRepo.findAll())
        {
            if(a.getUsername().equals(admin.getUsername()))
            {
                System.out.println("welcome " + admin.getName());
            }
            else
            {
                System.out.println("account doesn't exist");
            }
        }
        return null;

    }

    public Admin update_user(Admin admin, String id)
    {
        Admin admin2= adminRepo.findById(id).get();
        if(Objects.nonNull(admin.getName()) && !"".equalsIgnoreCase(admin.getName()))
        {
            admin2.setName(admin.getName());
        }
         return adminRepo.save(admin2);
    }
    public void delete_user(String id)
    {
         adminRepo.deleteById(id);
    }

    
}
