package org.example.LowLevelDesign.rateLimiter;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Service
public class TokenBucketRateLimiter {


    private int maxTokensPerBucket;
    private int refillRate;

    private static ConcurrentHashMap<String, Bucket> bucketMap = new ConcurrentHashMap<>();

    TokenBucketRateLimiter() {
        this.maxTokensPerBucket = 2;
        this.refillRate = 5; // in second

        // Schedule token refilling every second
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(() -> {

            for (Bucket bucket : bucketMap.values()) {
                synchronized (bucket) {
                    bucket.tokens = Math.min(maxTokensPerBucket, bucket.tokens + refillRate);
                }
            }


        }, 1, 1, TimeUnit.SECONDS);
    }


    public Boolean isRequestAllowed(String userId) {

        Bucket bucket = bucketMap.computeIfAbsent(userId, k -> new Bucket(maxTokensPerBucket));

        synchronized (bucket) {

            if (bucket.getTokens() > 0) {
                bucket.setTokens(bucket.getTokens() - 1);
                return true;
            }
            return false;
        }

//        if (bucketMap.containsKey(userId)) {
//            Bucket bucket = bucketMap.get(userId);
//            if (bucket.getTokens() > 0) {
//                bucket.setTokens(bucket.getTokens() - 1);
//            } else {
//                // return false , as we don't have any tokens left
//            }
//        } else {
//            Bucket bucket = new Bucket(maxTokensPerBucket);
//            bucketMap.put(userId, bucket);
//
//        }
    }


    @Data
    public static class Bucket {
        int tokens;

        Bucket(int tokens) {
            this.tokens = tokens;
        }
    }

}
