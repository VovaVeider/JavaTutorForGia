package org.vladimir.java.learn.gia.lessons.lesson2;

import java.util.Objects;

public class Dictionary {

    private KvPair[] pairs = new KvPair[100];

    public void setValue(String key,String value){
        for(int i=0;i<pairs.length;i++){
            if (pairs[i] == null){
                pairs[i] = new KvPair(key,value);
                break;
            }
            if(Objects.equals(pairs[i].key,key)){
                pairs[i].value = value;
                break;
            }
        }
    }

    public static void main(String[] args) {
        Dictionary d = new Dictionary();
        d.setValue("hello","world");
        d.setValue("hello","no world");
        d.setValue(null,"world");
        d.setValue(null,"123");
    }

}
