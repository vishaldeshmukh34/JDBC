package jdbc;

import java.sql.*;
import java.util.Scanner;

public class StudentCRUD {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            Connection con = DBConnection.getConnection();

            while (true) {

                System.out.println("\n===== STUDENT MENU =====");
                System.out.println("1. Insert Student");
                System.out.println("2. View Students");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");

                int choice = sc.nextInt();

                switch (choice) {

                    // INSERT
                    case 1:
                        PreparedStatement ps1 =
                            con.prepareStatement("INSERT INTO student VALUES (?,?,?)");

                        System.out.print("Enter ID: ");
                        ps1.setInt(1, sc.nextInt());

                        System.out.print("Enter Name: ");
                        ps1.setString(2, sc.next());

                        System.out.print("Enter Age: ");
                        ps1.setInt(3, sc.nextInt());

                        ps1.executeUpdate();
                        System.out.println("Student Inserted");
                        break;

                    // VIEW
                    case 2:
                        Statement stmt = con.createStatement();
                        ResultSet rs = stmt.executeQuery("SELECT * FROM student");

                        System.out.println("ID  NAME  AGE");
                        while (rs.next()) {
                            System.out.println(
                                rs.getInt(1) + "  " +
                                rs.getString(2) + "  " +
                                rs.getInt(3)
                            );
                        }
                        break;

                    // UPDATE
                    case 3:
                        PreparedStatement ps2 =
                            con.prepareStatement(
                                "UPDATE student SET age=? WHERE id=?");

                        System.out.print("Enter ID: ");
                        int uid = sc.nextInt();

                        System.out.print("Enter New Age: ");
                        int age = sc.nextInt();

                        ps2.setInt(1, age);
                        ps2.setInt(2, uid);

                        ps2.executeUpdate();
                        System.out.println("Student Updated");
                        break;

                    // DELETE
                    case 4:
                        PreparedStatement ps3 =
                            con.prepareStatement(
                                "DELETE FROM student WHERE id=?");

                        System.out.print("Enter ID: ");
                        ps3.setInt(1, sc.nextInt());

                        ps3.executeUpdate();
                        System.out.println("Student Deleted");
                        break;

                    // EXIT
                    case 5:
                        con.close();
                        sc.close();
                        System.out.println("Program Closed");
                        System.exit(0);

                    default:
                        System.out.println("Invalid Choice");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
