package guillaume.agis.techtest.api;

import java.lang.System;

/**
 * Utils to check the type of HTTP error thrown
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lguillaume/agis/techtest/api/HttpErrorUtils;", "", "()V", "hasLostInternet", "", "throwable", "", "app_debug"})
public final class HttpErrorUtils {
    
    /**
     * Check if the user has list the connexion given the throwable thrown
     * @param throwable throwable to check
     * @return true if he user has lost connexion, false otherwise
     */
    public final boolean hasLostInternet(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
        return false;
    }
    
    public HttpErrorUtils() {
        super();
    }
}