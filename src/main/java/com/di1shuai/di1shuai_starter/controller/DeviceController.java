package com.di1shuai.di1shuai_starter.controller;

import com.di1shuai.di1shuai_starter.entity.Device;
import com.di1shuai.di1shuai_starter.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author: Bruce
 * @date: 2020-04-20
 * @description:
 */
@RequestMapping("/device")
@RestController
public class DeviceController extends BaseController {

    @Autowired
    private DeviceRepository deviceRepository;


    @GetMapping(path = "/{id}")
    public Device getById(@PathVariable Long id){
        return deviceRepository.findById(id).get();
    }

    @GetMapping
    public List<Device> list(Device device){
        return deviceRepository.findAll(Example.of(device));
    }

    @PostMapping
    public Device create(@RequestBody Device device){
        return deviceRepository.save(device);
    }


    @PutMapping
    public Device update(@RequestBody Device device){
        return deviceRepository.save(device);
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable Long id){
        deviceRepository.deleteById(id);
    }


}
