package com.di1shuai.di1shuaistarter;

import com.di1shuai.di1shuai_starter.entity.Account;
import com.di1shuai.di1shuai_starter.entity.Device;
import com.di1shuai.di1shuai_starter.repository.AccountRepository;
import com.di1shuai.di1shuai_starter.repository.DeviceRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


/**
 * @author: Bruce
 * @date: 2020-04-20
 * @description:
 */
@EnableJpaAuditing
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class DeviceTest {

    @Autowired
    private DeviceRepository deviceRepository;

    @Autowired
    private AccountRepository accountRepository;

    @Test
    public void test() {

        Account find = accountRepository.findById(1l).get();

        List<Device> all = deviceRepository.findAll(Example.of(new Device().setAccountId(find.getId())));
        for (Device device : all) {
            System.out.println(device);
        }
    }


}
