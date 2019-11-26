package com.h2t.study.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * 文件业务接口类
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/11/26 20:27
 */
public interface FileService {
    /**
     * 文件分段上传
     *
     * @param size   总的文件大小
     * @param chunk  当前分段数
     * @param chunks 总的分段数
     * @param file   分段的文件
     */
    void upload(Long size, Integer chunks, Integer chunk, MultipartFile file);
}
