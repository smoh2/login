package bw.gov.login.models;

public class RegistrationDTO {
    private String username;
    private String password;
	private String emailId;

    public RegistrationDTO(){
        super();
    }

    public RegistrationDTO(String username, String password){
        super();
        this.username = username;
        this.password = password;
    }

    public String getUsername(){
        return this.username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String toString(){
        return "Registration info: username: " + this.username + " password: " + this.password;
    }

	public String getEmailId() {
		// TODO Auto-generated method stub
		return this.emailId;
	}
	
	public void setEmailId(String emailId){
        this.emailId = emailId;
    }
	
}
