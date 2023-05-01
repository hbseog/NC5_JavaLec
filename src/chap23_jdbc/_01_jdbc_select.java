package chap23_jdbc;

import java.sql.SQLException;

public class _01_jdbc_select {
    public static void main(String[] args) {
        //오라클 드라이버 변수 선언 및 사용 클래스 정의
        final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";

        //접속할 데이터 베이스 url지정
        final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";
        
        //접속할 계정 정보
        final String USER = "c##study";
        final String PASSWORD = "1234";
        try {
            //jdbc 드라이버 클래스 로드
            Class.forName(JDBC_DRIVER);
        }catch(SQLException se){
                System.out.println(se.getMessage());
            }catch (Exception e){
            System.out.println(e.getMessage());
        } finally {

        }
    }
}
