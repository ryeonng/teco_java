package basic.exercise.interfaces;

public class UserInfoClient {

	// main (메인 쓰레드 : 메인 작업자)
	public static void main(String[] args) {
		
		// 사용자에게 정보를 입력 하세요 --> Scanner 활용
		String inputUserName = "홍길동";
		String inputUserPw = "asd123";
		
		// DTO : 데이터들을 받아서(취합 및 가공해서) 전달하는 역할을 가지고 있는 인스턴스.
		UserInfo info1 = new UserInfo(inputUserName, inputUserPw);
		
		// 데이터를 받아 IUserInfoDao를 구현한
		//구현 클래스에게 전달하고자 한다. (UserInfoOracleDaoImpl, UserInfoMySqlDaoImpl)
		
//		IUserInfoDao iUserInfoDao2 = new UserInfoMySqlDaoImpl();
		// 다형성 : UserInfoMySqlDaoImpl2를 IUserInfoDao로 바라볼 수 있다.
		IUserInfoDao iUserInfoDao1 = new UserInfoOracleDaoImpl();
		
		iUserInfoDao1.insertUserInfo(info1);
		iUserInfoDao1.updateUserInfo(info1);
		iUserInfoDao1.deleteUserInfo(info1.getId());
		iUserInfoDao1.selectUserInfo();
		
	} // end of main
	
} // end of class
