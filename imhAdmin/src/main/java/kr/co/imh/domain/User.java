package kr.co.imh.domain;

public class User {
	
	 private String	 userId;	 // 회원 아이디
	 private String	 userPassword;	 // 회원 비밀번호
	 private String	 userAuthkey;	 // 이메일 인증키
	 private String	 userAuth;	 // 이메일 인증여부
	 private String	 userName;	 // 회원 이름
	 private String	 userNickname;	 // 회원 닉네임
	 private String	 userPhone;	 // 회원 연락처
	 private String	 userImage;	 // 사용자 이미지
	 private int	 userMarketing;	 // 마케팅수신
	 private String	 userCoupon;	 // 회원 쿠폰
	 private int	 userPoint;	 // 회원 포인트
	 private String	 userGrade;	  // 회원 등급
	 private int	 userTotalPrice;	 // 누적 구매액
	 private String	 userJoindate;	 // 회원 가입일
	 private int	 userState;	 // 회원 계정상태
	 private String	 userDropdate;	 // 회원 탈퇴일
	 private int	 userBlacklist;	 // 블랙리스트
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserAuthkey() {
		return userAuthkey;
	}
	public void setUserAuthkey(String userAuthkey) {
		this.userAuthkey = userAuthkey;
	}
	public String getUserAuth() {
		return userAuth;
	}
	public void setUserAuth(String userAuth) {
		this.userAuth = userAuth;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserNickname() {
		return userNickname;
	}
	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserImage() {
		return userImage;
	}
	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}
	public int getUserMarketing() {
		return userMarketing;
	}
	public void setUserMarketing(int userMarketing) {
		this.userMarketing = userMarketing;
	}
	public String getUserCoupon() {
		return userCoupon;
	}
	public void setUserCoupon(String userCoupon) {
		this.userCoupon = userCoupon;
	}
	public int getUserPoint() {
		return userPoint;
	}
	public void setUserPoint(int userPoint) {
		this.userPoint = userPoint;
	}
	public String getUserGrade() {
		return userGrade;
	}
	public void setUserGrade(String userGrade) {
		this.userGrade = userGrade;
	}
	public int getUserTotalPrice() {
		return userTotalPrice;
	}
	public void setUserTotalPrice(int userTotalPrice) {
		this.userTotalPrice = userTotalPrice;
	}
	public String getUserJoindate() {
		return userJoindate;
	}
	public void setUserJoindate(String userJoindate) {
		this.userJoindate = userJoindate;
	}
	public int getUserState() {
		return userState;
	}
	public void setUserState(int userState) {
		this.userState = userState;
	}
	public String getUserDropdate() {
		return userDropdate;
	}
	public void setUserDropdate(String userDropdate) {
		this.userDropdate = userDropdate;
	}
	public int getUserBlacklist() {
		return userBlacklist;
	}
	public void setUserBlacklist(int userBlacklist) {
		this.userBlacklist = userBlacklist;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPassword=" + userPassword + ", userAuthkey=" + userAuthkey
				+ ", userAuth=" + userAuth + ", userName=" + userName + ", userNickname=" + userNickname
				+ ", userPhone=" + userPhone + ", userImage=" + userImage + ", userMarketing=" + userMarketing
				+ ", userCoupon=" + userCoupon + ", userPoint=" + userPoint + ", userGrade=" + userGrade
				+ ", userTotalPrice=" + userTotalPrice + ", userJoindate=" + userJoindate + ", userState=" + userState
				+ ", userDropdate=" + userDropdate + ", userBlacklist=" + userBlacklist + "]";
	}
	 
}
