package com.tchepannou.auth.client.v1;

public class AuthConstants {
    public static final String ERROR_AUTH_FAILED = "authentication_failed";
    public static final String ERROR_IO = "downstream_error";
    public static final String ERROR_TOKEN_EXPIRED = "token_expired";
    public static final String ERROR_TOKEN_NOT_FOUND = "token_not_found";
    public static final String ERROR_BAD_TOKEN = "bad_token";

    public static final String METRIC_LOGIN = "auth-login";
    public static final String METRIC_LOGOUT = "auth-logout";
    public static final String METRIC_ACCESS_TOKEN = "auth-access-token";

    public static final String QUEUE_EVENT_LOG = "auth-queue-event-log";
    public static final String EVENT_LOGIN = "auth-login";
    public static final String EVENT_LOGOUT = "auth-logout";

    private AuthConstants (){

    }
}
