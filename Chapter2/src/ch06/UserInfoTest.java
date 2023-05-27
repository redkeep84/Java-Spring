package ch06;

public class UserInfoTest {

	public static void main(String[] args) {
		
		UserInfo userTomas = new UserInfo();
		userTomas.userName = "Tomas";
		userTomas.userAge = 37;
		userTomas.userGender = "남성";
		userTomas.userStature = 180;
		userTomas.userWeight = 78;
		
		System.out.println(userTomas.showUserInfo());
	}

}
