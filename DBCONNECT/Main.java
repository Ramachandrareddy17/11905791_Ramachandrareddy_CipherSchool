package DBCONNECT;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jabtwo","postgres","teja123");
            Statement statement = connection.createStatement();
//            DML
//            statement.executeUpdate("insert into student values(16,22,'kumar','csp')");
//            statement.executeUpdate("update student set name = 'babu' where roll_no = 16");
//            statement.executeUpdate("delete from student where roll_no = 16");

            


//            DQL
            ResultSet resultSet = statement.executeQuery("select * from student");
            while(resultSet.next()){
                System.out.println(resultSet.getInt(1)+" "+resultSet.getInt(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4));
            }
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }
}
