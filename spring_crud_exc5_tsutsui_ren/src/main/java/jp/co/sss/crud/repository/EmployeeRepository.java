package jp.co.sss.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.sss.crud.entity.Department;
import jp.co.sss.crud.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	Employee findByEmpIdAndEmpPass(Integer empId, String empPass);

	List<Employee> findAllByOrderByEmpIdAsc();

	List<Employee> findByempNameContaining(String empName);

	List<Employee> findByDepartmentOrderByEmpIdAsc(Department department);
	
	
//	論理削除用
	Employee findByEmpIdAndEmpPassAndDeletedFlag(Integer empId, String empPass, Integer deletedFlag);
	
	Employee findByEmpIdAndDeletedFlag(Integer empId, Integer deletedFlag);
	
	List<Employee> findByDeletedFlagOrderByEmpIdAsc(Integer deletedFlag);
	 
	List<Employee> findByEmpNameContainingAndDeletedFlag(String empName, Integer deletedFlag);
	 
	List<Employee> findByDepartmentAndDeletedFlagOrderByEmpIdAsc(Department department, Integer deletedFlag);

}