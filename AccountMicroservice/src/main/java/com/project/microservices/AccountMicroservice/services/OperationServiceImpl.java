package com.project.microservices.AccountMicroservice.services;

import com.project.microservices.AccountMicroservice.daos.AccountDao;
import com.project.microservices.AccountMicroservice.daos.OperationDao;
import com.project.microservices.AccountMicroservice.entities.Account;
import com.project.microservices.AccountMicroservice.entities.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service @Transactional
public class OperationServiceImpl implements OperationService {

    @Autowired
    AccountDao accountDao;

    @Autowired
    OperationDao operationDao;


    @Override
    public List<Operation> getAllOperationPerAccount(String accountId){
        return operationDao.findAllOperationsByAccount(accountId);
    }

    @Override
    public List<Account> getAllAccountsPerUser(String userId) {
        return accountDao.getAllAccountsPerUser(userId);
    }

    @Override
    public Operation saveOperation(Operation operation){

        if(operation.getDate() == null){
            operation.setDate(new Date());
        }

        return operationDao.save(operation);
    }



}