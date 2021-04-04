import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.util.HashMap;
import java.util.Map;
//TC719i0Jylg6SQ6KHg062Qxvibb3yTfxtXpvAlpI

public class ApiTest3 {
	
	public ApiTest3( String host,  String token) throws MalformedURLException, ProtocolException, IOException {

		Map<String, String> params = new HashMap<String, String>();
		String avatarPath = "Duy";
		String avatarPath2 = "filename.txt";
		String bigFile = "bigFile.pdf";
		String api = host + Constant.CHANGE_INFO_AFTER_SIGNUP;

		System.out.println("--------------------Test case voi HOST la: " + host + "---------------------------");
		System.out.println("------------------------ API CHANGE_INFO_AFTER_SIGNUP -------------------------------------------" );
		File file = new File(bigFile);
		System.out.println(file.exists());


		System.out.println("TC1 - đúng");
		params.clear();
		params.put("username", "duy");
		params.put("token", token);
		new HttpRequest(api, params, null, avatarPath);

		System.out.println("TC2 - token ngắn");
		params.clear();
		params.put("username", "duy");
		params.put("token", "60|za0wtiB9F5oj");
		new HttpRequest(api, params, null, avatarPath);

		System.out.println("TC3 - token đê trống");
		params.clear();
		params.put("username", "duy");
		params.put("token", "");
		new HttpRequest(api, params, null, avatarPath);
//
		System.out.println("TC4 - mã phiên cũ");
		params.clear();
		params.put("username", "duy");
		params.put("token", "60|za0wtiB9F5ojyZm8LYilB7kNJ8WGooaZJrHZiuNF");
		new HttpRequest(api, params, null, avatarPath);

		System.out.println("TC5- tên quá dài");
		params.clear();
		params.put("username", "dddđuuuuuuuuuuuyyy");
		params.put("token", token);
		new HttpRequest(api, params, null, avatarPath);

		System.out.println("TC6- file lớn");
		params.clear();
		params.put("username", "duy");
		params.put("token", token);
		new HttpRequest(api, params, null, avatarPath);

		System.out.println("TC7- Không có avatar");
		params.clear();
		params.put("username", "duy");
		params.put("token", token);
		new HttpRequest(api, params, token, "");

		System.out.println("TC8 - không có username ");
		params.clear();
		params.put("username", "");
		params.put("token", token);
		new HttpRequest(api, params, null, avatarPath);
//
		System.out.println("-----------------------------------------------------------------------" );
	}
}
