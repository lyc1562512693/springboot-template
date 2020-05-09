import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcTest {
    public static void main(String[] args) {
        jdbcTemplate();
    }
    public static void jdbcTemplate(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys_db_demo?serverTimezone=UTC","root","123456");
            //con.set
            String sql = "select * from sm_user";
            PreparedStatement pre = con.prepareStatement(sql);
            ResultSet res = pre.executeQuery();
            while (res.next()) {
                System.out.println(res.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
