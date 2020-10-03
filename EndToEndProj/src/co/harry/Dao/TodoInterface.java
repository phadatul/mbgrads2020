package co.harry.Dao;


import java.sql.SQLException;
import java.util.List;

import com.harry.datalayer.Todo;

public interface TodoInterface {

 void insert(Todo todo) throws SQLException;

 List<Todo> select(String username1,String stat);

 List<Todo> selectAll(String username1);

 boolean delete(String taskname,String username1) throws SQLException;

 boolean update(String username1,String taskname, String stat) throws SQLException;

}