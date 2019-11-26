package com.h2t.study.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件处理控制层
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/11/26 20:24
 */
@RestController
@RequestMapping("/api/file")
public class FileController {
    public Object uploadFile(Long size, Integer chunks,
                             Integer chunk, @RequestParam("file") MultipartFile file) {
        return null;
    }
}
