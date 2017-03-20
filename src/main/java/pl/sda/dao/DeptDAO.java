package pl.sda.dao;

import pl.sda.domain.Department;

import java.sql.SQLException;

public interface DeptDAO {
    Department findById(int id) throws Exception;

    void create(Department department) throws Exception;

    void update(Department department) throws Exception;

    void delete(int id) throws Exception;
}
