import java.sql.SQLException;
import java.util.Scanner;

public class UserView {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(true){
		System.out.println("1. Register");
		System.out.println("2. Login");
		System.out.println("3. Exit");
		System.out.println("Enter the Choice");
		int choice = scanner.nextInt();
		if(choice == 1){
			System.out.println("Enter the Userid ");
			String userid = scanner.next();
			System.out.println("Enter the Password");
			String pwd = scanner.next();
			UserDTO userDTO = new UserDTO(userid,pwd);
			LoginDAO loginDAO = new LoginDAO();
			if(loginDAO.add(userDTO)){
				System.out.println("Register Done..");
			}
			else{
				System.out.println("Not Register...");
			}
			//System.out.println("Console is "+System.console());
			//char arr[] = System.console().readPassword();
			//System.out.println("Password is "+arr.length);
			//String password = String.valueOf(arr);
			//System.out.println("Password is "+password);
		}
		else
		if(choice ==2){	
			System.out.println("Enter the Userid ");
			String userid = scanner.next();
			System.out.println("Enter the Password");
			String pwd = scanner.next();
			UserDTO userDTO = new UserDTO(userid,pwd);
			LoginDAO loginDAO = new LoginDAO();
			String message = loginDAO.read(userDTO);
			System.out.println(message);
		}
		else
		{
			return ;
		}
		}
		

	}

}
