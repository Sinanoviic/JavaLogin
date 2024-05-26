import java.util.HashMap;

public class IDPassword {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDPassword(){
        logininfo.put("sinanovic","uae");
        logininfo.put("france","paris");
        logininfo.put("d1d2d3","1234");
    }
    protected HashMap getLoginInfo(){
        return logininfo;
    }
}
