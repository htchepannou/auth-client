package com.tchepannou.auth.client.v1;

public class AuthErrors {
    public static String IO_ERROR = "connection_error";
    public static String AUTH_FAILED = "authentication_failed";
    public static String TOKEN_EXPIRED = "token_expired";
    public static String TOKEN_NOT_FOUND = "token_not_found";
    public static String BAD_TOKEN = "bad_token";

    private AuthErrors(){
    }
}
