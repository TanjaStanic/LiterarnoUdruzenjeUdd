package la.udd.model.auth;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JwtAuthenticationRequest {
	 private String username;
	  private String password;

	  public JwtAuthenticationRequest() {
	    super();
	  }

	  public JwtAuthenticationRequest(String username, String password) {
	    this.setUsername(username);
	    this.setPassword(password);
	  }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	  
}
