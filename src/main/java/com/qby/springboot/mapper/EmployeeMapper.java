package com.qby.springboot.mapper;

import com.qby.springboot.bean.Employee;

//@Mapper 或者 @MapperScan 将接口扫描装配到容器中
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
