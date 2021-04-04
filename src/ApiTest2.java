import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.util.HashMap;
import java.util.Map;

public class ApiTest2 {


	public  ApiTest2(String host, String token) throws MalformedURLException, ProtocolException, IOException {
	
		Map<String, String> params = new HashMap<String, String>();
		String avatarPath = "duy";
		String avatarPath2 = "filename.txt";
		
		String bigFile = "bigFile.pdf";
		String api = host + Constant.ADD_POST;
		
		System.out.println("--------------------Test case voi HOST la: " + host + "---------------------------");
		System.out.println("------------------------ API ADD_POST -----------------------------------------------" );
	
		System.out.println("TC0 - đúng");
		params.clear();
		params.put("described","duy");
		params.put("token", token);
		new HttpRequest(api, params, token, null);
		
		System.out.println("TC1 - mã phiên cũ");
		params.clear();
		params.put("described","duy");
		params.put("token", "60|za0wtiB9F5ojyZm8LYilB7kNJ8WGooaZJrHZiuNF");
		new HttpRequest(api, params, null, null);
		
		System.out.println("TC2 - token trống");
		params.clear();
		params.put("described","duy");
		params.put("token", "");
		new HttpRequest(api, params, null, null);
		
		System.out.println("TC3 - token ngắn");
		params.clear();
		params.put("described","duy");
		params.put("token", "81|HOXe9");
		new HttpRequest(api, params, null, null);
		
		System.out.println("TC4 - token dài");
		params.clear();
		params.put("described","duy");
		params.put("token", "81|HOXe95ItaXQrLBUcpCy7v2tXVei6oGABXzUAXi0BBADDDDD");
		new HttpRequest(api, params,null, null);

		System.out.println("TC6 - avatar lớn");
		params.clear();
		params.put("described","duy");
		params.put("token", token);
		new HttpRequest(api, params, null, null);
		
		System.out.println("TC7 - avatar trống");
		params.clear();
		params.put("described","duy");
		params.put("token", token);
		new HttpRequest(api, params, token , "");
		
		System.out.println("-----------------------------------------------------------------------" );
	}
}