package DataProviders;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import org.testng.annotations.DataProvider;
import pojo.ProductData;

public class ProductDataProvider {
    @DataProvider(name = "getSearchDataFromJson")
    public Object[][] getSearchDataFromJson() throws FileNotFoundException{
        JsonElement jsonData = JsonParser.parseReader(new FileReader("src/test/java/DataFiles/ProductData.json"));
        JsonElement SearchDataSet = jsonData.getAsJsonObject().get("dataset");

        List<ProductData> productData = new Gson().fromJson(SearchDataSet, new TypeToken <List<ProductData>>(){}.getType());

        Object[][] returnValue = new Object[productData.size()][1];

        int index = 0;
        for(Object [] each: returnValue){
            each[0] = productData.get(index++);
        }
        return returnValue;
    }
}
