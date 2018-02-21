package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import com.model.JMessage;
import com.DAO.MessageRepository;

import java.io.IOException;

@Controller
@RequestMapping("/")
public class RestControll {

    @Autowired
    private MessageRepository messageRepository;

    @RequestMapping(method = RequestMethod.POST)
    public String send(@RequestParam MultipartFile file) throws IOException {

        String message=new String(file.getBytes());
        messageRepository.save(new JMessage(message));
        System.out.println(message);

        return "send";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String get(Model model){
        return "index";
    }
}
