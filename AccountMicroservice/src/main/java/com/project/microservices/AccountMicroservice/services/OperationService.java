package com.project.microservices.AccountMicroservice.services;

import com.project.microservices.AccountMicroservice.entities.Account;
import com.project.microservices.AccountMicroservice.entities.Operation;

import java.util.List;

public interface OperationService {

    List<Operation> getAllOperationPerAccount(String accountId);
    List<Account> getAllAccountsPerUser(String userId);
    Operation saveOperation(Operation operation);

}
