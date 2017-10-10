package cn.xidian.aemaip.utils;

import java.util.Date;
import java.util.Properties;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

import org.junit.Test;

/**
 * 1. 发送一封普通邮件
 * 
 * @author Jie.Yuan
 */
public class JavaMailSendUtil {
    
    @Test
    public void testSend() throws Exception {
        
        // 0. 邮件参数
        Properties prop = new Properties();
        prop.put("mail.transport.protocol", "smtp"); // 指定协议
        prop.put("mail.smtp.host", "smtp.163.com"); // 主机 stmp.qq.com
        prop.put("mail.smtp.auth", "true"); // 用户密码认证
        
        // 1. 创建一个邮件的会话
        Session session = Session.getDefaultInstance(prop);
        // 2. 创建邮件体对象 (整封邮件对象)
        MimeMessage message = new MimeMessage(session);
        // 3. 设置邮件体参数:
        // 3.1 标题
        message.setSubject("建筑工程多主体交互平台帐号授权");
        // 3.2 邮件发送时间
        message.setSentDate(new Date());
        // 3.3 发件人
        message.setSender(new InternetAddress("18829212334@163.com"));
        // 3.4 接收人
        message.setRecipient(RecipientType.TO,
                             new InternetAddress("ya834493393@foxmail.com"));
        // 3.5内容
        // message.setText("你好，已经发送成功！ 正文...."); // 简单纯文本邮件
        // 邮件中含有超链接
        // message.setText("<a href='#'>百度</a>");
        message.setContent("", "text/html;charset=UTF-8");
        
        message.saveChanges(); // 保存邮件(可选)
        
        // 4. 发送
        Transport trans = session.getTransport();
        trans.connect("18829212334@163.com", "lxing823");
        // 发送邮件
        trans.sendMessage(message, message.getAllRecipients());
        trans.close();
    }
}
