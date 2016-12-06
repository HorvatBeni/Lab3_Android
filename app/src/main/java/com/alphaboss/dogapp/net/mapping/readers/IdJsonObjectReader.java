package com.alphaboss.dogapp.net.mapping.readers;

import com.alphaboss.dogapp.net.mapping.ResourceReader;

import org.json.JSONObject;

import static com.alphaboss.dogapp.net.mapping.Api.Dog._ID;


public class IdJsonObjectReader implements ResourceReader<String, JSONObject> {
    private static final String TAG = IdJsonObjectReader.class.getSimpleName();

    @Override
    public String read(JSONObject obj) throws Exception {
        return obj.getString(_ID);
    }
}
