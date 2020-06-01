package com.example.transaction.Services;

import org.springframework.stereotype.Service;

@Service()
public class BusinessServiceImpl implements BusinessService {

    @Override
    public Boolean insertTransactionVerification() {
        return true;
    }

    @Override
    public Boolean updateTransactionVerification() {
        return false;
    }
}
