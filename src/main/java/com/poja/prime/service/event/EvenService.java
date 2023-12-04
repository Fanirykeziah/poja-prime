package com.poja.prime.service.event;

import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Random;

@Service
public class EvenService {
    public BigInteger isEven(){
        int bitLength = 10000;
        Random random = new Random();
        BigInteger prime = BigInteger.probablePrime(bitLength, random);

        return prime;
    }
}
