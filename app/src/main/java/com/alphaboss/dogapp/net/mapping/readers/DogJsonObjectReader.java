package com.alphaboss.dogapp.net.mapping.readers;


import com.alphaboss.dogapp.content.Dog;
import com.alphaboss.dogapp.net.mapping.ResourceReader;

import org.json.JSONObject;

import static com.alphaboss.dogapp.net.mapping.Api.Dog.IMG;
import static com.alphaboss.dogapp.net.mapping.Api.Dog.STATUS;
import static com.alphaboss.dogapp.net.mapping.Api.Dog.TEXT;
import static com.alphaboss.dogapp.net.mapping.Api.Dog.UPDATED;
import static com.alphaboss.dogapp.net.mapping.Api.Dog.USER_ID;
import static com.alphaboss.dogapp.net.mapping.Api.Dog.VERSION;
import static com.alphaboss.dogapp.net.mapping.Api.Dog._ID;


public class DogJsonObjectReader implements ResourceReader<Dog, JSONObject> {
    private static final String TAG = DogJsonObjectReader.class.getSimpleName();

    @Override
    public Dog read(JSONObject obj) throws Exception {
        Dog dog = new Dog();
        dog.setId(obj.getString(_ID));
        dog.setText(obj.getString(TEXT));
        dog.setImg(obj.getString(IMG));
        dog.setUpdated(obj.getLong(UPDATED));
        dog.setStatus(Dog.Status.valueOf(obj.getString(STATUS)));
        dog.setUserId(obj.getString(USER_ID));
        dog.setVersion(obj.getInt(VERSION));
        return dog;
    }
}
