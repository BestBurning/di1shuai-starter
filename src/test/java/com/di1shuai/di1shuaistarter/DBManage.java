package com.di1shuai.di1shuaistarter;

import com.di1shuai.di1shuai_starter.entity.Account;
import com.di1shuai.di1shuai_starter.entity.Device;
import com.di1shuai.di1shuai_starter.enums.Platform;
import com.di1shuai.di1shuai_starter.repository.AccountRepository;
import com.di1shuai.di1shuai_starter.repository.DeviceRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@EnableJpaAuditing
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class DBManage  {


    @Autowired
    private DeviceRepository deviceRepository;

    @Autowired
    private AccountRepository accountRepository;

    @Test
    public void init() {

        Account account = new Account(null,"test","123456","123@123.com","18888888888");
        Account account2 = new Account(null,"admin","123456","111@111.com","16666666666");
        Account save = accountRepository.save(account);
        Account save2 = accountRepository.save(account2);

        List<Device> devices = new ArrayList<Device>();

        devices.add(new Device(null,account.getId(),"p30pro", UUID.randomUUID().toString(), Platform.ANDROID,true,"22:30"));
        devices.add(new Device(null,account.getId(),"shuai-ipad",UUID.randomUUID().toString(), Platform.IOS,false,"11:30"));
        devices.add(new Device(null,account.getId(),"SF",UUID.randomUUID().toString(), Platform.WINDOWS,true,"22:30"));
        devices.add(new Device(null,account.getId(),"shuai-mac",UUID.randomUUID().toString(), Platform.MACOS,true,"20:30"));
        devices.add(new Device(null,account.getId(),"shuai-linux",UUID.randomUUID().toString(), Platform.LINUX,true,"22:30"));

        List<Device> devices2 = new ArrayList<Device>();

        devices.add(new Device(null,account2.getId(),"aaaaaa",UUID.randomUUID().toString(), Platform.ANDROID,true,"22:30"));
        devices.add(new Device(null,account2.getId(),"ddddddd",UUID.randomUUID().toString(), Platform.WINDOWS,true,"22:30"));
        devices.add(new Device(null,account2.getId(),"mmmmmm",UUID.randomUUID().toString(), Platform.MACOS,true,"20:30"));
        devices.add(new Device(null,account2.getId(),"iiiiiii",UUID.randomUUID().toString(), Platform.LINUX,true,"22:30"));
        devices.add(new Device(null,account2.getId(),"mmmmmmm",UUID.randomUUID().toString(), Platform.IOS,false,"11:30"));



        deviceRepository.saveAll(devices);
        deviceRepository.saveAll(devices2);



    }

}
