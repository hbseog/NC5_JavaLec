package chap23_jdbc;

import java.sql.*;

public class _01_jdbc_select {
    public static void main(String[] args) {
        //오라클 드라이버 변수 선언 및 사용 클래스 정의
        final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";

        //접속할 데이터 베이스 url지정
        final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";

        //접속할 계정 정보
        final String USER = "c##study";
        final String PASSWORD = "1234";
        //커넥션 변수 선언
        Connection conn = null;
        //쿼리 구문 변수 선언
        Statement statement = null;
        try {
            //jdbc 드라이버 클래스 로드
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            //sql 쿼리 생성
            statement = conn.createStatement();
            //학생번호, 이름, 평균 기말고사 성적
            String sql =
                    "SELECT SNO, SNAME, AVG(RESULT) AS AV " +
                    "FROM STUDENT " +
                    "NATURAL JOIN SCORE " +
                    "GROUP BY SNO,SNAME";

            //결과를 담아줄 ResultSet 변수 선언
            //select -> executeQuery(sql);
            //insert, update, delete -> executeUpdate(sql);
            ResultSet resultSet = statement.executeQuery(sql);

            //결과 출력
            while (resultSet.next()) {
                String sno = resultSet.getString("sno");
                String sname = resultSet.getString("sname");
                String av = resultSet.getString("AV");
                System.out.println("sno: " + sno + ", 이름: " + sname + ", 평균 성적: " + av);
            }
            //사용된 객체 해제
            resultSet.close();
            statement.close();
            conn.close();

        } catch (SQLException se) {
            System.out.println(se.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //정상종료가 되지 않더라도 객체들은 해제해야 한다.
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException se) {
                    System.out.println(se.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException se) {
                    System.out.println(se.getMessage());
                }
            }
        }
    }
}
