package com.example._07file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileController {
	
	@Value("${file.path}")
	private String filePath;
	@RequestMapping("/upload")
	@ResponseBody
	public String upload(MultipartFile file) throws Exception{
		
		String name = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
		String fileName = UUID.randomUUID().toString()+name;
		
		FileCopyUtils.copy(file.getInputStream(), new FileOutputStream(new File(filePath+fileName)));
		return fileName;
	}
}
