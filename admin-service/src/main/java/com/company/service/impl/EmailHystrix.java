package com.company.service.impl;

import com.company.domain.Email;
import com.company.domain.Question;
import com.company.service.EmailFeignClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailHystrix implements EmailFeignClient {
    @Override
    public Boolean sendLetterByEmail(Question question){
        return false;
    }
}