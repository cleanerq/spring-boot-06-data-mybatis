package com.qby.springboot.controller;

import com.qby.springboot.bean.Department;
import com.qby.springboot.bean.Employee;
import com.qby.springboot.mapper.DepartmentMapper;
import com.qby.springboot.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.rmi.server.InactiveGroupException;

@Controller
public class DeptController {

    @Autowired
    private DepartmentMapper departmentMapper;
    @Autowired
    private EmployeeMapper employeeMapper;

    @ResponseBody
    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id) {
       return departmentMapper.getDeptById(id);
    }

    @ResponseBody
    @GetMapping("/dept")
    public Department insertDept(Department department) {
        departmentMapper.insertDept(department);
        return department;
    }

    @ResponseBody
    @RequestMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id) {
        return employeeMapper.getEmpById(id);
    }

}
