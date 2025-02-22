package com.dozone.wehagopro.repository.signUp;

import com.dozone.wehagopro.domain.signUp.*;
import com.dozone.wehagopro.repository.mybatis.SignUpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SignUpRepository {

    @Autowired
    SignUpMapper mapper;

    public String idCheck(String id){
        System.out.println("repsitoryid = " + id);
        return mapper.idCheck(id);
    }
    public String emailCheck(String email){
        System.out.println("email = " + email);
        return mapper.emailCheck(email);
    }

    public String phoneNumberCheck(String phoneNumber){
        System.out.println("phoneNumber = " + phoneNumber);
        return mapper.phoneNumberCheck(phoneNumber);
    }
    public String signUpUser(UserSignUpDto dto){
        System.out.println("리포지토리");
        System.out.println("dto = " + dto);
        mapper.userSave(dto);

        return "리포지토리성공?";
    }

    public String signUpCompany(CompanySignUpDto dto){
        System.out.println("리포지토리");
        System.out.println("dto = " + dto);
        mapper.companySave(dto);

        return "리포지토리성공?";
    }

    public String signUpOrganization(OrganizationSignUpDto dto){
        System.out.println("리포지토리");
        System.out.println("dto = " + dto);
        mapper.organizationSave(dto);

        return "리포지토리성공?";
    }

    public String signUpEmployee(EmployeeSignUpDto dto){
        System.out.println("리포지토리");
        System.out.println("dto = " + dto);
        mapper.employeeSave(dto);

        return "리포지토리성공?";
    }

    public List<Integer> findServiceNoByPackageNo(int no){
        System.out.println("리포지토리");
        System.out.println("PackageNo = " + no);
        return mapper.findServiceNoByPackageNo(no);
    }

    public List<Integer> findServiceNoByServiceFree(){
        System.out.println("리포지토리");
        System.out.println("freeNo = ");
        return mapper.findServiceNoByServiceFree();
    }

    public String signUpServicePublished(int employeeNo, int serviceNo){
        System.out.println("리포지토리");
        System.out.println("employeeNo = " + employeeNo + "serviceNo = " + serviceNo);
        mapper.servicePublishedSave(employeeNo,serviceNo);

        return "리포지토리성공?";
    }

    public String companyCheck(String companyName) {
        System.out.println("repsitorycompanyName = " + companyName);
        return mapper.companyCheck(companyName);
    }

    public ShortLinkSignUpDto findShortLinkByEmpNo(int empNo){
        System.out.println("repsitoryempNo = " + empNo);
        return mapper.findShortLinkByEmpNo(empNo);
    }

    public Integer employeeStateCheck(int empNo){
        System.out.println("repsitoryempNo = " + empNo);
        return mapper.employeeStateCheck(empNo);
    }

    public Integer findUserNoByEmployeeNo(SignUpInviteUpdateDto dto){
        System.out.println("dto = " + dto);
        return mapper.findUserNoByEmployeeNo(dto);
    }

    public void updateEmployeeStateTo2(SignUpInviteUpdateDto dto){
        System.out.println("dto = " + dto);
        mapper.updateEmployeeStateTo2(dto);
    }

    public void updateInvitedUser(SignUpInviteUpdateDto dto){
        System.out.println("dto = " + dto);
        mapper.updateInvitedUser(dto);
    }

    public List<CompanyServiceListDto> companyServiceList(int comNo){
        System.out.println("comNo = " + comNo);
        return mapper.companyServiceList(comNo);
    }

    public Integer findPackageCountByCompanyNo(int comNo){
        System.out.println("comNo = " + comNo);
        return mapper.findPackageCountByCompanyNo(comNo);
    }

    public CountPublishedServiceAndEmpNoDto eachCompanyPublishedCount(int serviceNo, int comNo){
        System.out.println("serviceNo = " + serviceNo + ", comNo = " + comNo);
        return mapper.eachCompanyPublishedCount(serviceNo,comNo);
    }

    public List<UnPublishedUserDto> findUnPublishedUser(int comNo, int serviceNo){
        System.out.println("comNo = " + comNo + ", serviceNo = " + serviceNo);
        return mapper.findUnPublishedUser(comNo, serviceNo);
    }

    public List<UnPublishedUserDto> findPublishedUser(int comNo, int serviceNo){
        System.out.println("comNo = " + comNo + ", serviceNo = " + serviceNo);
        return mapper.findPublishedUser(comNo, serviceNo);
    }

    public void updateUnPublish(int empNo, int serviceNo){
        System.out.println("empNo = " + empNo + ", serviceNo = " + serviceNo);
        mapper.updateUnPublish(empNo,serviceNo);
    }

    public Integer findPublishedCount(int serviceNo, int comNo){
        System.out.println("serviceNo = " + serviceNo + ", comNo = " + comNo);
        return mapper.findPublishedCount(serviceNo,comNo);
    }
}
