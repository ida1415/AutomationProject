package DataProviders;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import org.testng.annotations.DataProvider;
import pojo.RegisterData;

public class RegisterDataProvider {
    @DataProvider(name = "getRegisterDataFromJson")
    public Object[][] getRegisterDataFromJson() throws FileNotFoundException{
        JsonElement jsonData = JsonParser.parseReader(new FileReader("src/test/java/DataFiles/RegisterData.json"));
        JsonElement registerDataSet = jsonData.getAsJsonObject().get("dataset");

        List<RegisterData> registerData = new Gson().fromJson(registerDataSet, new TypeToken <List<RegisterData>>(){}.getType());

        Object[][] returnValue = new Object[registerData.size()][1];

        int index = 0;
        for(Object [] each: returnValue){
            each[0] = registerData.get(index++);
        }
        return returnValue;
    }
}
