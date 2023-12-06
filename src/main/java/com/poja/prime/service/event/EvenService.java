package com.poja.prime.service.event;

import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.security.SecureRandom;

@Service
public class EvenService {
    public BigInteger generatePrime() {
        SecureRandom random = new SecureRandom();

        BigInteger prime;
        int certainty = 90;

        do {
            prime = new BigInteger(10000, random);
        } while (!prime.isProbablePrime(certainty));

        return prime;
    }
}
