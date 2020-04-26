package com.di1shuai.di1shuai_starter.repository;

import com.di1shuai.di1shuai_starter.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface DeviceRepository extends JpaRepository<Device, Long> {


    List<Device> findAllByAccountId(Long accountId);

}
