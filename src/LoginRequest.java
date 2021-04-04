import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.util.HashMap;
import java.util.Map;

public class LoginRequest {
	private String token;
	public LoginRequest(String host) throws MalformedURLException, ProtocolException, IOException {

		Map<String, String> params = new HashMap<String, String>();

		String api = host + Constant.LOG_IN;

		System.out.println("TC1 Login - Nhap dung ");
		params.clear();
		params.put("phonenumber", "0213456789");
		params.put("password", "12345678");
		params.put("uuid", "e48daf89-67de-412c-bc08-3646cc550fc8");
		HttpRequest login = new HttpRequest(api, params, null, null);
		this.token = login.getResponse().data.token; 
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
}
