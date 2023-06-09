package chap23_jdbc;

import java.sql.*;

public class _02_jdbc_insert {
    public static void main(String[] args) {
        final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";

        //접속할 데이터 베이스 url지정
        final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";

        //접속할 계정 정보
        final String USER = "c##study";
        final String PASSWORD = "1234";
        //커넥션 변수 선언
        Connection conn = null;
        //쿼리 구문 변수 선언
        //Statement statement = null;
        //파라미터를 가지는 쿼리구문 면수 선언
        PreparedStatement pstmt = null;
        try {
            //jdbc 드라이버 클래스 로드
            Class.forName(JDBC_DRIVER);
            //데이터베이스 연결
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            //sql 쿼리 생성
            //pstmt = conn.createStatement();
            //insert sql쿼리문
            String sql =
                    "INSERT INTO STUDENT " +
                    "VALUES (?,?,?,?,?,?)";


            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,"8003");
            pstmt.setString(2,"임꺽정");
            pstmt.setString(3,"남");
            pstmt.setInt(4,1);
            pstmt.setString(5,"생물");
            pstmt.setDouble(6,3.35);

            //insert, delete, update는 결과로 영향받은 행의 개수를 리턴
            int result = pstmt.executeUpdate();
            if (result == 1){
                System.out.println("저장되었습니다.");
            }
            else System.out.println("저장에 실패하였습니다.");

            //사용된 객체 해제
            pstmt.close();
            conn.close();

        } catch (SQLException se) {
            System.out.println(se.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //정상종료가 되지 않더라도 객체들은 해제해야 한다.
            if (pstmt != null) {
                try {
                    pstmt.close();
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
