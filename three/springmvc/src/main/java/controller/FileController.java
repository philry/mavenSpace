package controller;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author:shixiaojun@itany.com
 * Date:2018/11/23 9:08
 * Description:
 * version:1.0
 */
@Controller
@RequestMapping("/file")
public class FileController {


    @RequestMapping("/upload")
    public void upload(@RequestParam("file") CommonsMultipartFile file, HttpSession session) throws IOException {
        System.out.println("文件名:"+file.getOriginalFilename());
        System.out.println("文件类型:"+file.getContentType());

        //获取服务器路径
        String path = session.getServletContext().getRealPath("/upload/"+new SimpleDateFormat("yyyyMMdd").format(new Date()));

        File f = new File(path);
        f.mkdirs();
        file.transferTo(new File(path,file.getOriginalFilename()));//file.getOriginalFilename()是获取文件名

    }

    @RequestMapping("/uploads")
    public void uploads(@RequestParam("file") CommonsMultipartFile[] files, HttpSession session) throws IOException {
        //获取服务器路径
        String path = session.getServletContext().getRealPath("/upload/"+new SimpleDateFormat("yyyyMMdd").format(new Date()));

        File f = new File(path);
        f.mkdirs();

        for(CommonsMultipartFile file : files){
            file.transferTo(new File(path,file.getOriginalFilename()));
        }

    }


    //返回值必须是ResponseEntity
    //且存在泛型，泛型的类型是当前文件在内存中的类型
    @RequestMapping("/download")
    public ResponseEntity<byte[]> download(HttpSession session) throws IOException {
        //获取文件
        String path = session.getServletContext().getRealPath("resource/commons-logging.jar");
        File file = new File(path);

        //设置头信息
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        headers.setContentDispositionFormData("attachment","commons-logging.jar");


        //ResponseEntity构造函数中包含多种
        //我们选择参数最全面的，共有三个参数
        //参数一:响应体,也就是你想要下载的文件
        //参数二:头信息
        //参数三:http状态
        return new ResponseEntity<byte[]>(
                FileUtils.readFileToByteArray(file),
                        headers,
                        HttpStatus.CREATED);
    }
}
