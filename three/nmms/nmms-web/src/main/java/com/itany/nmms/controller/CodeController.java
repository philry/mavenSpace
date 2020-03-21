package com.itany.nmms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/10/30 15:30
 * Description:
 * version:1.0
 */
@Controller
@RequestMapping("/show")
public class CodeController {

    @RequestMapping("/code")
    public void show(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Random random = new Random();

        //在内存中创建一个图片数据缓冲区,可以将其理解为一个画板
        BufferedImage image = new BufferedImage(63, 30, BufferedImage.TYPE_INT_RGB);

        //获取当前画板中的画笔
        Graphics graphics = image.getGraphics();

        //填充指定的矩形
        graphics.fillRect(0, 0, 63, 38);

        //设置画笔的颜色
        //设置随机颜色
        //使用RGB色系
        graphics.setColor(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));

        //设置字体的样式
        graphics.setFont(new Font("宋体", Font.BOLD+Font.ITALIC, 22));

        //随机生成0-9a-z
        String s = "1234567890qwertyuiopasdfghjklzxcvbnm";
        StringBuffer code = new StringBuffer();
        for(int i = 0; i < 4; i++){
            code.append(s.charAt(random.nextInt(s.length())));
        }

        request.getSession().setAttribute("code", code.toString());


        //将随机数绘制到图片中
        graphics.drawString(code.toString(), 7, 20);


        //将缓冲区中的图片写出来
        ImageIO.write(image, "JPEG", response.getOutputStream());
    }

}
