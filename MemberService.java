package methodOverload;

public class MemberService {
	
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�");
			memberService.logout("hong");
		}
		else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�");
		}
	}
	
	boolean login(String id, String password) {
		if(id == "hong" && password == "12345") {
			return true;
		}
		else {
			return false;
		}
	}
	
	String logout(String id) {
		return id = "�α׾ƿ� �Ǿ����ϴ�";
	}
}
