import com.thinking.machines.hr.dl.interfaces.dto.*;
import com.thinking.machines.hr.dl.interfaces.dao.*;
import com.thinking.machines.hr.dl.exceptions.*;
import com.thinking.machines.hr.dl.dto.*;
import com.thinking.machines.hr.dl.dao.*;
import java.util.*;
import java.io.*;
import java.math.*;
import java.text.*;
class employeeGetCountTestcase
{
public static void main(String gg[])
{
try
{
EmployeeDAOInterface employeeDAO=new EmployeeDAO();
System.out.println(employeeDAO.getCount());
}catch(DAOException daoException)
{
System.out.println(daoException.getMessage());
}
}

}