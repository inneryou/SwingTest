package com.turedurenaru;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadConfig {
  Map<String,String> mapParam= new HashMap<String,String>();
  String confFileName = "conf.txt";
  File file = new File(confFileName);
  public ReadConfig(){
    if(fileCheck()){
      readConfigFile();
      writeParam();
    }else{
      System.out.println("ファイルが見つかりませんでした。\n" + file.toPath());
    }
  }

  private boolean fileCheck(){
    boolean flag = file.exists();
    return flag;
  }

  private void readConfigFile(){
    try{
      BufferedReader br = new BufferedReader(new FileReader(confFileName));
      String line;
      while((line = br.readLine()) != null){
        if((line.length()>0)&&(!line.startsWith("#"))){
          String[] aryStr = line.split(":");
          if(aryStr.length>1){
            mapParam.put(aryStr[0],aryStr[1]);
          }
        }
      }
    }catch(IOException e){
      e.printStackTrace();
    }
  }

  private void writeParam(){
    for(String key: mapParam.keySet()){
      String value = mapParam.get(key);
      System.out.println(key + "の値は" + value + "です。");
    }
  }
}
