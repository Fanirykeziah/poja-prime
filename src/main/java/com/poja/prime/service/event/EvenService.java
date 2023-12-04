package com.poja.prime.service.event;

import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Random;

@Service
public class EvenService {
    public BigInteger generatePrime() {
        Random random = new Random();
        return BigInteger.probablePrime(10000, random);
    }
}
