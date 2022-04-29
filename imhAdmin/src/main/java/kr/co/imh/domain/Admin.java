package kr.co.imh.domain;

public class Admin {
	
	private String adminId; // 관리자 아이디
	private String adminPw; // 관리자 비밀번호
	private String adminEno; // 관리자 사원번호
	private String adminName; // 관리자 이름
	private String adminBirth; // 관리자 생년월일
	private String adminPhone; // 관리자 연락처
	private String adminEmail; // 관리자 이메일
	private String adminImage; // 관리자 이미지
	private String adminDno; // 관리자 부서번호
	private String adminJoindate; // 관리자 등록일
	private String adminAuth; // 관리자 권한
	private int adminState; // 계정사용여부
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminPw() {
		return adminPw;
	}
	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}
	public String getAdminEno() {
		return adminEno;
	}
	public void setAdminEno(String adminEno) {
		this.adminEno = adminEno;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminBirth() {
		return adminBirth;
	}
	public void setAdminBirth(String adminBirth) {
		this.adminBirth = adminBirth;
	}
	public String getAdminPhone() {
		return adminPhone;
	}
	public void setAdminPhone(String adminPhone) {
		this.adminPhone = adminPhone;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public String getAdminImage() {
		return adminImage;
	}
	public void setAdminImage(String adminImage) {
		this.adminImage = adminImage;
	}
	public String getAdminDno() {
		return adminDno;
	}
	public void setAdminDno(String adminDno) {
		this.adminDno = adminDno;
	}
	public String getAdminJoindate() {
		return adminJoindate;
	}
	public void setAdminJoindate(String adminJoindate) {
		this.adminJoindate = adminJoindate;
	}
	public String getAdminAuth() {
		return adminAuth;
	}
	public void setAdminAuth(String adminAuth) {
		this.adminAuth = adminAuth;
	}
	public int getAdminState() {
		return adminState;
	}
	public void setAdminState(int adminState) {
		this.adminState = adminState;
	}
	
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminPw=" + adminPw + ", adminEno=" + adminEno + ", adminName="
				+ adminName + ", adminBirth=" + adminBirth + ", adminPhone=" + adminPhone + ", adminEmail=" + adminEmail
				+ ", adminImage=" + adminImage + ", adminDno=" + adminDno + ", adminJoindate=" + adminJoindate
				+ ", adminAuth=" + adminAuth + ", adminState=" + adminState + "]";
	}

}
