package com.xzl.bookstore.service.impl;

import com.xzl.bookstore.dao.AddressMapper;
import com.xzl.bookstore.pojo.po.Address;
import com.xzl.bookstore.pojo.po.AddressExample;
import com.xzl.bookstore.service.AddressService;
import com.xzl.bookstore.util.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    AddressMapper addressMapper;
    @Override
    public List<Address> searchByUserId(Integer userId) {
        AddressExample addressExample = new AddressExample();
        AddressExample.Criteria criteria = addressExample.createCriteria().andUserIdEqualTo(userId);
        List<Address> addresses = null;
        try {
            addresses = addressMapper.selectByExample(addressExample);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
        }
        return addresses;
    }

    @Override
    public Result save(Address address) {
        Result result = new Result();
        int i = 0;
        try {
            i = addressMapper.insertSelective(address);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
        }
        if(i == 0){
            result.setSuccess(false);
            result.setMessage("保存失败");
            return result;
        }else {
            result.setMessage("保存成功");
            result.setSuccess(true);
            return result;
        }
    }

    @Override
    public Result delete(Integer id) {
        int count = addressMapper.deleteByPrimaryKey(id);
        if(count == 1){
            return new Result("",true,"删除成功");
        }
        return new Result("",false,"删除失败");
    }

    @Override
    public Result update(Address address) {

        int count = addressMapper.updateByPrimaryKeySelective(address);
        if(count == 1) {
            return new Result("", true, "修改成功");
        }
        return new Result("",false,"修改失败");
    }

    @Override
    public Address getById(Integer id) {
        return addressMapper.selectByPrimaryKey(id);
    }
}
