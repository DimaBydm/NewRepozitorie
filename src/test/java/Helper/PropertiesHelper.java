package Helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesHelper {

    //Переменная хелпер (инстанс?)
    public final static PropertiesHelper INSTANCE = new PropertiesHelper();
    //Переменная для работы с файлами пропертис:
    private Properties properties;


    // Чтение из файла:
    private PropertiesHelper(){
        properties = new Properties();

        try {
            FileInputStream file = new FileInputStream(new File("data.properties"));
            properties.load(file);
        }catch (Exception e){
            System.out.println("data.properties file is not found!");
        }
    }

    // Получаем значение из файла по ключу:
    public synchronized String getProperties(String key){
        String value;
        value = (String)properties.get(key);
        return value;
    }



}
