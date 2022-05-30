package com.company;

import java.io.*;

public class Task13 {

    Task13() {
        BufferedReader br = null;
        String str = null;
        try {
            br = new BufferedReader(new FileReader(new File("file.txt")));
            while ((str = br.readLine())!=null) {
                System.out.println(str);
            }
        }catch (FileNotFoundException e){
            System.err.println("File Not Found");
        }catch (IOException e){

        }finally {
            try{
                if(br!=null)
                    br.close();
            } catch (IOException e){
                System.err.println("Close Error");
            }
        }
    }
}
