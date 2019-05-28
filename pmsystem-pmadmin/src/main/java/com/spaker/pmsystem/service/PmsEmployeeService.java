package com.spaker.pmsystem.service;

import com.spaker.pmsystem.dto.PmsEmployeeParam;
import com.spaker.pmsystem.model.PmsEmployee;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Created by sunshine on 2019/3/24.
 */
public interface PmsEmployeeService {

    List<PmsEmployee>listAllEmployee();

    int createEmployee(PmsEmployeeParam PmsEmploeeParam);
    @Transactional
    int updateEmployee(int id,PmsEmployeeParam PmsEmploeeParam);

    int deleteEmployee(int id);

    List<PmsEmployee>listEmployee(PmsEmployeeParam keyword, int pageNum, int pageSize);

    PmsEmployee getEmployee(int id);

//    boolean batchImport(String fileName, MultipartFile file)throws  Exception;

}