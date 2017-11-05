package com.srivastava.actions;

import java.util.Date;

public class MyAction {
		private String user;
		private String message;
		private String userid;
		private String password;
		
		
		public String checkLogin(){
			if(userid.equals(password)){
			message = "Welcome "+userid+ " Login Date Time "+new Date();
			return "success";
			}
			else{
				message = "Invalid userid or password";
				return "fail";
			}
		}
		
		
		public String getUserid() {
			return userid;
		}

		public void setUserid(String userid) {
			this.userid = userid;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String userInfo(){
			this.setMessage("Welcome");
			this.setUser("Amit");
			return "success";
		}
		
		public String getUser() {
			return user;
		}
		public void setUser(String user) {
			this.user = user;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		
}
