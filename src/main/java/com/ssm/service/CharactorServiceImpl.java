package com.ssm.service;

import com.ssm.dao.CharactorMapper;
import com.ssm.pojo.Charactor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Repository("charactorService")
@Service
public class CharactorServiceImpl implements CharactorService{
    @Autowired
    private CharactorMapper charactorMapper;

    @Override
    public List<Charactor> findAll(){
        return charactorMapper.findAll();
    }
}
