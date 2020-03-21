package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/file")
public class FileController {
    @RequestMapping("/upload")
    public void upload(@RequestParam("file") CommonsMultipartFile file, HttpSession session) throws IOException {
        String path=session.getServletContext().getRealPath("/upload/"+new SimpleDateFormat("yyyyMMdd").format(new Date()));
        File f=new File(path);  //创建file类型的文件，这里的File是文件夹
        f.mkdirs(); //如果不存在这个文件夹，就创建
        file.transferTo(new File(path,file.getOriginalFilename()));//这里的File是文件
                                        //file.getOriginalFilename()是获取文件名
    }
}
