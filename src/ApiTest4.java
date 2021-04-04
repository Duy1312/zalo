import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.util.HashMap;
import java.util.Map;

public class ApiTest4 {

    public ApiTest4(String host, String token) throws MalformedURLException, ProtocolException, IOException {

        Map<String, String> params = new HashMap<String, String>();
        String avatarPath = "duy";
        String avatarPath2 = "filename.txt";
        String bigFile = "bigFile.pdf";

        String api = host + Constant.CHECK_VERIFY_CODE;

        System.out.println("--------------------Test case voi HOST la: " + host + "---------------------------");
        System.out.println("------------------------ API CHECK_VERIFY_CODE -----------------------------------");

        System.out.println("TC0 - đúng");
        params.clear();
        params.put("phonenumber", "0213456789");
        params.put("code_verify", "4861");
        new HttpRequest(api, params, null, null);

        System.out.println("TC1 - SDT chua duoc dky");
        params.clear();
        params.put("phonenumber", "0943568659");
        params.put("code_verify", "4861");
        new HttpRequest(api, params, token, null);

        System.out.println("TC2 - SDT khong dung dinh dang");
        params.clear();
        params.put("phonenumber", "5412fgsd");
        params.put("code_verify", "7226");
        new HttpRequest(api, params, token, null);

        System.out.println("TC3 - sdt da duoc xac thuc ");
        params.clear();
        params.put("phonenumber", "0987654321");
        params.put("code_verify", "7226");
        new HttpRequest(api, params, token, null);

        System.out.println("TC4 - khong truyen ma xac thuc ");
        params.clear();
        params.put("phonenumber", "0987654321");
        params.put("username", "Nhom2");
        new HttpRequest(api, params, token, null);
    }
}
