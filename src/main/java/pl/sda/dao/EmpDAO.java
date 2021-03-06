package pl.sda.dao;

import pl.sda.domain.Employee;

import java.math.BigDecimal;
import java.util.List;

public interface EmpDAO {
    Employee findById(int id) throws Exception;

    void create(Employee employee) throws Exception;

    void update(Employee employee) throws Exception;

    void delete(int id) throws Exception;

    void create(List<Employee> employees) throws Exception;

    BigDecimal getTotalSalaryByDept(int dept) throws Exception;
}
