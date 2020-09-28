import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class User {
	String fName;
	String lName;
	String eMail;
	String pNumber;
	String pWord;
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getpNumber() {
		return pNumber;
	}
	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;
	}
	public String getpWord() {
		return pWord;
	}
	public void setpWord(String pWord) {
		this.pWord = pWord;
	}	

}



public class User_ValidationUC {
	
	public boolean validate_fName(String s) {
		String regex ="^[A-Z]{1}[a-z]{2,}$";		 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		
		if(matcher.matches()) 
			return true;
		else 
			return false;
		
	}
	public boolean validate_eMail(String s) {
		String regex ="^[\\\\w-\\\\+]+(\\\\.[\\\\w]+)*@[\\\\w-]+(\\\\.[\\\\w]{2,})?(\\\\.[a-z]{2,})?$";		 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		
		if(matcher.matches()) 
			return true;
		else 
			return false;
	}
	
	public static void main(String[] args) {
		User_ValidationUC uc = new User_ValidationUC(); 
		User user = new User();
		Scanner sc = new Scanner(System.in);
		int flag_1 =0; int flag_2=0; int flag_3=0;
		while(true){
			do {
				System.out.println("Enter First Name : ");
				String fName= sc.nextLine();
			
				if(uc.validate_fName(fName)) {
					user.setfName(fName);
					flag_1=1;
				}
				else {
					System.out.println("Invalid Input f_name");
				}
			} while(flag_1==0);
			
			
			do {
				System.out.println("Enter Last Name : ");
				String lName= sc.nextLine();
			
				if(uc.validate_fName(lName)) {
					user.setlName(lName);
					flag_2=1;
				}
				else {
					System.out.println("Invalid Input l_name");
				}
			} while(flag_2==0);
			
			do {
				System.out.println("Enter eMail : ");
				String eMail= sc.nextLine();
			
				if(uc.validate_eMail(eMail)) {
					user.setlName(eMail);
					flag_3=1;
				}
				else {
					System.out.println("Invalid Input e_Mail");
				}
			} while(flag_3==0);
			
			
			
		}

	}

}