package com.di1shuai.di1shuai_starter.repository;

import com.di1shuai.di1shuai_starter.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AccountRepository extends JpaRepository<Account,Long> {

    @Query("select a from Account a " +
            "where (a.email = :username or a.phone = :username) " +
            "and a.password = :password ")
    Account findLogin(@Param("username") String username, @Param("password") String password);

}
