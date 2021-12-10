//package com.wibank.bank.repo;
//
//import lombok.val;
//import org.springframework.stereotype.Repository;
//
//import java.math.BigDecimal;
//import java.util.HashMap;
//import java.util.Map;
//
//@Repository
//public class BalanceRepository {
//    private final Map<Long, BigDecimal> storage = new HashMap<>(Map.of(1L, BigDecimal.TEN));
//
//
//    public BigDecimal getBalanceForId(Long accountId) {
//        return storage.get(accountId);
//    }
//
//    public BigDecimal save(Long to, BigDecimal amount) {
//        BigDecimal currentBalance = storage.get(to);
//        if (currentBalance == null) {
//            storage.put(to, amount);
//            return amount;
//        } else {
//            BigDecimal updatedBalance = currentBalance.add(amount);
//            storage.put(to, updatedBalance);
//            return updatedBalance;
//        }
//    }
//}
//