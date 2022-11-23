package com.example.StoodyDemo.utility;

import com.example.StoodyDemo.model.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class EmailUtil {
    private JavaMailSender javaMailSender;
    private final String FROM = "Some Text";

    public void notifyEmployeesByEmail(long id, List<User> user){
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setFrom(FROM);
        for(User users : user){
            msg.setTo(users.getEmail());
        }
        msg.setSubject("New Task: #" + id);
        msg.setText("Task: #" + id + " Has Been Assigned To You");

        javaMailSender.send(msg);
    }
}
