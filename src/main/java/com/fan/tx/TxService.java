package com.fan.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TxService {
    @Autowired
    private TxDao txDao;

    @Transactional
    public void insert() {
        txDao.insert();
//        int i = 9 / 0;
    }
}
