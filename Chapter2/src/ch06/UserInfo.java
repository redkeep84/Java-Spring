package ch06;

public class UserInfo {
	
	public String userName;
	public String userGender;
	public int userStature;
	public int userWeight;
	public int userAge;
	
	public UserInfo() {}
	
	public UserInfo(String userName, String userGender, int userStaure, int userWeight, int userAge) {
		this.userName = userName;
		this.userGender = userGender;
		this.userStature = userStaure;
		this.userWeight = userWeight;
		this.userAge = userAge;
	}
	
	public String showUserInfo() {
		return "키가 " + userStature + "이고 " + "몸무게가 " + userWeight + "킬로인 " + userGender + "이 있습니다. " + "이름은 " + userName + " 이고 " + "나이는 " + userAge + "세 입니다.";
	}
}
