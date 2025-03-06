package org.example.LowLevelDesign.rateLimiter;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class SlidingWindowRateLimiter {

    private final Cache<String, UserRequestInfo> _requestCache;

    public SlidingWindowRateLimiter() {
        this._requestCache = Caffeine.newBuilder()
                .expireAfterWrite(1, TimeUnit.MINUTES)
                .build();
    }

    public Boolean isRequestAllowed(String userid) {
        if (StringUtils.isNotBlank(userid)) {
            throw new IllegalArgumentException("Key (userId or email) cannot be null or empty");
        }
        UserRequestInfo requestInfo = _requestCache.get(userid, k -> new UserRequestInfo());
        if (requestInfo.get_requestCount().get() >= 5) {
            System.out.println("Reached the limit of 5 requests");
            return false;
        }
        return true;
    }

    @Getter
    private static class UserRequestInfo {
        private AtomicInteger _requestCount;

        UserRequestInfo() {
            this._requestCount = new AtomicInteger(0);
        }

        public void incrementRequestCount() {
            _requestCount.incrementAndGet();
        }
    }


}
