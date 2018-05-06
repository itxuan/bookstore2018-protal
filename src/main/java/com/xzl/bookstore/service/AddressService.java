package com.xzl.bookstore.service;

import com.xzl.bookstore.pojo.po.Address;
import com.xzl.bookstore.pojo.po.User;
import com.xzl.bookstore.util.Result;

import java.util.List;

public interface AddressService {

    List<Address> searchByUserId(Integer userId);

    Result save(Address address);

    Result delete(Integer id);

    Result update(Address address);

    Address getById(Integer id);
}
