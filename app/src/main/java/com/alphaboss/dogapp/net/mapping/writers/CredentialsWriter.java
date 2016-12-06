package com.alphaboss.dogapp.net.mapping.writers;

import android.util.JsonWriter;


import com.alphaboss.dogapp.content.User;

import java.io.IOException;

import static com.alphaboss.dogapp.net.mapping.Api.Auth.PASSWORD;
import static com.alphaboss.dogapp.net.mapping.Api.Auth.USERNAME;

public class CredentialsWriter implements ResourceWriter<User, JsonWriter> {
    @Override
    public void write(User user, JsonWriter writer) throws IOException {
        writer.beginObject();
        {
            writer.name(USERNAME).value(user.getUsername());
            writer.name(PASSWORD).value(user.getPassword());
        }
        writer.endObject();
    }
}