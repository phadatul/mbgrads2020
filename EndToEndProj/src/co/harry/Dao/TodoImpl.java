package co.harry.Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.harry.datalayer.Todo;

public class TodoImpl implements TodoInterface {


	    

	    public TodoImpl() {}

	    @Override
	    public void insert(Todo todo) throws SQLException 
	    {
	        System.out.println("INSERT INTO todos" + "(title, username, description, target_date,  is_done) VALUES " + " (?, ?, ?, ?, ?);");
	        
	        
	        // try-with-resource statement will auto close the connection.
	        try (Connection connection = JDBCCommon.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO todos" +
	    	        "  (title, username, description, target_date,  is_done) VALUES " + " (?, ?, ?, ?, ?);"
	        		)) 
				        {
				            preparedStatement.setString(1, todo.getTitle());
				            preparedStatement.setString(2, todo.getUsername());
				            preparedStatement.setString(3, todo.getDescription());
				            preparedStatement.setDate(4, JDBCCommon.getSQLDate(todo.getTargetDate()));
				            preparedStatement.setBoolean(5, todo.getStatus());
				            System.out.println(preparedStatement);
				            preparedStatement.executeUpdate();
				        } 
	        catch (SQLException exception) {
	            JDBCCommon.printSQLException(exception);
	        }
	    }

	    @Override
	    public List<Todo> select(String username1,String stat) {
	    	List < Todo > todos = new ArrayList < > ();
	    	Boolean stat1=false;
	    	if (stat.equals("true")) {
        		stat1=true;
        		
        	}
	    	else {
	    		stat1=false;
	    	}
	       
	        try (Connection connection = JDBCCommon.getConnection();
	        		
	        	
	            
	            PreparedStatement preparedStatement = connection.prepareStatement("select * from todos where username =? and is_Done=?");) {
	            preparedStatement.setString(1,username1 );
	            preparedStatement.setBoolean(2, stat1);
	            
	            //System.out.println(preparedStatement);
	            
	            ResultSet rs = preparedStatement.executeQuery();

	            
	            while (rs.next()) {
	                
	                String title = rs.getString("title");
	                String username = rs.getString("username");
	                String description = rs.getString("description");
	                LocalDate targetDate = rs.getDate("target_date").toLocalDate();
	                boolean isDone = rs.getBoolean("is_done");
	                todos.add(new Todo( title, username, description, targetDate, isDone));
	            }
	        } catch (SQLException exception) {
	            JDBCCommon.printSQLException(exception);
	        }
	        return todos;
	    }

	    @Override
	    public List < Todo > selectAll(String username1) {

	        
	        List < Todo > todos = new ArrayList < > ();

	        
	        try (Connection connection = JDBCCommon.getConnection();

	             
	            PreparedStatement preparedStatement = connection.prepareStatement("select * from todos where username = ?");) {
	        	preparedStatement.setString(1, username1);
	            System.out.println(preparedStatement);
	            
	            ResultSet rs = preparedStatement.executeQuery();

	          
	            while (rs.next()) {
	                
	                String title = rs.getString("title");
	                String username = rs.getString("username");
	                String description = rs.getString("description");
	                LocalDate targetDate = rs.getDate("target_date").toLocalDate();
	                boolean isDone = rs.getBoolean("is_Done");
	                

	                todos.add(new Todo( title, username, description, targetDate, isDone));
	            }
	        } catch (SQLException exception) {
	            JDBCCommon.printSQLException(exception);
	        }
	        return todos;
	    }

	    @Override
	    public boolean delete(String taskname,String username1) throws SQLException {
	        boolean rowDeleted;
	        try (Connection connection = JDBCCommon.getConnection(); PreparedStatement statement = connection.prepareStatement("delete from todos where title=? and username=? ");) {
	            statement.setString(1, taskname);
	            statement.setString(2, username1);
	            rowDeleted = statement.executeUpdate() > 0;
	        }
	        return rowDeleted;
	    }

	    @Override
	    public boolean update(String username1,String taskname, String stat ) throws SQLException {
	    	Boolean stat1=false;
	    	if (stat.equals("true")) {
        		stat1=true;
        		
        	}
	    	else {
	    		stat1=false;
	    	}
	        boolean rowUpdated;
	        try (Connection connection = JDBCCommon.getConnection(); PreparedStatement statement = connection.prepareStatement("update todos set is_done = ? where username = ? and title=?;");) {
	            statement.setBoolean(1,stat1 );
	            statement.setString(2,username1 );
	            
	            statement.setString(3,taskname );
	            //statement.setLong(6, todo.getId());
	            rowUpdated = statement.executeUpdate() > 0;
	        }
	        return rowUpdated;
	    }

}
