import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.util.HashMap;
import java.util.Map;

public class ApiTest1 {

	public ApiTest1(String host,  String token) throws MalformedURLException, ProtocolException, IOException {

		Map<String, String> params = new HashMap<String, String>();
		String avatarPath = "Duy";
		String avatarPath2 = "filename.txt";
		
		

		String api = host + Constant.LOG_IN;
		System.out.println("TC1 Login - Nhap dung ");
		params.clear();
		params.put("phonenumber", "0945524285");
		params.put("password", "12345678");
		params.put("uuid", "e48daf89-67de-412c-bc08-3646cc550fc8");
		new HttpRequest(api, params, null, null);

		System.out.println("TC2 Login - sdt chua dki ");
		params.clear();
		params.put("phonenumber", "0945552322");
		params.put("password", "12345678");
		params.put("uuid", "00322049-63c1-4a11-83b0-0f236884fcbb");
		new HttpRequest(api, params, null, null);
//
		System.out.println("TC3 Login - sdt khong co so 0 dung dau ");
		params.clear();
		params.put("phonenumber", "945524285");
		params.put("password", "12345678");
		params.put("uuid", "00322049-63c1-4a11-83b0-0f236884fcbb");
		new HttpRequest(api, params, null, null);
		
		System.out.println("TC4 Login - sdt duoi 10 ky tu");
		params.clear();
		params.put("phonenumber", "094");
		params.put("password", "12345678");
		params.put("uuid", "00322049-63c1-4a11-83b0-0f236884fcbb");
		new HttpRequest(api, params, null, null);
//
		System.out.println("TC5 Login - Sdt tren 10 ky tu	");
		params.clear();
		params.put("phonenumber", "0945543434343");
		params.put("password", "12345678");
		params.put("uuid", "00322049-63c1-4a11-83b0-0f236884fcbb");
		new HttpRequest(api, params, null, null);

		System.out.println("TC6 Login - Mat khau duoi 6 ky tu");
		params.clear();
		params.put("phonenumber", "0945524285");
		params.put("password", "123");
		params.put("uuid", "00322049-63c1-4a11-83b0-0f236884fcbb");
		new HttpRequest( api, params, null, null);

		System.out.println("TC7 Login - Mat khau tren 10 ky tu");
		params.clear();
		params.put("phonenumber", "0945524285");
		params.put("password", "123456sdfgsdgsdfg");
		params.put("uuid", "00322049-63c1-4a11-83b0-0f236884fcbb");
		new HttpRequest( api, params, null, null);

		System.out.println("TC8 Login - Mat khau co ky tu dac biet");
		params.clear();
		params.put("phonenumber", "0945524285");
		params.put("password", "1#345678");
		params.put("uuid", "00322049-63c1-4a11-83b0-0f236884fcbb");
		new HttpRequest( api, params, null, null);
	}
}